/*
 * "e" means "10 to the power"
 * Uppercase and lowercase "e" are the same
 *
 * "e" 代表自然对数的基数，约等于2.718
 */
public class Exponents {
    public static void main(String[] args){
        float expFloat = 1.39e-43f;     //= 1.39 x e^-43 但在Java中表示 1.39 x 10^-43

        System.out.println(expFloat);

        double expDouble = 47e47d; //it is the same as 47e47 Because it will automatically double

        System.out.println(expDouble);
    }
}
