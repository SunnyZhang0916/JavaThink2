/*
    以一个所有位为1的二进制数字开始，先左移它，
    然后用无符号右移操作符对其右移，直至所有的二进制位都被移除为止，
    每移一位都要使用Integer.toBinaryString()显示结果。

    Note:
    所有位为1  0xffffffff
 */
public class UnsignedRightShift {
    public static void main(String[] args){

        int x = 0xFFFFFFFF;

        System.out.println("x= " + x);
        System.out.println(Integer.toBinaryString(x));

        System.out.println("Move left: " + (x <<= 1));
        System.out.println(Integer.toBinaryString(x));

        System.out.println("Move Right with unsigned without stop: ");

        for(int i = 0; i<32; i++){
            x >>>= 1;
            System.out.println(Integer.toBinaryString(x));
        }
    }
}
