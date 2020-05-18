import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 扑克牌
 */
class Card{
    public int rank;
    public String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
//        return "Card{" +
//                "rank=" + rank +
//                ", suit='" + suit + '\'' +
//                '}';

        return String.format("[%s %d]",suit,rank);
    }
}

public class Demo_4 {

    //花色不能改变，定义常量 ---常量大写
    public static final String[] SUITS = {"♥","♠","♣","♦"} ;


    //买牌
    public static List<Card> buyDeck(){
        List<Card> deck = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                int rank = j;
                String suit = SUITS[i];
                Card card = new Card(rank,suit);
                deck.add(card);
            }
        }
        return deck;
    }

    //插牌

    private static void swap(List<Card>deck,int index,int i){//交换index和i的位置

        //重点
        Card temp = deck.get(index);
        deck.set(index, deck.get(i));
        deck.set(i,temp);

    }
    public static void shuffle(List<Card> deck){
        for (int i = deck.size() - 1; i > 0 ; i--) {
            Random random = new Random();
            int index = random.nextInt(i);//随机生成一个要替换下标【0，i）之间的随机数
            swap(deck,index,i);
        }
    }


    public static void main(String[] args) {
        //测试买牌
        List<Card> deck = buyDeck();
        System.out.println(deck);

        //测试插牌
        shuffle(deck);
        System.out.println(deck);

        //测试揭牌
        List< List<Card> > hand = new ArrayList<>();//类似于一个二维数组

        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
        List<Card> hand3 = new ArrayList<>();

        hand.add(hand1);
        hand.add(hand2);
        hand.add(hand3);

        for (int i = 0; i < 5; i++) {//5张牌
            for (int j = 0; j < 3; j++) {//三个人
                Card card = deck.remove(0);//每次去除0号下标
                hand.get(j).add(card);//轮流揭牌
//                List<Card> list = hand.get(j);
//                list.add(card);
            }
        }

        System.out.println("第一个人的牌");
        System.out.println(hand1);

        System.out.println("第二个人的牌");
        System.out.println(hand2);

        System.out.println("第三个人的牌");
        System.out.println(hand3);

        System.out.println("剩下的牌");
        System.out.println(deck);

    }
}

