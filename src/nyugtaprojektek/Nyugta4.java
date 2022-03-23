package nyugtaprojektek;

public class Nyugta4 {

    public static void main(String[] args) {
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        int osszesen = tetel1 + tetel2 + tetel3;
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        int fizetendo = osszesen + szervizDij;
        double euro = fizetendo / 350.0;
        final String HUF = "Ft";
        final String eur = "\u20ac";
        String csillagok = "********************";
        String duplaVonal = "====================";
        String szaggatottVonal = "--------------------";
        String rovidVonal = "_______";
        String rovidVonalValaszto = String.format("%6s","");

        String egesz = "";
        egesz += (csillagok + "\n");
        egesz += String.format("%14s\n", "Nyugta 4");
        egesz += (csillagok + "\n");
        egesz += (String.format("%10s:%5d %1s\n", "Tétel 1", tetel1, HUF));
        egesz += (String.format("%10s:%5d %1s\n", "Tétel 2", tetel2, HUF));
        egesz += (String.format("%10s:%5d %1s\n", "Tétel 2", tetel3, HUF));
        egesz += (duplaVonal + "\n");
        egesz += (String.format("%10s:%5d %1s\n", "Összesen", osszesen, HUF));
        egesz += (szaggatottVonal + "\n");
        egesz += (String.format("%10s:%5d %1s\n", "Szervízdíj", szervizDij, HUF));
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
        egesz += String.format("%3sNév\n","");
        egesz += (csillagok + "\n");
        egesz += String.format("%8sCÉG\n","");
        egesz += (csillagok + "\n");
        System.out.println(egesz);
    }

}
