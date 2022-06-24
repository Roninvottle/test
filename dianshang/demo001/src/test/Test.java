package test;
import java.util.Random;
public class Test {
    public static void main(String[] args) {
        int a = 10000;
        long b = 1000000000000L;
        float c = 3.15F;
        double d = 3.15;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println("********************");
        Random r = new Random();
        //        随机数[0，10）
        int num = r.nextInt(10);

        //        随机数[1，10]
        int num1 = r.nextInt(10) + 1;

        //        随机数[0，10]
        int num2 = r.nextInt(11);

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
    }
}
