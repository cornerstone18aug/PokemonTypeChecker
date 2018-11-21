package contoller;

import dao.PokemonDAO;
import entity.TypeEnum;
import model.Pokemon;

import java.util.List;
import java.util.Scanner;
/**
 * Created by katayama on 2018/11/20.
 */
public class PokemonContoller {
    public static void main(String[] args) {
        List<Pokemon> pokemons;
        PokemonDAO pdao = new PokemonDAO();
        System.out.println("----------Chose----------");
        System.out.println("s:Search");
        System.out.println("a:ALL");
        System.out.println("q:Quit");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        do {
            if(input.equals("s")) {
                System.out.println("Enter PokemonName");
                String inputName = sc.nextLine();
                pokemons = pdao.search(inputName);
                if(pokemons.isEmpty()) {
                    System.out.println("It doesn't have");
                } else {
                    for (Pokemon pokemon : pokemons) {
                        System.out.println("ID: " + pokemon.getId());
                        System.out.println("NAME: " + pokemon.getName());
                        System.out.println("CATEGORY: " + pokemon.getCategory());
                        System.out.print("TYPE: ");
                        TypeEnum typeEnum = new TypeEnum(pokemon.getType1());
                        typeEnum.setPokemonTypes();
                        System.out.println("TYPE: " + pokemon.getType2());
                        System.out.println("IMAGE: " + pokemon.getImage());
                        System.out.println("ROAR: " + pokemon.getRoar());
                        System.out.println("");
                    }
                }
            }
            if(input.equals("a")) {
                pokemons = pdao.getPokemons();
                for (Pokemon pokemon : pokemons) {
                    System.out.println("ID: " + pokemon.getId());
                    System.out.println("NAME: " + pokemon.getName());
                    System.out.println("CATEGORY: " + pokemon.getCategory());
                    System.out.print("TYPE: ");
                    TypeEnum typeEnum = new TypeEnum(pokemon.getType1());
                    typeEnum.setPokemonTypes();
                    System.out.println("TYPE: " + pokemon.getType2());
                    System.out.println("IMAGE: " + pokemon.getImage());
                    System.out.println("ROAR: " + pokemon.getRoar());
                    System.out.println("");
                }
            }

            System.out.println("----------Chose----------");
            System.out.println("s:Search");
            System.out.println("a:ALL");
            System.out.println("q:Quit");
            input = sc.nextLine();
        } while (!input.equals("q"));

    }

}
