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
            this.deck = new Stack<>();
            for (Shape shape: Shape.values())
            {
                for (int i = 1; i <= 13; i++)
                {
                    this.deck.push(new Card(i, shape));
                }
            }
        }
    }

    public void addCard(Card card) {this.deck.push(card);}

    public Card removeTopCard() { return this.deck.pop();}

    public boolean isEmpty()
    {
        return this.deck.isEmpty();
    }

    public void shuffle()
    {
        for (int i = 0; i < 50; i++)
        {
            int index1 = Main.rnd.nextInt(52);
            int index2 = -1;
            while (index1 != index2)
                //get random index until we found one different from index1
            {
                index2 = Main.rnd.nextInt(52);
            }

            //swap cards
            Card card1 = this.deck.elementAt(index1);
            Card card2 = this.deck.elementAt(index2);
            this.deck.setElementAt(card1, index2);
            this.deck.setElementAt(card2, index1);
        }
    }
    public Stack<Card> getDeck()
    {
        return this.deck;
    }
}
