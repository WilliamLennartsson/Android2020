// Glöm inte paketnamn här.

public class Game {
    private Player player;

    // En metod för att starta spelet
    public void start(){}
    // En metod för att skapa upp spelaren.
    public Player playerSetup(){return null;}
    // Själva gameloopen. Här skall logiken ligga som hindrar programmet från att avslutas.
    public void gameLoop(){}
    // En metod som hanterar menyalternativ
    public void handleMenu(){}
    // En metod för att starta en battle mellan en player och ett monster
    public void battle(Player player, Monster monster){}
    // Metod för att generera ett monster
    public Monster generateRandomMonster(){ return null; }

}
