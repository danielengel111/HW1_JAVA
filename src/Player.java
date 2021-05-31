public class Player
{
    private Deck gameDeck;
    private Deck winningDeck;
    private String name;

    public Player(String name)
    {
        this.name = name;
        gameDeck = new Deck(false);
        winningDeck = new Deck(false);
    }

    public Deck getGameDeck()
    {
        return this.gameDeck;
    }
    public String getName()
    {
        return this.name;
    }

    public void drawCard() {}

    public boolean outOfCards(){}

    @Override
    public String toString()
    {
        return this.name;
    }
}
