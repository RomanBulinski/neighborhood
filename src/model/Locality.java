package model;

public class Locality {


    private String nameOfLocality;
    private String typeOfLocality;
    private int lenghtOfName;


    public Locality(String nameOfLocality, String typeOfLocality, int lenghtOfName) {
        this.nameOfLocality = nameOfLocality;
        this.typeOfLocality = typeOfLocality;
        this.lenghtOfName = lenghtOfName;
    }

    public int getLenghtOfName() {
        return lenghtOfName;
    }

    public String getTypeOfLocality() {
        return typeOfLocality;
    }

    public String getNameOfLocality() {
        return nameOfLocality;
    }


}
