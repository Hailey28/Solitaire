/*
 * @author Jonathan and Whitney
 */

import java.util.ArrayList;

public class Solitaire
{
    //Constants
    private static final int EMPTY_STACK = 0;
    private static final int NUM_BOARD_PILES = 7;
    private static final int NUM_FINISHED_PILES = Card.NUM_SUITS;

    public static DeckOfCards deck;
    private static StackOfCards drawPile;
    private static ArrayList<StackOfCards> boardPiles, finishedPiles;

    private static void createPiles()
    {
        drawPile      = new StackOfCards(EMPTY_STACK);
        boardPiles    = new ArrayList<StackOfCards>(NUM_BOARD_PILES);
        finishedPiles = new ArrayList<StackOfCards>(NUM_FINISHED_PILES);

        //Initialize empty piles for the game board
        for(int i = 0; i < NUM_BOARD_PILES; ++i)
            boardPiles.add(new StackOfCards(EMPTY_STACK));

        //Initialize empty piles for the suited finished stacks
        for(int i = 0; i < NUM_FINISHED_PILES; ++i)
            finishedPiles.add(new StackOfCards(NUM_FINISHED_PILES));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        deck = new DeckOfCards();
        deck.shuffle();

        createPiles();

        //TODO: Add GUI here
    }
}
