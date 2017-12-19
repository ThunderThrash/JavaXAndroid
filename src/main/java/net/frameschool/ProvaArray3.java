package net.frameschool;

/**
 * Created by thunder on 19/12/17.
 */

public class ProvaArray3 {

    public static void main(String args[]) {
        int x[][] = new int[2][2];

        // assegnamo i valori a x[i][j]

        for(int i=0; i<=1; i++) {
            for(int j=0; j<=1; j++) {
                x[i][j] = i+j;
            }
        }

        for(int i=0; i<=1; i++) {
            for(int j=0; j<=1; j++) {
                System.out.println("x["+i+","+j+"] = "+x[i][j]);
            }
        }

        // Proviamo anche con le Stringhe

        String st[][]={{"riga 0 colonna 0","riga 0 colonna 1"},
                {"riga 1 colonna 0","riga 1 colonna 1"}};

        // scriviamo a schermo i valori

        for(int i=0; i<=1; i++)
            for(int j=0; j<=1; j++)
                System.out.println("st["+i+","+j+"] = "+st[i][j]);
    }
}
