import java.util.Random;

public class CoinToss {
    public static void main(String[] args){
        Random rand = new Random();

        int coin = rand.nextInt();

        if(coin % 2 == 0){
            System.out.print("Head");
        }else{
            System.out.print("Tail");
        }
    }
}
