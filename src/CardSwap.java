public class CardSwap {
    static final char suits[] ={'H','S','D','C'};
    static final String ranks[] ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    static Card[] cards=new Card[52];
    /**
     * 初始化扑克牌数组
     */
    public static void init(){
        for(int i=0;i<suits.length;i++){
            for(int j=0;j<ranks.length;j++){
                cards[i*ranks.length+j]=new Card(ranks[j], suits [i]);
            }
        }
    }
    public static void swap1(Card c1,Card c2){
        Card c=c1;
        c1=c2;
        c2=c;
    }
    public static void swap1(int i,int j){
        Card c=cards[i];
        cards[i]=cards[j];
        cards[j]=c;
    }
    public static void swap2(Card c1,Card c2){
        char s=c1.suit;
        c1.suit=c2.suit;
        c2.suit=s;
        String r=c1.rank;
        c1.rank=c2.rank;
        c2.rank=r;
    }
    /**
     * @param args
     */
    public static void main( String[] args) {
        init();
        //任取两张牌
        Card c1=cards[10];
        Card c2=cards[12];
        System.out.println("第11张牌是："+c1+"\t第13张牌是："+c2);

        swap1(c1,c2);
        System.out.println("执行swap1(c1,c2)后");
        System.out.println("c1引用的牌是："+c1+"\tc2引用的牌是："+c2);
        System.out.println("第11张牌是："+cards[10]+"\t第13张牌是："+cards[12]);

        swap1(10,12);
        System.out.println("执行swap1(10,12)后");
        System.out.println("c1引用的牌是："+c1+"\tc2引用的牌是："+c2);
        System.out.println("第11张牌是："+cards[10]+"\t第13张牌是："+cards[12]);

        swap2(c1,c2);
        System.out.println("执行swap2(c1,c2)后");
        System.out.println("c1引用的牌是："+c1+"\tc2引用的牌是："+c2);
        System.out.println("第11张牌是："+cards[10]+"\t第13张牌是："+cards[12]);

    }
}
