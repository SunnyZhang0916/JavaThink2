/*
 * 编写一个具有两个常量值的程序，一个具有交替的二进制位1和0，其中最低有效位为0,
 * 另一个也具有交替的二进制位1和0，但是其最低有效位为1（提示：使用十六进制常量来表示是最简单的方法）。
 * 取这两个值，用按位操作符以所有可能的方式结合运算它们，然后用Interger.toBinaryString()显示
 */
public class BinaryTest {
    static int a = 0x1;
    static int b = 0x0;
    static int c = 0xFFFF;

    public static void main(String[] args){
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + Integer.toBinaryString(c));
        System.out.println("a & b:" + Integer.toBinaryString(a & b));
        System.out.println("a | b:" + Integer.toBinaryString(a | b));
        System.out.println("a ^ b:" + Integer.toBinaryString(a ^ b));
        System.out.println("a & c:" + Integer.toBinaryString(a & c));
        System.out.println("a | c:" + Integer.toBinaryString(a | c));
        System.out.println("a ^ c:" + Integer.toBinaryString(a ^ c));
        System.out.println("b & c:" + Integer.toBinaryString(b & c));
        System.out.println("b | c:" + Integer.toBinaryString(b | c));
        System.out.println("b ^ c:" + Integer.toBinaryString(b ^ c));
        System.out.println("~a:" + Integer.toBinaryString(~a));
        System.out.println("~b:" + Integer.toBinaryString(~b));
        System.out.println("~c:" + Integer.toBinaryString(~c));
    }
}
