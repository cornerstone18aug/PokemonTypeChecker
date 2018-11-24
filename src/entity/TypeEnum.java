package entity;
/**
 * Created by katayama on 2018/11/20.
 */
public class TypeEnum {
    private int type1;

    public TypeEnum(int type1) {
        this.type1 = type1;
    }

    public String setPokemonTypes() {
        switch (type1) {
            case 1:
                System.out.println("Normal");
                break;
            case 2:
                System.out.println("Grass");
                break;
            case 3:
                System.out.println("Water");
                break;
            case 4:
                System.out.println("Fire");
                break;
            case 5:
                System.out.println("Electric");
                break;
            case 6:
                System.out.println("Fighting");
                break;
            case 7:
                System.out.println("Flying");
                break;
            case 8:
                System.out.println("Ground");
                break;
            case 9:
                System.out.println("Rock");
                break;
            case 10:
                System.out.println("Dark");
                break;
            case 11:
                System.out.println("Ghost");
                break;
            case 12:
                System.out.println("Bug");
                break;
            case 13:
                System.out.println("Dragon");
                break;
            case 14:
                System.out.println("Ice");
                break;
            case 15:
                System.out.println("Steel");
                break;
            case 16:
                System.out.println("Fairy");
                break;
            case 17:
                System.out.println("Poison");
                break;
            case 18:
                System.out.println("Phychic");
                break;
            default:
                break;
        }
        return setPokemonTypes();
    }
}
