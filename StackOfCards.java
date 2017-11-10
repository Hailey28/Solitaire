/**
 *
 * @author Jonathan and Whitney
 */

import java.util.ArrayList;

public class StackOfCards extends ArrayList<Card>
{
    public StackOfCards(int stackSize)
    {
        for(int i = 0; i < stackSize; ++i)
            add(new Card(i, Card.DEFAULT_FACE));
    }
    
    public String toString()
    {
        String stackString = "";
        
        for(Card card : this)
            stackString += card.toString() + "\n";
        
        return stackString;
    }
}
