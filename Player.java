

public class Player extends Deck{
    private String name;
    private int score;

    
    public Player(String name) {
        this.name = name;
    }

    public void player(String inName, int inScore){
        this.name = inName;
        this.score = inScore;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void draw(Deck deck){
        cards.add(deck.cards.get(0));
        deck.removeCard(0);
    }
    
    public Player(int value){
        this.cardValue = value;
    }
    public int getCardValue(){
        return cardValue;
    }
    
    public int incrementScore(int x){
        int playerScore = 1;
        for(int i = 0; i <= 25; i++){
    }
    return playerScore++;

    // public void describe() {
    
    //     System.out.println("Player: " + name + " Hand: " + showHandP1);
    //     System.out.println("Player: " + name + " Hand: " + showHandP2);
    // }
  
// if card is even give to player 1 odd give to player 2 
//using traditional for loop 
//      for(i = 0; i < 53; i++) {
//      if( i % 2 == 0) {
//      hand.add(i)
//  else {
//  hand1.add(i)
//}
//}                      
}
}
