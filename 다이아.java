import java.util.Scanner;

public class 과제1 {
    public static void main(String[] args) {
        System.out.println("홀수를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cal=num/2+1;
        //상단부
        for(int i=0;i<cal;i++){
            for(int a=0;a<cal-1-i;a++){
                System.out.print(" ");
            }
            for(int b=0;b<2*i+1;b++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //하단부
        for(int i=cal;i>0;i--){
            for(int c=0;c<cal-i+1;c++){
                System.out.print(" ");
            }
            for(int d=2*i-3;d>0;d--){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}