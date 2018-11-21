package entity;
/**
 * Created by katayama on 2018/11/20.
 */
public class TypeEnum {
    private int type1;

    public TypeEnum(int type1) {
        this.type1 = type1;
    }

    public void setPokemonTypes() {
        switch (type1) {
            case 1:
                System.out.println("Water");
                break;
            case 2:
                System.out.println("Fire");
                break;
            case 3:
                System.out.println("Electrical");
                break;
            case 4:
                System.out.println("Grass");
                break;
            case 5:
                System.out.println("Ground");
                break;
            case 6:
                System.out.println("Fairy");
                break;
            case 7:
                System.out.println("Bug");
                break;
            case 8:
                System.out.println("Poison");
                break;
            default:
                break;
        }
    }
}
