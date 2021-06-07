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
        if(player1_name.compareTo(player2_name) < 0){
            this.player1 = new Player(player1_name);
            this.player2 = new Player(player2_name);
        }else { //here we change them lexicographically
            this.player1 = new Player(player2_name);
            this.player2 = new Player(player1_name);
        }
        this.player1tmpDeck = new Deck(false);
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
        while(!startingDeck.isEmpty())
        {
            player1.addToGameDeck(startingDeck.removeTopCard());
            player2.addToGameDeck(startingDeck.removeTopCard());
        }
    }

    /**
     * calls initializeGame
     * manages the game and printing
     * @return - the name of the winner
     */
    public String start(){
        this.initializeGame();
        String winner;//name of the winner
        Card firstDrawn;//the currently drawn card by the first player
        Card secondDrawn;// the currently drawn card by the second player
        while(true){
            if(player1.outOfCards()){
                winner = player2.getName();
                break;//we have a winner!
            }
            firstDrawn = player1.drawCard();//first player draws the card
            System.out.println(player1 + " drew " + firstDrawn);

            if(player2.outOfCards()){
                winner = player1.getName();
                break;//we have a winner!
            }
            secondDrawn = player2.drawCard();//second player draws the card
            System.out.println(player2 + " drew " + secondDrawn);


        }
        return winner;
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
