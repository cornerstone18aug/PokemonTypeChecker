package contoller;

import dao.PokemonDAO;
import model.Pokemon;

/**
 * Created by katayama on 2018/11/20.
 */
public class PokemonContoller {
    Pokemon pokemon;
    PokemonDAO pdao = new PokemonDAO();
    public Pokemon serch(String inputName) {
        pokemon = pdao.search(inputName);
        return pokemon;
    }
}
