public class Player
{
    private Deck gameDeck;
    private Deck winningDeck;
    private String name;

    /**
     * constructor of player
     * @param name - name of the player
     */
    public Player(String name)
    {
        this.name = name;
        gameDeck = new Deck(false);
        winningDeck = new Deck(false);
    }

    /**
     * getter for game deck
     * @return the game deck
     */
    public Deck getGameDeck()
    {
        return this.gameDeck;
    }
    /**
     * getter for winning deck
     * @return winning deck
     */
    public Deck getWinningDeck(){
        return winningDeck;
    }
    /**
     * getter for player's name
     * @return the name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * setter for game deck
     */
    public void setGameDeck(Deck deck){
        gameDeck=deck;
    }

    /**
     * setter for winning deck
     */
    public void setWinningDeck(Deck deck){
        winningDeck=deck;
    }

    /**
     * setter for the name
     */
    public void setName(String name){
        this.name=name;
    }

    /**
     * adds card to game deck
     * @param card
     */
    public void addToGameDeck(Card card){
        gameDeck.addCard(card);
    }

    /**
     * adds card to winning deck
     * @param card
     */
    public void addToWinningDeck(Card card){
        winningDeck.addCard(card);
    }

    /**
     * draws a card from game deck
     */
    public Card drawCard() {return gameDeck.removeTopCard();}

    /**
     * checks if the player is out of cards
     * if game deck is empty but winning deck is not, calls changer()
     * @return true if the player has no cards left
     */
    public boolean outOfCards()
    {
        if(gameDeck.isEmpty() && !winningDeck.isEmpty()){
            changer();//then change to the new deck
        }
        return gameDeck.isEmpty() && winningDeck.isEmpty();
    }

    /**
     * shuffles the winning deck and then changes the playing deck
     */
    public void changer(){
        winningDeck.shuffle();//first shuffle it
        Deck temp = winningDeck;
        winningDeck = gameDeck;
        gameDeck = temp;
    }

    @Override
    /**
     * overriding toString function
     * @return the name
     */
    public String toString()
    {
        return this.name;
    }
}
