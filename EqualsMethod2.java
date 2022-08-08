class value{
    int i;
}
public class EqualsMethod2 {
    public static void main(String[] args){
        value v1 = new value();
        value v2 = new value();

        v1.i = v2.i;

        System.out.println(v1.equals(v2));
    }
}
