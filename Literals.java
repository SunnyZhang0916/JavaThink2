//operators
public class Literals {
    public static void main(String[] args){
        int i1 = 0x2f;      //Hexadecimal (lowercase)
        System.out.println("i1: " + i1);
        System.out.println("i1: " + Integer.toBinaryString(i1));
        System.out.println("i1: " + Integer.toHexString(i1));

        int i2 = 0X2F;      //Hexadecimal (uppercase)
        System.out.println("i2: " + i2);
        System.out.println("i2: " + Integer.toBinaryString(i2));

        int i3 = 0177;      //Octal (leading zero)
        System.out.println("i3: " + i3);
        System.out.println("i3: " + Integer.toBinaryString(i3));

        char c = 0xffff;    //max char hex value
        System.out.println("c: " + Integer.toHexString(c));
        System.out.println("c: " + Integer.toBinaryString(c));

        byte b = 0x7f;      //max byte hex value
        System.out.println("b: " + b);
        System.out.println("b: " + Integer.toBinaryString(b));

        short s = 0x7fff;   //max short hex value
        System.out.println("s: " + s);
        System.out.println("s: " + Integer.toBinaryString(s));
        System.out.println("s: " + Integer.toHexString(s));

        long n1 = 200L;                                          //long suffix
        System.out.println("n1: " + n1);
        System.out.println("n1: " + Long.toBinaryString(n1));    //long无法转换成int

        long n2 = 200l;                                         //long suffix (but can be confusing)
        System.out.println("n2: " + n2);
        System.out.println("n2: " + Long.toHexString(n2));

        long n3 = 200;                                           //long suffix
        System.out.println("n3: " + n3);
        System.out.println("n3: " + Long.toBinaryString(n3));
        System.out.println("n3: " + Long.toHexString(n3));

        float f1 = 1;
        System.out.println("f1: " + f1);
        System.out.println("f1: " + Float.floatToIntBits(f1));

        float f2 = 1F;
        System.out.println("f2: " + f2);
        System.out.println("f2: " + Float.floatToIntBits(f2));

        float f3 = 1f;
        System.out.println("f3: " + f3);
        System.out.println("f2: " + Float.floatToIntBits(f2));

        double d1 = 1d;                                          //double suffix
        System.out.println("d1: " + d1);
        System.out.println("d1: " + Double.toHexString(d1));
        System.out.println("d1: " + Double.doubleToLongBits(d1));

        double d2 = 1D;                                          //double suffix
        System.out.println("d2: " + d2);
        System.out.println("d2: " + Double.toHexString(d2));
        System.out.println("d2: " + Double.doubleToLongBits(d2));
    }
}
