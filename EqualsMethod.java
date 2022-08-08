public class EqualsMethod {

    /*
    equals() 才是比较对象的实际内容
     */
    public static void main(String[] args){
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);

        System.out.println(n1.equals(n2));
    }
}
