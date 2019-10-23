package Card_game;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Deck {

    int maxSize;
    Stack<Card> deck;
    int topCard;

    public Deck () {
        this.maxSize = 52;
        this.deck = new Stack<Card>();
        this.topCard = 0;
        int tempValue = 1;
        int suitNum = 0;
        String[] suitsArray = new String[] {"Hearts", "Spades", "Clubs", "Diamonds"};
        String suitString = "Hearts";
        for(int i = 0; i < 52; i++){

            if (tempValue > 13){
                tempValue = 1;
                suitNum++;
            }
            Card tempCard = new Card( suitsArray [suitNum], tempValue, false);
            deck.push(tempCard);

            tempValue++;


        }
    }


    public Deck(int maxSize, Stack<Card> cards){
        this.maxSize = maxSize;
        this.deck = cards;
        this.topCard = 0;
    }

    public void shuffle(){
        Collections.shuffle(this.deck);
    }

    public Card dealTopCard(){
        return deck.pop();
    }
    @Override
    public String toString() {
        return "A deck of cards currently holding" + this.deck.size() +
                "cards. The max size of the deck is:" +  this.maxSize;
    }
}
