public class WarGame {
    private Player player1;
    private Deck player1TmpDeck;
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
        this.player1TmpDeck = new Deck(false);
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
        for(int i = 1; true; i++){
            System.out.println("------------------------- Round number "+i
                    + " -------------------------");
            firstDrawn = player1.drawCard();//first player draws the card
            player1TmpDeck.addCard(firstDrawn);
            System.out.println(player1 + " drew " + firstDrawn);

            secondDrawn = player2.drawCard();//second player draws the card
            player2TmpDeck.addCard(secondDrawn);
            System.out.println(player2 + " drew " + secondDrawn);

            switch(firstDrawn.compare(secondDrawn)){
                case(-1): // player 2 won the round
                    giveCardsToWinner(player2);
                    System.out.println(player2+" won");
                    break;
                case(1): // player 1 won the round
                    giveCardsToWinner(player1);
                    System.out.println(player1+" won");
                    break;
                case(0):


            }

        }
        return winner;
    }

    /**
     * this function is called when a player wins a round or a war
     * gives him the cards in the middle deck
     * @param player - the player who won
     */
    private void giveCardsToWinner(Player player){
        while(!player1TmpDeck.isEmpty()){
            player.addToWinningDeck(player1TmpDeck.removeTopCard());
            player.addToWinningDeck(player2TmpDeck.removeTopCard());
        }
    }

    /**
     * handles war
     * @return
     */
    private String handleWar(){
        String winner = hasSomeoneLost();
        if(!winner.equals(""))
            return winner;
        //both have cards left, start the war
        System.out.println("Starting a war...");
        while(true){
            for(int i=0 ;i < 2 ;i++){

            }
        }
    }

    /**
     * checks if a player has lost
     * @return no loser then returns ""
     *          otherwise returns the name of the winner
     */
    private String hasSomeoneLost(){
        if(player1.outOfCards())
            return player2.getName();
        else if(player2.outOfCards())
            return player1.getName();
        return "";
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
     * getter function of the player1TmpDeck attribute
     * @return - player1tmpDeck attribute
     */
    public Deck getPlayer1TmpDeck(){return player1TmpDeck;}

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
     * setter function of the player1TmpDeck
     * @param deck - deck to set to player1tmpDeck
     */
    public void setPlayer1TmpDeck(Deck deck){
        this.player1TmpDeck = deck;
    }

    /**
     * setter function of the player2TmpDeck
     * @param deck - deck to set to player2TmpDeck
     */
    public void setPlayer2TmpDeck(Deck deck){
        this.player2TmpDeck = deck;
    }
}
