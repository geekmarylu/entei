package com.payments.entei;

/**
 * Main service class
 */
public class Entei {

    //TODO - logger object - find a replacement for Log4J due to the vulnerability

    public static void main (String []args){
        try {
            System.out.println("Hi there John, Nvulane and Kevin,");
            System.out.println("Lucelle Mary's brain service is unable to start the Entei loader service :( ");
            System.out.println("I am sincerely sorry that I could not follow through and nail this, John.");
            System.out.println("Thank you for believing in me, I am truly honoured to have met yourself.");
            System.out.println("I hope that when I have more confidence, and believe in myself, I will be able to apply to Entersekt again.");
            System.out.println("Yours sincerely,");
            System.out.println("Lucelle Mary Naidoo");


        }
        catch (Exception ex){
            System.out.println("Failed to start Entei: " + ex.getMessage());
        }
    }

}