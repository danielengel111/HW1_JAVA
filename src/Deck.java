import java.util.ArrayList;
import java.util.Stack;

public class Deck
{
    private Stack<Card> deck;

    /**
     * constructor method
     * @param isFull - should the deck be full of cards or empty
     */
    public Deck(boolean isFull)
    {
        this.deck = null;
        if (isFull)
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

    /**
     * adds a card to the deck
     * @param card - card to add
     */
    public void addCard(Card card) {this.deck.push(card);}

    /**
     * pops the head of the deck
     * @return card from the top
     */
    public Card removeTopCard() { return this.deck.pop();}

    /**
     * checks if the deck is out of cards
     * @return true if it is
     */
    public boolean isEmpty()
    {
        return this.deck.isEmpty();
    }

    /**
     * this function shuffles the deck
     */
    public void shuffle()
    {
        for (int i = 0; i < 50; i++)
        {
            int index1 = Main.rnd.nextInt(52);
            int index2 = Main.rnd.nextInt(52);// get random indexes

            //swap cards
            Card card1 = this.deck.elementAt(index1);
            Card card2 = this.deck.elementAt(index2);
            this.deck.setElementAt(card1, index2);
            this.deck.setElementAt(card2, index1);
        }
    }

    /**
     * getter for the deck
     * @return the the deck
     */
    public Stack<Card> getDeck()
    {
        return this.deck;
    }

    /**
     * setter for the deck
     */
    public void setDeck(Stack<Card> deck){
        this.deck = deck;
    }
}
