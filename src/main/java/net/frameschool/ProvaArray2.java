package net.frameschool;

/**
 * Created by thunder on 19/12/17.
 */

public class ProvaArray2 {

    public static void main(String args[]) {
        float numero[] = {2.5f, 4.5f, 8.9f, 5.0f, 8.9f};

        // notate la definizione di float con la f come
        // ultimo carattere del valore

        float somma = 0.0f;
        for(int i=0; i<= 4; i++)
            somma = somma + numero[i];

        System.out.println("somma = " + somma);
    }
}
