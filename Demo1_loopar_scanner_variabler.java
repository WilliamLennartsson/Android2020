package com.devCakeAB;

import java.util.Scanner;

public class Main {

    // Uppgifter
    /*
        Skapa ett program där:
            - Användaren matar in två tal och programmet skriver ut resultatet (a + b)
            - Skapa tre olika typer av variabler. Jämför varje variabel ett värde av samma typ
            int number == number2
            String word == word2
            char letter == letter2
            - Användaren matar in sin ålder och programmet skriver ut om hen får köra moped eller inte
            - Användaren matar in två tal.
                Checka så att tal A är större än 10 och mindre än 20
                & tal B är större än 50 och mindre än 100
                50 - 100
     */

    public static void main(String[] args) {

	    System.out.println("Tjena");

	    // Heltal
	    int age = 10;
	    // Text
	    String company = "Apple";
	    // Tecken
	    char letter = 'K';
	    // Decimaltal
	    float point = 0.13f;
        // Decimaltal. Dubbelt så stor som float
        double distance = 123.51;
        // True or false
	    boolean isRunning = false;


        // Skapa upp ett scanner objekt
        Scanner sc = new Scanner(System.in);

        // Fråga och hämta användarnamn från användare
        System.out.println("Enter username");
        String name = sc.nextLine();
        // Fråga och hämta lösenord från användare
        System.out.println("Enter password");
        String password = sc.nextLine();
        // Är name == "William123" och password == "123123123"?
	    if (name.equals("William123") && password.equals("123123123")) {
	        // Input från användaren stämmer!
            System.out.println("Du loggades in");
        // Om inte det förgående stämmer. Är name == "Oleg551" och password == "321321321"?
        } else if(name.equals("Oleg551") && password.equals("321321321")) {
	        // Om det stämmer körs detta blocket
        } else {
	        // Om inget av de förgående stämde körs detta blocket
            System.out.println("Fel lösenord eller användarnamn");
        }

	    // Variabel för att hålla räkningen på ett tal
        int counter = 0;
        System.out.println("While börjar");
        while(counter < 10) { // counter = 9
            // Inkrementera counter med 1
            counter = counter + 1;
            System.out.println(counter);
            // counter++;
        }

        System.out.println("Do-while börjar");
        do {
            System.out.println(counter);
            counter = counter - 1;
            // counter--;
        } while(counter >= 0);


        // Räkna baklänges från 40 - 30
        for(int i = 40; i >= 30; i--) {
            System.out.println(i);
        }
        // Skriv ut alla jämna tal från 2 - 12
        for(int i = 2; i <= 12; i+=2) {
            System.out.println(i);
        }
        // Annan lösning till ovanstående
        for(int i = 0; i <= 12; i++) {
            // 10 / 3 = 3 med 1 i rest
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        // -- For loop --
        // for(arg1; arg2; arg3) { }
        // arg1 = utgångspunk. Lokal variabel.
        // arg2 = Villkor. Ska loopen fortsätta?. Checkas efter varje iteration
        // arg3 = inkrement. i++  /  i+=2  /  i-- etc..


        // Skapa upp en skanner
        Scanner sc = new Scanner(System.in);
        // Variabel till while
        boolean isLoopRunning = true;
        // Variabel för lagring av användarinput
        String input = "";
        // Loop som hämtar användarinput tills det att användaren matar in "Exit"
        while(isLoopRunning) {
            // Hämta användarinput
            input = sc.nextLine();
            // Är input == Exit?
            if (input.equals("Exit")){
                // I så fall sätt loop variabeln till false. aka sluta loopa
                isLoopRunning = false;
            } else {
                // Annars printa "Försök igen"
                System.out.println("Försök igen");
            }
        }

        for(int i = 0; i < 20; i++) {
            // i++ == | i = i + 1
            // i += 2 | i = i + 2
            System.out.println("i = " + i);
        }

    }

}
