package model;
/**
 * Created by katayama on 2018/11/20.
 */
public class Pokemon {
    private int id;
    private String name;
    private int type1;
    private int type2;
    private String image;
    private String roar;

    public Pokemon(){}

    public Pokemon(int id, String name, int type1, int type2, String image, String roar) {
        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.image = image;
        this.roar = roar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType1() {
        return type1;
    }

    public void setType1(int type1) {
        this.type1 = type1;
    }

    public int getType2() {
        return type2;
    }

    public void setType2(int type2) {
        this.type2 = type2;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRoar() {
        return roar;
    }

    public void setRoar(String roar) {
        this.roar = roar;
    }
}
