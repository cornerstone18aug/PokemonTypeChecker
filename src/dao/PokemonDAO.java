package dao;

import entity.TypeEnum;
import model.Pokemon;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by katayama on 2018/11/20.
 */
public class PokemonDAO {

    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    static String URL = "jdbc:mysql://127.0.0.1:3306/pokemon?useUnicode=true&characterEncoding=utf8";
    static String USER = "root";
    static String PW = "";

    public Pokemon search(String inputName) {
        Pokemon pokemon = new Pokemon();
        TypeEnum typeEnum;
        try {
            String SQL = "SELECT * FROM pokemondata WHERE name = '" + inputName + "'";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PW);

            st = con.prepareStatement(SQL);
            rs = st.executeQuery();

            while (rs.next()) {
                pokemon.setId(rs.getInt(1));
                pokemon.setName(rs.getString(2));
                typeEnum = new TypeEnum(rs.getInt(3), rs.getInt(4));
                typeEnum.setPokemonType1();
                pokemon.setType1(pokemon.getType1());
                typeEnum.setPokemonType2();
                pokemon.setType2(pokemon.getType2());
                pokemon.setImage(rs.getString(5));
                pokemon.setRoar(rs.getString(6));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pokemon;
    }
}
