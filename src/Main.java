import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = sc.nextInt();
        System.out.println("enter the second number:");
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int multi = a * b;
        int remain = a % b;
        System.out.println("enter the case number!  bro");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println(sum);
                break;
            case 2:
                System.out.println(sub);
                break;
            case 3:
                System.out.println(multi);
                break;
            case 4:
                System.out.println(remain);
                break;
        }

        //@Net_ion...



    }
}