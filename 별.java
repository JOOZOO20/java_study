import java.util.Scanner;

public class test {
    public static void main (String[] args){
        int n;
        System.out.println("홀수를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i += 2) {
            //입력한 수만큼 오른쪽으로 삼각형 땡겨줌
            for (int a = 0; a < n; a++) {
                System.out.print("  ");
            }
            //나머지는 마름모할때 윗부분삼각형과 동일함
            for (int j = n; j >= i; j -= 2) {
                System.out.print("  ");
            }
            for (int star = 0; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         *   중단
         * */
        int count = n * 3; //중단의 최대길이

        for (int i = 0; i < n / 2 + 1; i++) { //높이를 입력한 크기의 2분의1정도로 하여 균형을 맞춤
            System.out.print("  ");   //줄맞춤용
            for (int j = 0; j < i; j++) { // i의 크기만큼 공백을 줘서 별이 찍힐 시작점을 맞춤(i는 1씩 증가하니깐 공백도 1씩 증가
                System.out.print("  ");
            }
            for (int k = 0; k < n * 3; k++) { //입력한 크기의 3배만큼 별을 찍어야함
                if (k < count) {    //단, count라는 개수보다 적을때만 별을 찍음(count는 별의 개수를 나타내는 변수임, 2개씩 줄어들게 해놨음)
                    System.out.print("* ");
                }

            }
            //몸통 한줄 더 키울려고 추가함
            if(i == n/2){
                System.out.println();
                System.out.print("  ");   //줄맞춤용
                for (int j = 0; j < i; j++) { // i의 크기만큼 공백을 줘서 별이 찍힐 시작점을 맞춤(i는 1씩 증가하니깐 공백도 1씩 증가
                    System.out.print("  ");
                }
                for (int k = 0; k < n * 3; k++) { //입력한 크기의 3배만큼 별을 찍어야함
                    if (k < count) {    //단, count라는 개수보다 적을때만 별을 찍음(count는 별의 개수를 나타내는 변수임, 2개씩 줄어들게 해놨음)
                        System.out.print("* ");
                    }

                }
            }

            count -= 2; //다음에 찍힐 별을 2개줄임
            System.out.println();
        }

        /*
         *    하단
         * */
        count = n;//왼쪽밑둥용(중단에서 사용한거 재활용)
        int count2 = 0;//오른쪽밑둥용
        for (int i = 0; i < n/2+1; i++) {   //하단줄의 개수를 밑변개수의 절반만큼으로함
            System.out.print("  ");
            for (int j = i; j < n / 2; j++) {   //절반만큼의 공백을 띄움
                System.out.print("  ");
            }
            //별(왼쪽밑)
            for (int k = 0; k < n; k++) { //입력개수만큼 별찍기를하는데 k가 count보다 작을때만 별을 찍음
                if (k < count) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  "); //정가운데 공백

            //count2를 이용해 오른쪽밑둥을 오른쪽을 떙겨줌
            for (int j = 0; j < count2; j++) {
                System.out.print("  ");
            }
            //별(오른쪽밑)
            for (int k = 0; k < n; k++) {
                if (k < count) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            count -= 2;
            count2 += 4;
            System.out.println();
        }
    }
}