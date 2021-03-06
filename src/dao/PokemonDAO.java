package dao;

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
    static String PW = "pokemon";

    public Pokemon search(String inputName) {
        Pokemon pokemon = new Pokemon();
        try {
            String SQL = "SELECT * FROM pokemon WHERE name = '" + inputName + "'";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PW);


            st = con.prepareStatement(SQL);
            rs = st.executeQuery();

            while (rs.next()) {
                pokemon.setId(rs.getInt(1));
                pokemon.setName(rs.getString(2));
                pokemon.setType1(rs.getString(3));
                pokemon.setType2(rs.getString(4));
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
