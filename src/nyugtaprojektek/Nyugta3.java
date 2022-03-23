package nyugtaprojektek;

/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
 */
public class Nyugta3 {

    public static void main(String[] args) {

        String csillagok = "********************";
        final String HUF = "Ft";
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        String duplaVonal = "====================";
        int osszesen = tetel1 + tetel2 + tetel3;
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        int fizetendo = osszesen + szervizDij;
        double euro = fizetendo / 350.0;
        final String eur = "\u20ac";
        String szaggatottVonal = "--------------------";
        String rovidVonal = "_______";
        String rovidVonalValaszto = "      ";
        String egesz = "";
        
        egesz += (csillagok + "\n");
        egesz += String.format("%14s\n", "Nyugta 3");
        egesz += (csillagok + "\n");
        egesz += (String.format("%10s:%5d %1s\n", "Tétel 1", tetel1, HUF));
        egesz += (String.format("%10s:%5d %1s\n", "Tétel 2", tetel2, HUF));
        egesz += (String.format("%10s:%5d %1s\n", "Tétel 2", tetel3, HUF));
        egesz += (duplaVonal + "\n");
        egesz += (String.format("%10s: %5d %s\n", "Összesen", osszesen, HUF));
        egesz += (szaggatottVonal + "\n");
        egesz += (String.format("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF));
        egesz += (String.format("(%d%%)\n", szervizDijMertek));
        egesz += (duplaVonal + "\n");
        egesz += (String.format("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF));
        egesz += (String.format("%10s%7.2f %s\n", "", euro, eur));
        egesz += (szaggatottVonal + "\n");
        egesz += ("\n");
        egesz += (rovidVonal);
        egesz += (rovidVonalValaszto);
        egesz += (rovidVonal + "\n");
        egesz += (" Dátum");
        egesz += (rovidVonalValaszto);
        egesz += ("   Név\n");
        egesz += (csillagok + "\n");
        egesz += ("        CÉG\n");
        egesz += (csillagok + "\n");
        System.out.println(egesz);
    }

}
