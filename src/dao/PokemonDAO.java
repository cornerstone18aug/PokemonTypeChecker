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

    private List<String> allPokemonName;

    static String URL = "jdbc:mysql://localhost:3306/pokemon?useUnicode=true&characterEncoding=utf8";
    static String USER = "root";
    static String PW = "test";

    public Pokemon search(String inputName) {
        Pokemon pokemon = new Pokemon();
        TypeEnum typeEnum = new TypeEnum();
        try {
            String SQL = "SELECT * FROM pokemon WHERE name = '" + inputName + "'";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PW);


            st = con.prepareStatement(SQL);
            rs = st.executeQuery();

            while (rs.next()) {
                pokemon.setId(rs.getInt(1));
                pokemon.setName(rs.getString(2));
                pokemon.setType1(typeEnum.setPokemonType1(String.valueOf(rs.getInt(3))));
                pokemon.setType2(typeEnum.setPokemonType2(String.valueOf(rs.getInt(4))));
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

    public List allName() {
        try {
            allPokemonName = new ArrayList<>();
            String SQL = "SELECT * FROM pokemon";
            con = DriverManager.getConnection(URL, USER, PW);


            st = con.prepareStatement(SQL);
            rs = st.executeQuery();

            while (rs.next()) {
                allPokemonName.add(rs.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return allPokemonName;
    }
}
