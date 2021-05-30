import java.util.ArrayList;

public class Player
{
    private Deck game_deck;
    private Deck winning_deck;
    private String name;

    public Player(String name)
    {
        this.name = name;
        game_deck = new Deck(false);
        winning_deck = new Deck(false);
    }

    void drawCard(){}

    boolean outOfCards(){}

    @Override
    public String toString()
    {
        return this.name;
    }
}
