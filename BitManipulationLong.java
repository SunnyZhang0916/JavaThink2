import java.util.Random;

public class BitManipulationLong {
    public static void main(String[] args){
        Random rand = new Random(47);

        long l = rand.nextLong();
        long m = rand.nextLong();

        System.out.println("l: " + l);
        System.out.println("m: " + m);
        System.out.println("-1L:    " +  Long.toBinaryString(-1L));
        System.out.println("+1L: " +  Long.toBinaryString(+1L));

        long ll = 923372036854775807L;
        System.out.println("maxpos    : " +  Long.toBinaryString(ll));

        long lln = -923372036854775808L;
        System.out.println("maxneg: " +  Long.toBinaryString(lln));

        System.out.println("l: " + Long.toBinaryString(l));
        System.out.println("~l: " + Long.toBinaryString(~l));
        System.out.println("-l: " + Long.toBinaryString(-l));

        System.out.println("m   : " + Long.toBinaryString(m));
        System.out.println("~m: " + Long.toBinaryString(~m));
        System.out.println("-m: " + Long.toBinaryString(-m));

        System.out.println("l: " + Long.toBinaryString(l));
        System.out.println("m  : " + Long.toBinaryString(m));
        System.out.println("l & m   : " + Long.toBinaryString(l&m));
        System.out.println("l & m   : " + (l&m));

        System.out.println("l    : " + Long.toBinaryString(l));
        System.out.println("m    : " + Long.toBinaryString(m));
        System.out.println("l | m: " + Long.toBinaryString(l|m));

        System.out.println("l ^ m  : " + Long.toBinaryString(l^m));

        System.out.println("l << 5: " + Long.toBinaryString(l<<5));
        System.out.println("l >> 5:" + Long.toBinaryString(l>>5));

        System.out.println("~l:  " + Long.toBinaryString(~l));
        System.out.println("(~l) >> 5:" + Long.toBinaryString((~l)>>5));

        System.out.println("l    : " + Long.toBinaryString(l));
        System.out.println("l >>> 5    :" + Long.toBinaryString(l>>>5));

        System.out.println("~l    : " + Long.toBinaryString(~l));
        System.out.println("(~l) >>> 5  :" + Long.toBinaryString((~l)>>>5));
    }
}
