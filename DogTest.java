class Dog{
    String name;
    String says;
}

public class DogTest {
    public static void main(String[] args){
        /*
        创建一个名为Dog类，它包含两个String 域： name 和 says.
        在main() 方法中，创建两个Dog对象，一个名为spot (它的叫声为 “Ruff!”), 另一个名为scruffy (它的叫声为 “Wurf!”).
         */
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "spot";
        dog1.says = "Ruff!";

        dog2.name = "scruffy";
        dog2.says = "Wurf!";

        System.out.println(dog1.name + " says " + dog1.says);
        System.out.println(dog2.name + " says " + dog2.says);

        /*
        创建一个新的Dog 索引，并对其赋值为spot对象。测试用== 和 equals() 方法来比较所有引用的结果。
         */

        Dog dog3 = new Dog();

        /*
        dog3.name = dog1.name;
        System.out.println(dog3 == dog1);           //False
        System.out.println(dog3.equals(dog1));      //False
         */

        dog3 = dog1;

        System.out.println("dog1 == dog3: " + (dog3 == dog1));                          //True
        System.out.println("dog1.name == dog3.name: " + (dog1.name == dog3.name));      //True
        System.out.println("dog1.equals(dog3): " + (dog1.equals(dog3)));                //True


        System.out.println("dog2 == dog3: " + (dog2 == dog3));                          //False
        System.out.println("dog2.equals(dog3): " + (dog2.equals(dog3)));                //False
        System.out.println("dog2.name == dog3.name: " + (dog2.name == dog3.name));      //False

    }
}
