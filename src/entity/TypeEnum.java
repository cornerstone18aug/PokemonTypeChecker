package entity;

import model.Pokemon;

/**
 * Created by katayama on 2018/11/20.
 */
public class TypeEnum {
    private int type1;
    private int type2;
    Pokemon pokemon = new Pokemon();

    public TypeEnum(int type1, int type2) {
        this.type1 = type1;
        this.type2 = type2;
    }

    public void setPokemonType1() {
        switch (type1) {
            case 1:
                pokemon.setType1("Water");
                break;
            case 2:
                pokemon.setType1("Fire");
                break;
            case 3:
                pokemon.setType1("Electrical");
                break;
            case 4:
                pokemon.setType1("Grass");
                break;
            case 5:
                pokemon.setType1("Ground");
                break;
            case 6:
                pokemon.setType1("Fairy");
                break;
            case 7:
                pokemon.setType1("Bug");
                break;
            case 8:
                pokemon.setType1("Poison");
                break;
            default:
                break;
        }
    }

    public void setPokemonType2() {
        switch (type1) {
            case 1:
                pokemon.setType1("Water");
                break;
            case 2:
                pokemon.setType1("Fire");
                break;
            case 3:
                pokemon.setType1("Electrical");
                break;
            case 4:
                pokemon.setType1("Grass");
                break;
            case 5:
                pokemon.setType1("Ground");
                break;
            case 6:
                pokemon.setType1("Fairy");
                break;
            case 7:
                pokemon.setType1("Bug");
                break;
            case 8:
                pokemon.setType1("Poison");
                break;
            default:
                break;
        }
    }
}
