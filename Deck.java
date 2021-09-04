import java.util.ArrayList;
import java.util.Collections;


public class Deck {
    ArrayList<Card> cards = new ArrayList<>();
    protected int cardValue;
   
    

    public void createDeck(){
        for(int i = 0; i < Card.Suit.getSuitLength(); i++){
            for(int j = 0; j < Card.Value.getValueLength(); j++){
                Card card = new Card(Card.Suit.getSuits(i), Card.Value.getValues(j));
                cards.add(card);
                Collections.shuffle(cards);
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public void draw(Deck deck){
        cards.add(deck.cards.get(0));
        deck.removeCard(0);
    }
    public void addToDeck(Deck deck, int i){
        
        cards.add(deck.cards.get(i));
    }
    public void removeCard(int index){
        cards.remove(index);
    }
    public void getDeckSize() {
       for(Card card : cards)  {
        cards.size();
       }
    }
    public int getValue(int i){
        int Value = 0;
        for(Card card : cards){
            switch(card.getValue()){
            case TWO : Value = 2; break;
            case THREE : Value = 3; break;
            case FOUR : Value = 4; break;
            case FIVE : Value = 5; break;
            case SIX : Value = 6; break;
            case SEVEN : Value = 7; break;
            case EIGHT : Value = 8; break;
            case NINE : Value = 9; break;
            case TEN : Value = 10; break;
            case JACK : Value = 11; break;
            case QUEEN : Value = 12; break;
            case KING : Value = 13; break;
            case ACE : Value = 14; break;
        }
        
     }
        return Value;
    }
  
    public String toString(){
        String deck = "";
        for(Card card: cards){
            deck += card.toString() + '\n'; 
        }
        return deck;
    }
    public Card.Value getHandValue(int getValue) {
        Card topCard = new Card();
        for(int i = 0; i < cards.size(); i++){
            topCard = cards.get(i);
            
        }
        return topCard.getValue();
        
    }
    // public int atIndex(int i){
    //     for(i = 0; i < cards.size(); i++){
    //         return i;
    //     }
    //     return i;
    // }
    // public int flip(int x){
    //   Deck deck = new Deck();
    //   deck.removeCard(x);
    //     return deck.getHandValue(x);


        
    // }
    
}
