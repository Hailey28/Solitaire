/**
 *
 * @author Jonathan and Whitney
 */
public class Card
{
    //Static final variables
    public static final int  DEFAULT_ID   = 0;
    public static final int  NUM_VALUES   = 13;
    public static final int  NUM_SUITS    = 4;
    public static final Face DEFAULT_FACE = Face.Face_Down;
    
    //Card attributes
    private final int id;
    private final Value value;
    private final Color color;
    private final Suit suit;
    private Face face;
    
    
    /**********************Enums for card attributes***************************/
    public static enum Color
    {
        Color_Red,
        Color_Black
    }
    
    public static enum Face
    {
        Face_Up,
        Face_Down
    }
    
    public static enum Value
    {
        Value_2,
        Value_3,
        Value_4,
        Value_5,
        Value_6,
        Value_7,
        Value_8,
        Value_9,
        Value_10,
        Value_J,
        Value_Q,
        Value_K,
        Value_A,
    }
    
    public static enum Suit
    {
        Suit_Spades,
        Suit_Clubs,
        Suit_Diamonds,
        Suit_Hearts
    }
    /**************************************************************************/
    
    //Default constructor
    public Card() { this(DEFAULT_ID, DEFAULT_FACE); }
    
    public Card(int _id, Face _face) 
    {
        id    = _id;
        face  = _face;
        
        value = Value.values()[id % NUM_VALUES]; //Card value based on given ID       
        suit  = Suit.values() [id % NUM_SUITS];  //Card suit based on given ID
        
        color = (suit == Suit.Suit_Clubs || suit == Suit.Suit_Spades ? 
                Color.Color_Black : Color.Color_Red);
    }
    
    private String valueString()
    {
        switch(value)
        {
            case Value_2:  return "Two";
            case Value_3:  return "Three";
            case Value_4:  return "Four";
            case Value_5:  return "Five";
            case Value_6:  return "Six";
            case Value_7:  return "Seven";
            case Value_8:  return "Eight";
            case Value_9:  return "Nine";
            case Value_10: return "Ten";
            case Value_J:  return "Jack";
            case Value_Q:  return "Queen";
            case Value_K:  return "King";
            case Value_A:  return "Ace";
            default: return "";
        }
    }
    
    private String suitString()
    {
        switch(suit)
        {
            case Suit_Spades:   return "Spades";
            case Suit_Clubs:    return "Clubs";
            case Suit_Diamonds: return "Diamonds";
            case Suit_Hearts:   return "Hearts";
            default: return "";
        }
    }
    
    private String colorString() { return (color == Color.Color_Black ? "black" : "red"); }    
    private String faceString()  { return (face == Face.Face_Up ? "face up" : "face down"); }
    
    //Getters
    public int getID()      { return id; }
    public Value getValue() { return value; }
    public Color getColor() { return color; }
    public Face getFace ()  { return face; }
    public Suit getSuit()   { return suit; }
    
    //Setters
    public void setFace(Face _face) { face = _face; }
    
    //Override toString() to print a card
    @Override
    public String toString()
    {
        return "Card ID " + Integer.toString(id) + ": " + 
                valueString() + " of " + suitString() + 
                ", color is " + colorString() + ", " + 
                faceString();        
    }
}
