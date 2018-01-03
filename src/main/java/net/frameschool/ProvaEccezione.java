package net.frameschool;

/**
 * Created by thunder on 03/01/18.
 */

public class ProvaEccezione {

    public static void main(String args[]) {
        int x=1;
        int y=0;

        Float divisione = null;

        try {

        // divisione.intValue();

            divisione = (float) x/y;

            System.out.println("Il risultato della divisione è:" + divisione);

        }catch (ArithmeticException exc) {

            System.out.println("Non puoi effettuare una divisione per zero");

        }catch (Exception exc) {

        // exc.printStackTrace();

            System.out.println("Errore generico");
        }
    }

}
