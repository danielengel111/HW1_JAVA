import java.util.ArrayList;
import java.util.Stack;

public class Deck
{
    private Stack<Card> deck;

    public Deck(boolean condition)
    {
        this.deck = null;
        if (condition)
        {
            for (Shape shape: Shape.values())
            {
                for (int i = 1; i <= 13; i++)
                {
                    deck.push(new Card(i, shape));
                }
            }
        }
    }

    void addCard(Card card)
    {
        this.deck.push(card);
    }

    Card removeTopCard()
    {
        return this.deck.pop();
    }

    boolean isEmpty()
    {
        return this.deck.isEmpty();
    }

    void shuffle(){}


}
