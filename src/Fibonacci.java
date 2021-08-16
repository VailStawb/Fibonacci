
public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(FibNum(5) == 3);
        System.out.println(FibNum(4) == 2);
        System.out.println(FibNum(3) == 1);

        System.out.println(FibNum(1) == 0);
        System.out.println(FibNum(2) == 1);
    }

    public static int FibNum(int n) {

        int num1 = 0;
        int num2 = 1;
        int num3 = 1;

        for (int i = 0; i < n - 2; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        if (n == 1) {
            num3 = 0;
        } else if (n <= 0) {
            System.out.println("n has to be more than 0 !");
            return -1;
        }
        return num3;
    }
}

