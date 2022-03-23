package nyugtaprojektek;

public class Nyugta2 {

    public static void main(String[] args) {
        String csillagok = "*******************";
        String rovidVonal = "_______";
        String rovidVonalValaszto = "\t";
        String szaggatottVonal = "-------------------";
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        int osszesen = tetel1 + tetel2 + tetel3;
        int kedvMertek = 10;
        int kedvezmeny = osszesen / kedvMertek;
        int fizetendo = osszesen - kedvezmeny;
        double euro =fizetendo / 371.0;
        double value = 200.3456;
        String huf = "Ft";
        String eurojel= "\u20ac";
        System.out.println(csillagok);
        System.out.println("      Nyugta 2");
        System.out.println(csillagok);
        System.out.printf("Tétel 1:     %d %s\n", tetel1, huf);
        System.out.printf("Tétel 1:      %d %s\n", tetel2, huf);
        System.out.printf("Tétel 3:    %d %s\n", tetel3, huf);
        String duplaVonal = "===================";
        System.out.println(duplaVonal);
        System.out.printf("Összesen:   %d %s\n", osszesen, huf);
        System.out.println(szaggatottVonal);
        System.out.printf("Kedvezmény:  %d %s\n", kedvezmeny, huf);
        System.out.printf("(%d%%)\n", kedvMertek);
        System.out.println(duplaVonal);
        System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
        System.out.printf("            %.2f \u20ac", euro);
        System.out.println("\n"+szaggatottVonal);
        System.out.println("");
        System.out.print(rovidVonal);
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);
        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);
        System.out.println("   Név");
        System.out.println(csillagok);
        System.out.println("        CÉG");
        System.out.println(csillagok);
    }

}
