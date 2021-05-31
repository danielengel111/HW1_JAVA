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

    public void drawCard(){}

    public boolean outOfCards(){}

    @Override
    public String toString()
    {
        return this.name;
    }
}
