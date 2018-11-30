package jTest;

import dao.PokemonDAO;
import model.Pokemon;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PokemonDAOTest {

    @Test
    void search() {
        Pokemon pokemon1 = new PokemonDAO().search("Pikachu");
        assertEquals(25, pokemon1.getId());
        assertEquals("Pikachu", pokemon1.getName());
        assertEquals("4", pokemon1.getType1());
        assertEquals("0", pokemon1.getType2());
        assertEquals("img/025Pikachu.png", pokemon1.getImage());
        assertEquals("sound/025.wav", pokemon1.getRoar());

        Pokemon pokemon2 = new PokemonDAO().search("");
        assertEquals(0, pokemon2.getId());
        assertEquals(null, pokemon2.getName());
        assertEquals(null, pokemon2.getType1());
        assertEquals(null, pokemon2.getType2());
        assertEquals(null, pokemon2.getImage());
        assertEquals(null, pokemon2.getRoar());

    }

    @Test
    void allName() {
        List<Pokemon> pokemonList = new PokemonDAO().allName();
        assertEquals(151, pokemonList.size());
    }
}