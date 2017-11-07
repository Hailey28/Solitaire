package solitaire;

/**
 * @author Jonathan and Whitney
 */
public class Solitaire
{
    public static DeckOfCards deck;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        deck = new DeckOfCards();
        deck.shuffle();
    }
}
