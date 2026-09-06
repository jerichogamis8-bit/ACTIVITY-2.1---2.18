public class FormatOutput {
    public static void main(String[] args) {

        int age = 18;
        double money = 969;

        System.out.println("Age is " + age);
        System.out.println("Money is Php " + money);
        System.out.println("After Format:");
        System.out.printf("Age is %d and money is Php%.2f", age, money);
    }
}
