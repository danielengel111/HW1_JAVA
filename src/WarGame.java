public class WarGame {
    private Player player1;
    private Deck player1tmpDeck;
    private Player player2;
    private Deck player2TmpDeck;

    /**
     * constructor of WarGame
     * @param player1_name - first player
     * @param player2_name - second player
     */
    public WarGame(String player1_name, String player2_name) {
        this.player1 = new Player(player1_name);
        this.player1tmpDeck = new Deck(false);
        this.player2 = new Player(player2_name);
        this.player2TmpDeck = new Deck(false);
    }

    /**
     * initializes the game by shuffling a deck of cards
     * and dealing the cards to the players
     */
    public void initializeGame() {
        System.out.println("Initializing the game...");
        Deck startingDeck = new Deck(true);
        startingDeck.shuffle(); //initialize the deck
        boolean isPlayer1Turn =
                //comparing lexicographically
                player1.getName().compareTo(player2.getName()) < 0;
        while(!startingDeck.isEmpty()){
            if(isPlayer1Turn){
                player1.getGameDeck().addCard(startingDeck.removeTopCard());
                //add to first player's deck
                isPlayer1Turn = false;
                //next turn is the second player's
            }else{
                player2.getGameDeck().addCard(startingDeck.removeTopCard());
                //add to second player's deck
                isPlayer1Turn = true;
                //next turn is the first player's
            }
        }
    }

    /**
     * calls initializeGame
     * manages the game and printing
     * @return - the name of the winner
     */
    public String start(){
        this.initializeGame();
        Deck centralDeck = new Deck(false);
        boolean doesPlayer1start =
                //comparing lexicographically
                player1.getName().compareTo(player2.getName()) < 0;
        Card player1DrawnCard;
        Card player2DrawnCard;
        while(true)
        {
            if(doesPlayer1start)
            {

            }
            else
            {//player2 is first lexicographically

            }
        }
    }

    /**
     * this function loops the game
     * @param first - the first player lexicographically
     * @param second - the second player lexicographically
     * @return - the name of the winner
     */
    private String gameLooper(Player first, Player second){

    }

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
     * getter function of the player1tmpDeck attribute
     * @return - player1tmpDeck attribute
     */
    public Deck getPlayer1tmpDeck(){return player1tmpDeck;}

    /**
     * getter function of the player2TmpDeck attribute
     * @return - player2TmpDeck attribute
     */
    public Deck getPlayer2TmpDeck(){return player2TmpDeck;}

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
     * setter function of the player1tmpDeck
     * @param deck - deck to set to player1tmpDeck
     */
    public void setPlayer1tmpDeck(Deck deck){
        this.player1tmpDeck = deck;
    }

    /**
     * setter function of the player2TmpDeck
     * @param deck - deck to set to player2TmpDeck
     */
    public void setPlayer2TmpDeck(Deck deck){
        this.player2TmpDeck = deck;
    }
}
