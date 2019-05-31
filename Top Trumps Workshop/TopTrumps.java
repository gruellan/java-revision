import java.utils.*;

public class TopTrumps {
    public static void main(String args[]) {
        Card[] cards = new Card[3];
        Card iphone = new Card("iPhone 1", 12, 620, 131072);
        Card thinkpad = new Card("X1 Carbon", 0, 17203, 16777216);
        Card amiga = new Card("Commodore Amiga", 32,  7.09, 512);
        cards[0] = iphone;
        cards[1] = thinkpad;
        cards[2] = amiga;
        
        System.out.println("All Top Trump cards: ");
        for(int i=0; i<cards.length; i++){
            System.out.println(cards[i].getName() + "\t" + cards[i].getAge() + "\t" + cards[i].getSpeed() + "\t" + cards[i].getRam());
        }
    }
}