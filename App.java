import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
   ArrayList playerOneHand = new ArrayList<>();
   ArrayList playerTwoHand = new ArrayList<>();
   Player one = new Player("Bob");
   Player two = new Player("Billy");
   Deck playerOneDeck = new Deck();
   Deck playerTwoDeck = new Deck();

      Deck myDeck = new Deck();
      myDeck.createDeck();
      System.out.println(myDeck.atIndex(0)); 
         //   myDeck.shuffle();
       //System.out.println(myDeck);
        for (int i = 0; i < 52; i++){
            if( i % 2 == 0) {
                playerOneDeck.addToDeck(myDeck, i);
            } else {
                playerTwoDeck.addToDeck(myDeck, i);
            }
         }
         
         playerOneHand.add(playerOneDeck);
         playerTwoHand.add(playerTwoDeck);
        //System.out.println(playerOneHand);
         //System.out.println("Player One deck: " + playerOneDeck);
        // System.out.println("Player Two deck: " + playerTwoDeck);
        //  System.out.println("Player One deck: " + playerOneDeck.getHandValue(0));
         
        //  System.out.println("Player One deck: " + playerOneDeck.getHandValue(1));
       
        //  System.out.println("Player Two deck: " + playerTwoDeck.getHandValue(0));
         
        
        // System.out.println(playerOneHand.get(1));   
        // System.out.println(playerOneHand.get(2));
    //    for(int g = 0; g <= playerOneHand.size(); g++){
    //        System.out.println(playerOneHand.get(g));
    //        System.out.println("---------");
    //        System.out.println();
    //        System.out.println("---------");

           
        //    if(playerOneDeck.getHandValue(g).compareTo(playerTwoDeck.getHandValue(g)) > playerTwoDeck.getHandValue(g).compareTo(playerOneDeck.getHandValue(g))) {
        //        System.out.println("Player 1 wins round:" + g);
               

        //    } else if(playerTwoDeck.getHandValue(g).compareTo(playerOneDeck.getHandValue(g)) > playerOneDeck.getHandValue(g).compareTo(playerTwoDeck.getHandValue(g))){
        //        System.out.println("Player 2 wins round:" + g);
               
        //    } else {
        //        System.out.println("The round is tied!");
               
               
        //    }
           
     //  }


  















    // Deck playerOneHand = new Deck();
    // Deck playerTwoHand = new Deck();
    // Deck gameDeck = new Deck();
    // gameDeck.shuffle();;
    // for (int i = 0; i < 53; i++){
    //     if( i % 2 == 0) {
    //         playerOneHand.addToDeck(gameDeck);
    //     } else {
    //         playerTwoHand.addToDeck(gameDeck);
    //     }
    // }


    // System.out.println(playerOneHand);
}
    
  

}