import java.util.Random;

public class CountCoinToss {
    public static void main(String[] args){
        int count_head = 0;
        int count_tail = 0;
        Random rand = new Random();
        //Math.random() 的区别 Random.nextInt(int) 在于前者会return float

        for(int i = 0; i < 1000; i++){
            int coin = rand.nextInt();

            if(coin % 2 == 0){
                count_tail++;
            }else{
                count_head++;
            }
        }
        System.out.println("The amount of Head is " + count_head);
        System.out.println("The amount of Tail is " + count_tail);
    }
}
