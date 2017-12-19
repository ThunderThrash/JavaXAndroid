package net.frameschool;

/**
 * Created by thunder on 19/12/17.
 */

public class ProvaArray1 {

    public static void main(String args[]) {
        int x[] = new int[10];
        for (int i=0; i<=9; i++) {
            x[i] = i;
        }

        for (int i=0; i<=9; i++) {
            System.out.println("x["+i+"] = "+x[i]);
        }

        // esempio di un Array di Stringhe

        String stringa[] = {"primo","secondo","terzo"};
        for (int i=0; i<=2; i++)
            System.out.println("stringa["+i+"] = "+stringa[i]);
    }
}
