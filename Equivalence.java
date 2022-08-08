public class Equivalence {
    public static void main(String[] args){
        /*
        因为对象的引用不同，而 == 和 != 比较的就是对象的引用。
         */

        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);

        System.out.println(n1 == n2);   //false
        System.out.println(n1 != n2);   //true
    }
}
