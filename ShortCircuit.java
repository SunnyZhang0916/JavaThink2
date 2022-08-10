//Demonstrate short-circuiting behavior with logical operators
public class ShortCircuit {

    //这里使用static就不需要在调用的时候再new()
    static boolean test1(int val){
        System.out.println("test1(" + val + ")");
        System.out.println("Result: " + (val < 1));
        return val < 1;
    }

    static boolean test2(int val){
        System.out.println("test2(" + val + ")");
        System.out.println("Result: " + (val < 2));
        return val < 2;
    }

    static boolean test3(int val){
        System.out.println("test3(" + val + ")");
        System.out.println("Result: " + (val < 3));
        return val < 3;
    }

    public static void main(String[] args){

        //当 test2 生成false的时候，产生短路现象。也就是没有必要再继续计算
        boolean b = test1(0) && test2(2) && test3(2);

        System.out.println("expression is" + b);
    }

}
