package entity;

import model.Pokemon;

/**
 * Created by katayama on 2018/11/20.
 */
public class TypeEnum {
    public String setPokemonType1(String type1) {
        String typeOutPut = originalType(type1);
        return typeOutPut;
    }

    public String setPokemonType2(String type2) {
        String typeOutPut = originalType(type2);
        return typeOutPut;
    }


    public String originalType(String type) {
        switch (type) {
            case "1":
                type = "Normal";
                break;
            case "2":
                type = "Fire";
                break;
            case "3":
                type = "Water";
                break;
            case "4":
                type = "Electric";
                break;
            case "5":
                type = "Grass";
                break;
            case "6":
                type = "Ice";
                break;
            case "7":
                type = "Fighting";
                break;
            case "8":
                type = "Poison";
                break;
            case "9":
                type = "Ground";
                break;
            case "10":
                type = "Flying";
                break;
            case "11":
                type = "Psychic";
                break;
            case "12":
                type = "Bug";
                break;
            case "13":
                type = "Rock";
                break;
            case "14":
                type = "Ghost";
                break;
            case "15":
                type = "Dragon";
                break;
            case "16":
                type = "Dark";
                break;
            case "17":
                type = "Steel";
                break;
            case "18":
                type = "Fairy";
                break;
            default:
                break;
        }
        return type;
    }
}
