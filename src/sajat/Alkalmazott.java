package sajat;

public class Alkalmazott {

    private String nev;
    private int fizetes;
    private int munkatapasztalat;
    protected enum Beosztas {
        JUNIOR,
        SENIOR,
        MANAGER
    }
    private Beosztas beosztas;

    public Alkalmazott(String nev, int fizetes, int munkatapasztalat, Beosztas beosztas) {
        this.nev = nev;
        this.fizetes = fizetes;
        this.munkatapasztalat = munkatapasztalat;
        this.beosztas = beosztas;
    }

    @Override
    public String toString() {
        return "Alkalmazott{" +
                "Nev:" + nev + '\'' +
                ", Fizetes:" + fizetes +
                ", Munkatapasztalat:" + munkatapasztalat +
                ", Beosztas:" + beosztas +
                '}';
    }

    public String getNev() {
        return nev;
    }

    public int getFizetes() {
        return fizetes;
    }

    public int getMunkatapasztalat() {
        return munkatapasztalat;
    }

    public Beosztas getBeosztas() {
        return beosztas;
    }

    public class Osszehasonlit{

        public void osszehasonlito(Alkalmazott egyik, Alkalmazott masik){
            if (egyik.fizetes > masik.fizetes || egyik.munkatapasztalat > masik.munkatapasztalat){
                System.out.println(egyik + "jobb fejleszto");
            }
            else
                System.out.println(masik + "jobb fejleszto");
        }


    }
}
