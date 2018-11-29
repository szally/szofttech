package sajat;

import java.util.ArrayList;

public class Tarolo {

    ArrayList<Alkalmazott> alkalmazottak = new ArrayList<Alkalmazott>();

    public Tarolo() {
        this.alkalmazottak = alkalmazottak;
    }

    public ArrayList<Alkalmazott> getAlkalmazottak() {
        return alkalmazottak;
    }

    public void setAlkalmazottak(ArrayList<Alkalmazott> alkalmazottak) {
        this.alkalmazottak = alkalmazottak;
    }


    public void alkalmazottHozzaadas(Alkalmazott alkalmazott){
        if (alkalmazott == null)
            return;
        if (this.alkalmazottak.contains(alkalmazott))
            return;

        this.alkalmazottak.add(alkalmazott);

    }

    public void alkalmazottTorol(Alkalmazott alkalmazott){
        if (alkalmazott == null)
            return;
        if (this.alkalmazottak.contains(alkalmazott))
            return;

        this.alkalmazottak.remove(alkalmazott);
    }

    public void alkalmazottKiir(){
        for (Alkalmazott alkalmazott : this.alkalmazottak){
            System.out.println(alkalmazott.toString());
        }
    }

    public void szoftverfejlesztoSzam(int db){
        db = 0;

        for (Alkalmazott alkalmazott : this.alkalmazottak) {
            if (alkalmazottak.contains(alkalmazott)) {
                db++;
            }
            else if (alkalmazottak.contains(null))
                System.out.println("Nincs tagja a listanak");
        }

        System.out.println("Alkalmazottak szama:" + db);
    }

    public Alkalmazott nevalapjanKeres(String keresettAlkalmazott) {
        for (Alkalmazott alkalmazott : this.alkalmazottak){
            if (alkalmazott.getNev().equalsIgnoreCase(keresettAlkalmazott)){
                return alkalmazott;
            }

        }
        return null;
    }

    public void nevalapjanTorol(String alk){
        for (Alkalmazott alkalmazott : this.alkalmazottak){
            if (alkalmazott.getNev().equalsIgnoreCase(alk)){
                this.alkalmazottak.remove(alk);
            }
        }
    }


    public void seniorok(){
        for (Alkalmazott alkalmazott : this.alkalmazottak){
            if (alkalmazott.getBeosztas() == Alkalmazott.Beosztas.SENIOR)
                System.out.println("Senior:" + alkalmazott);
        }

    }
}
