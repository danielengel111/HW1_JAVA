public class WarGame {
    private Player player1;
    private Deck player1DrawnDeck;
    private Player player2;
    private Deck player2DrawnDeck;

    /**
     * constructor of WarGame
     * @param player1_name - first player
     * @param player2_name - second player
     */
    public WarGame(String player1_name, String player2_name) {
        this.player1 = new Player(player1_name);
        this.player1DrawnDeck = new Deck(false);
        this.player2 = new Player(player2_name);
        this.player2DrawnDeck = new Deck(false);
    }


    void initializeGame() {
        System.out.println("Initializing the game...");

    }

    String start(){}

    /**
     * getter function of the player1 attribute
     * @return - player1 attribute
     */
    public Player getPlayer1(){return player1;}

    /**
     * getter function of the player2 attribute
     * @return - player2 attribute
     */
    public Player getPlayer2(){return player2;}

    /**
     * getter function of the player1DrawnDeck attribute
     * @return - player1DrawnDeck attribute
     */
    public Deck getPlayer1DrawnDeck(){return player1DrawnDeck;}

    /**
     * getter function of the player2DrawnDeck attribute
     * @return - player2DrawnDeck attribute
     */
    public Deck getPlayer2DrawnDeck(){return player2DrawnDeck;}

    /**
     * setter function of the player1
     * @param player - player to set to player1
     */
    public void setPlayer1(Player player){
        this.player1 = player;
    }

    /**
     * setter function of the player1
     * @param player - player to set to player2
     */
    public void setPlayer2(Player player){
        this.player2 = player;
    }

    /**
     * setter function of the player1DrawnDeck
     * @param deck - deck to set to player1DrawnDeck
     */
    public void setPlayer1DrawnDeck(Deck deck){
        this.player1DrawnDeck = deck;
    }

    /**
     * setter function of the player2DrawnDeck
     * @param deck - deck to set to player2DrawnDeck
     */
    public void setPlayer2DrawnDeck(Deck deck){
        this.player2DrawnDeck = deck;
    }
}
