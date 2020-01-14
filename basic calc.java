import java.util.Scanner;

class calc {
    public static void main(String args[]) {
        Scanner cal = new Scanner(System.in);
        double fnum, snum, a;
        a = 0;
        char op;
        System.out.println("Enter first number: ");
        fnum = cal.nextDouble();
        System.out.println("Enter second number: ");
        snum = cal.nextDouble();
        System.out.println(
                "for addition press '+'\nfor subtration press '-'\nfor multiplication press '*'\nfor division press '/'\n ");
        op = cal.next().charAt(0);
        switch (op) {
        case '+':
            a = fnum + snum;
            break;
        case '-':
            a = fnum - snum;
            break;
        case '*':
            a = fnum * snum;
            break;
        case '/':
            a = fnum / snum;
            break;
        default:
            System.out.println("invalid operator.. please restart the program");
        }
        System.out.println("Answer = " + a);

    }
}