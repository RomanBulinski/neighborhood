import model.ImportCSV;

public class Main {


    public void test(){
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
                System.out.print("posytion "+x+" : ");
                System.out.println(atomInfo);
                x++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello man!!");

        Main main = new Main();
        main.test();
    }

}
