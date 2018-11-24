package entity;

import model.Pokemon;

/**
 * Created by katayama on 2018/11/20.
 */
public class TypeEnum {
    public String setPokemonType1(String type1) {
        switch (type1) {
            case "1":
                type1 = "Water";
                break;
            case "2":
                type1 = "Fire";
                break;
            case "3":
                type1 = "Electrical";
                break;
            case "4":
                type1 = "Grass";
                break;
            case "5":
                type1 = "Ground";
                break;
            case "6":
                type1 = "Fairy";
                break;
            case "7":
                type1 = "Bug";
                break;
            case "8":
                type1 = "Poison";
                break;
            default:
                break;
        }
        return type1;
    }

    public String setPokemonType2(String type2) {
        switch (type2) {
            case "1":
                type2 = "Water";
                break;
            case "2":
                type2 = "Fire";
                break;
            case "3":
                type2 = "Electrical";
                break;
            case "4":
                type2 = "Grass";
                break;
            case "5":
                type2 = "Ground";
                break;
            case "6":
                type2 = "Fairy";
                break;
            case "7":
                type2 = "Bug";
                break;
            case "8":
                type2 = "Poison";
                break;
            default:
                break;
        }
        return type2;
    }
}
