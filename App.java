

public class App {
    public static void main(String[] args) {
//    ArrayList playerOneHand = new ArrayList<>();
//    ArrayList playerTwoHand = new ArrayList<>();
   String playerOne = "Josh";
   String playerTwo = "Michael";
   Deck playerOneDeck = new Deck();
   Deck playerTwoDeck = new Deck();

      Deck myDeck = new Deck();
      myDeck.createDeck();
     
        for (int i = 0; i < 52; i++){
            if( i % 2 == 0) {
                playerOneDeck.addToDeck(myDeck, i);
            } else {
                playerTwoDeck.addToDeck(myDeck, i);
            }
         }
         int playerOneWins = 0;
         int playerTwoWins = 0;
         int rndCnt = 1;
        for(int i = 0; i <= 25; i++){

            System.out.println("Round: " + rndCnt);

            System.out.println("*");

            System.out.println(playerOne + "'s card: " + playerOneDeck.cards.get(i) ); //+ ", postion: " + i);
           // System.out.println("player one card enum value: " + playerOneDeck.cards.get(i).getValue() + ", position: " + i);
         //   System.out.println("player one card value: " + playerOneDeck.cards.get(i).getIntVal(playerOneDeck.cards.get(i).value) + ", position: " + i);

            System.out.println("--------------------------------");

            System.out.println(playerTwo + "'s card: " + playerTwoDeck.cards.get(i)); // + ", postion: " + i);
         //   System.out.println("player two card enum value: " + playerTwoDeck.cards.get(i).getValue() + ", postion: " + i);
           // System.out.println("player one card value: " + playerTwoDeck.cards.get(i).getIntVal(playerTwoDeck.cards.get(i).value) + ", postion: " + i);
           System.out.println("--------------------------------");
            if(playerOneDeck.cards.get(i).getIntVal(playerOneDeck.cards.get(i).getValue()) > playerTwoDeck.cards.get(i).getIntVal(playerTwoDeck.cards.get(i).getValue())){
                System.out.println(playerOne + " wins round: " + (i + 1));
                playerOneWins++;
                System.out.println(playerOne + " total  23wins: " + playerOneWins);
                
            }else if(playerOneDeck.cards.get(i).getIntVal(playerOneDeck.cards.get(i).getValue()) == playerTwoDeck.cards.get(i).getIntVal(playerTwoDeck.cards.get(i).getValue())){
                System.out.println("Tied game");
            }else{
                System.out.println(playerTwo + " wins round: " + (i + 1));
                playerTwoWins++;
                System.out.println(playerTwo + " total wins: " + playerTwoWins);
            }
            rndCnt++;
            System.out.println();
        }


            if(playerOneWins > playerTwoWins){
                System.out.println(playerOne + " WINS THE WAR!!");
            }
            else if(playerOneWins == playerTwoWins){
                System.out.println("The War is Tied!");
            }
            else{
                System.out.println(playerTwo + " WINS THE WAR!!");
            }


    
}
    
  

}