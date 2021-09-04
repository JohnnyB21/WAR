
public class Card {
    public enum Value{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;


        public static Value getValues(int index){
            Value[] values = Value.values();
            return values[index];
        }
        public static int getValueLength(){
            return Value.values().length;
        }
    }
    
    public enum Suit{
        DIAMOND, HEART, SPADE, CLOVER;

        public static Suit getSuits(int index){
        Suit[] suits = Suit.values();
        return suits[index];
        }
        public static int getSuitLength(){
            return Suit.values().length;
        }
    }
    private Suit suit;
    Value value;

    public Card(Suit suit, Value value){
        this.suit = suit;
        this.value = value;
    }
    public Card() {
    }
    public Suit getSuit(){
        return this.suit;
    }
    public Card.Value getValue(){
        return this.value;
    }
    public String toString(){
        return this.suit + "_" + this.value;
    }
    public int getIntVal(Card.Value x) {
        int intVal = 0;

        switch (x) {
            case TWO:
                intVal = 2;
                break;
            case THREE:
                intVal = 3;
                break;
            case FOUR:
                intVal = 4;
                break;
            case FIVE:
                intVal = 5;
                break;
            case SIX:
                intVal = 6;
                break;
            case SEVEN:
                intVal = 7;
                break;
            case EIGHT:
                intVal = 8;
                break;
            case NINE:
                intVal = 9;
                break;
            case TEN:
                intVal = 10;
                break;
            case JACK:
                intVal = 11;
                break;
            case QUEEN:
                intVal = 12;
                break;
            case KING:
                intVal = 13;
                break;
            case ACE:
                intVal = 14;
                break;
        }

        return intVal;
    }
}