package sajat;

import java.io.*;

public class Futtathato {


    private static Tarolo alkalmazottak = new Tarolo();

    public static void main(String []args){

        File f = new File("adatok.txt");

        if (!f.isFile()){
            System.out.println("A fajl hibas vagy nem letezik");
            return;
        }

        try {
            beolvas(f);
            alkalmazottak.alkalmazottKiir();
            fajlKiiras("kiir.txt");

            Alkalmazott keresett = alkalmazottak.nevalapjanKeres("Balogh Attila");

            if(keresett == null){
                System.out.println("Nincs ilyen felhasznalo");
            }

            System.out.println("A keresett: " + keresett);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        alkalmazottak.seniorok();
    }

    public static void beolvas(File beFajl) throws IOException{
        BufferedReader in = null;
        String sor;
        String nev;
        String fizetes;
        String munkatapasztalat;
        String beosztas;

        try {
            in = new BufferedReader(new FileReader(beFajl));

            while ((sor = in.readLine()) != null){

                String []tomb = sor.split(", ");
                nev = tomb[0];
                fizetes = tomb[1];
                munkatapasztalat = tomb[2];
                beosztas = tomb[3];

                alkalmazottak.alkalmazottHozzaadas(new Alkalmazott(nev, Integer.parseInt(fizetes),
                        Integer.parseInt(munkatapasztalat), Alkalmazott.Beosztas.valueOf(beosztas)));
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }

    public static void fajlKiiras(String fajlnev){
        Writer write;

        try {
            write = new FileWriter(fajlnev);

            for (Alkalmazott alkalmazott: alkalmazottak.getAlkalmazottak()){
                write.write(alkalmazott.getNev() + ", " + alkalmazott.getFizetes() +", " +
                        alkalmazott.getMunkatapasztalat()+ ", " +alkalmazott.getBeosztas() + "\n");
            }
            write.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

