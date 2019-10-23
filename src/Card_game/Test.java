package Card_game;

public class Test {

    public static void main(String[] args){
    Card testCard = new Card("Hearts", 1 , false);
        System.out.println(testCard.value+ testCard.suit + testCard.faceUp);

        testCard.flip();
        System.out.println("Flipping card Thrice");
        System.out.println(testCard.value+ testCard.suit + testCard.faceUp);
        System.out.println("Flipping card twice");
        testCard.flip();
        System.out.println("After first flip");
        System.out.println(testCard.value+ testCard.suit + testCard.faceUp);
        testCard.flip();
        System.out.println("After second flip");
        System.out.println(testCard.value+ testCard.suit + testCard.faceUp);
        testCard.flip();

        System.out.println(testCard.turnedFaceUp());
        System.out.println(testCard.turnedFaceUp());
    }
}
