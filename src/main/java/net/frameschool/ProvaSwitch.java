package net.frameschool;

/**
 * Created by thunder on 19/12/17.
 */

public class ProvaSwitch {

    public static void main(String args[]){

        int k = 10;

        switch(k){
            case 5: System.out.println("case k = 5");
                break;

            case 10: System.out.println("case k = 10");
                break;

            case 15: System.out.println("case k = 15");
                break;

            default: System.out.println("case default");
        }

        //quanto sopra è equivalente a quanto segue:
        if(k==5){
            System.out.println("case k = 5");

        } else if(k==10){
            System.out.println("case k = 10");

        } else if(k==15){
            System.out.println("case k = 15");

        } else{
            System.out.println("default");

        }

    }
}
