package solitaire;

import java.util.Collections;

/**
 * @author Jonathan and Whitney
 */
public class DeckOfCards extends StackOfCards
{
    public final static int DECK_SIZE = 52;
    public final static int TOP_CARD = 0;
    
    public DeckOfCards()
    {
        super(DECK_SIZE);
    }
    
    public Card dealOne()
    {
        return remove(TOP_CARD);
    }
    
    public void shuffle()
    {
        Collections.shuffle(this);
    }
}
