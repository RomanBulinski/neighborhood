package model;

public class PlacesBuilder {

    State state;
    County county;
    Locality locality;

    ImportCSV importCSV = new ImportCSV();
    String stringOfPlaces = importCSV.importData( "src/source/malopolska.csv");

    public String[] splitowanie(){
        ImportCSV importCSV = new ImportCSV();
        String stringOfPlaces = importCSV.importData( "src/source/malopolska.csv");
        String[] placesLines = stringOfPlaces.split("\n");
        for (String line : placesLines){
            String[] detalInfo = line.split("\t");
            System.out.println("**********************************************");
            System.out.println(detalInfo.length);
            System.out.println("------");
            int x = 1;
            for( String atomInfo : detalInfo){
                System.out.print("pozycja : "+x+" ");
                System.out.println(atomInfo);
                x++;
            }
        }
    }



}
