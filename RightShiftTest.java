/*
    以一个最高有效位为1的二进制数字开始（提示：使用十六进制常量），
    用有符号右移操作符对其进行右移，直至所有的二进制位都被移除为止，
    每移一位都要使用Integer.toBinaryString()显示结果。

    解题思路：
    移位操作处理int类型，其他类型数据进行移位操作时，也会转化成int类型。
    int 类型32位，最高位为1。选择0x80808080（用十六进制表示），
    将所有位移出，且移每一位都要输出：移位32次——循环
 */
public class RightShiftTest {

    public static void main(String[] args){

        int x = 0x80808080;

        for(int i = 0; i < 32; i++){

            x >>= 1;

            System.out.println(Integer.toBinaryString(x) + x);

        }

    }
}
