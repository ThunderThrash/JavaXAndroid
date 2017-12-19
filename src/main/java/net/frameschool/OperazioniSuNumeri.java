package net.frameschool;

/**
 * Created by thunder on 19/12/17.
 */

public class OperazioniSuNumeri {

    public int numeroX;
    public int numeroY;

    public OperazioniSuNumeri() {
        System.out.println("Ho istanziato una classe OperazioniSuNumeri");
    }

    public OperazioniSuNumeri(int x, int y) {
        numeroX=x;
        numeroY=y;

        System.out.println("Ho istanziato una classe OperazioniSuNumeri: x="+numeroX+", y="+numeroY);
    }

    public int sottrazione (int x, int y){
        int sottrazione;
        sottrazione=x-y;
        return sottrazione;
    }

    public int sottrazione (){
        int sottrazione;
        sottrazione=numeroX-numeroY;
        return sottrazione;
    }

    public String comparazione (int x, int y){
        if(x>y){
            String esito="il numero: " + x + " è maggiore del numero " + y;
            return esito;
        }
        else{
            String esito="il numero: " + y + " è maggiore del numero " + x;
            return esito;
        }
    }


    public static void main(String args[]){

        //Istanza della classe OperazionisuNumeri
        OperazioniSuNumeri operazioni;
        operazioni = new OperazioniSuNumeri();

        int sottrazione = operazioni.sottrazione(10,2); //richiamo il metodo sottrazione
        String esitoComparazione = operazioni.comparazione(8,3); //richiamo il metodo comparazione

        //stampo a video i risultati ottenuti
        System.out.println(esitoComparazione);
        System.out.println("Risultato sottrazione: " +sottrazione);


        operazioni = new OperazioniSuNumeri(9,2);

        sottrazione = operazioni.sottrazione(); //richiamo il metodo sottrazione

        //stampo a video i risultati ottenuti
        System.out.println("Risultato seconda sottrazione: " +sottrazione);

    }

}
