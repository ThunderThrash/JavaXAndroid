package net.frameschool;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by thunder on 19/12/17.
 */

public class ProvaArrayList1 {

    public static void main(String args[]) {

        ArrayList<Integer> x = new ArrayList<>();

        for (int i=0; i<=9; i++) {

            x.add(i) ;
        }

        for (int i=0; i<=9; i++) {

            System.out.println("x["+i+"] = "+x.get(i));
        }

        // esempio di un ArrayList di Stringhe
        ArrayList<String> stringa = new ArrayList<>(
                Arrays.asList("primo","secondo","terzo"));

        for (int i=0; i<=2; i++)
            System.out.println("stringa["+i+"] = "+stringa.get(i));
    }
}
