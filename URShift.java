/*
 * Test of left and right shift
 * Test of unsigned right shift
 */
public class URShift {
    public static void main(String[] args){
        int a = 1;
        System.out.println("a: " + (Integer.toBinaryString(a)));
        a <<= 10;                                            //左移一位
        System.out.println("a<<= 10: " + (Integer.toBinaryString(a)));

        int a1 = 1;
        a1 >>= 10;                                            //右移一位
        System.out.println("a1>>= 10: " + (Integer.toBinaryString(a1)));

        int i = -1;
        System.out.println("i: " + (Integer.toBinaryString(i)));

        //无论正负，都在高位插入0。
        i >>>= 10;
        System.out.println("i: " + (Integer.toBinaryString(i)));

        long l = -1;
        System.out.println("l: " + (Long.toBinaryString(l)));

        l >>>= 10;
        System.out.println("l: " + (Long.toBinaryString(l)));

        short s = -1;
        System.out.println("s: " + (Integer.toBinaryString(s)));

        s >>>= 10;
        System.out.println("s: " + (Integer.toBinaryString(s)));

        byte b = -1;
        System.out.println("b: " + (Integer.toBinaryString(b)));

        b >>>= 10;
        System.out.println("b: " + (Integer.toBinaryString(b)));

        b = -1;
        System.out.println("b: " + (Integer.toBinaryString(b)));

        //因为没有赋值给b，而是直接打印出来，所以其结果是正确的。
        System.out.println("b: " + (Integer.toBinaryString(b >>> 10)));
    }
}
