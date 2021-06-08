public class Card
{
    private final int value;
    private final Shape shape;

    /**
     * constructor of Card
     * @param value - value of the card
     * @param shape - shape of the card
     */
    public Card(int value, Shape shape)
    {
        this.value = value;
        this.shape = shape;
    }

    /**
     * getter for value
     * @return the value of the card
     */
    public int getValue()
    {
        return this.value;
    }

    /**
     * getter for shape
     * @return the shape of the card
     */
    public Shape getShape()
    {
        return this.shape;
    }

    //no setters because attributes are final

    /**
     * compares this card to another card
     * @param other: the other card for the comparison
     * @return: -1 if the other card's value is higher
     * 0 if equals
     * 1 if this card's value is higher
     */
    public int compare(Card other)
    {
        if (other.value > this.value)
            return -1;

        else if (other.value == this.value)
            return 0;

        else
            return 1;
    }

    @Override
    /**
     * returns a string that describes the card's attributes
     */
    public String toString()
    {
        String str1 = "";
        String str2 = "";

        if (this.value == 1)
            str1 = "Ace of ";

        else if (this.value == 11)
            str1 = "Prince of ";

        else if (this.value == 12)
            str1 = "Queen of ";

        else if (this.value == 13)
            str1 = "King of ";

        else
            str1 = this.value + " of ";

        switch (this.shape)
        {
            case Clubs:
                str2 = "♣";
                break;

            case Hearts:
                str2 = "♥";
                break;

            case Diamonds:
                str2 = "♦";
                break;

            case Spades:
                str2 = "♠";
                break;
        }
        return str1 + str2;
    }
}
