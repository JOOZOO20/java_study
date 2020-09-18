import java.util.Scanner;
import static java.lang.Math.sqrt;

public class 과제2 {
    public static void main (String[] args){
        int n;
        System.out.println("숫자를 입력하세요");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i <= n * 2; i++) {
            for (int j = 0; j <= n * 2; j++) {
                int d = (int) sqrt(((i - n) * (i - n)) + ((j - n) * (j - n)));
                if (d <= n) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}