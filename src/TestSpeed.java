import java.util.Scanner;

class Speed{
    double distance;
    double time;

    public double sped(double a, double b){
        double s;

        distance = a;
        time = b;
        s = a/b;

        System.out.println(s);

        return s;
    }
}
public class TestSpeed {
    public static void main(String[] args){
        Speed sp = new Speed();

        Scanner sc = new Scanner(System.in);

        System.out.print("Please input the distance: ");

        double distance = sc.nextInt();

        System.out.print("Please input the time: ");

        double time = sc.nextDouble();

        sp.sped(distance,time);
    }
}
