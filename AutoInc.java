public class AutoInc {
    public static void main(String[] args){
        int i = 1;

        /*
        前缀递增 ++i ： 先执行运算，再生成值

        后缀递增 i++ ： 先生成值，再执行运算
         */

        System.out.println("++i: " + ++i);
        System.out.println("i++: " + i++);
        System.out.println("i:   " + i);

        System.out.println("--i: " + --i);
        System.out.println("i--: " + i--);
        System.out.println("i:   " + i);
    }
}
