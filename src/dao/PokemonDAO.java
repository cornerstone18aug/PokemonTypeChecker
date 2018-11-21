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

    static String URL = "jdbc:mysql://127.0.0.1:3306/pokemon?useUnicode=true&characterEncoding=utf8";
    static String USER = "root";
    static String PW = "908447";

    public List<Pokemon> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM pokemondata";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PW);

            st = con.prepareStatement(SQL);
            rs = st.executeQuery();

            while (rs.next()) {
                Pokemon pokemon = new Pokemon(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7));
                pokemons.add(pokemon);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pokemons;
    }

    public List<Pokemon> search(String inputName) {
        List<Pokemon> pokemons = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM pokemondata WHERE name = '" + inputName + "'";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PW);

            st = con.prepareStatement(SQL);
            rs = st.executeQuery();

            while (rs.next()) {
                Pokemon pokemon = new Pokemon(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7));
                pokemons.add(pokemon);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pokemons;
    }
}
