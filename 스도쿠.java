import java.util.Random;
import java.util.Scanner;

public class 스도쿠1 {
    public static void main(String[] args) {
        int size = 0; //사용자의 입력값을 나타낼 변수 size
        int rand;
        Random random = new Random(System.currentTimeMillis()); //시간을 seed로 랜덤발생하게끔 설정
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("숫자를 입력하세요(2이상의 값을 입력하세요.)");
            size = sc.nextInt(); //사용자가 입력한 값을 변수 size에 저장함.
            if (size < 2) {
                System.out.println("2 이상 숫자를 입력바랍니다.");
            } else {
                break; //사용자가 입력한 값이 2이상이라면 지금 이 while문은 종료
            }
        }


        //2차원 배열 size크기로 생성
        int array_2[][] = new int[size][size]; //array_2 2차원에배열에 입력값*입력값의 크기를 저장

        //0으로 초기화
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array_2[i][j] = 0;
            }
        }
        //랜덤상수 size만큼 자연수가들어가게함
        rand = random.nextInt(size) + 1;
        int a;
        int b;
        int row; //열(가로)
        int col; //행(세로)
        boolean isSame = true;
        int loopCount = 0;



        Loop2: while (true) {
            loopCount=0;//초기화

            for (int i = 0; i < size; i++) { //배열 위치 선정하는 루프
                for (int j = 0; j < size; j++) {
                    col= i; //아이(행담당).
                    row = j; //제이(열담당).


                    Loop1:
                    while (true) {
                        rand = random.nextInt(size) + 1;
                        array_2[i][j] = rand;


                        System.out.println(row);
                        /*System.out.println(col);*/
                        //기준 왼쪽값들 일치유무검사
                        for (a = row - 1; a >= 0; a--) {
                            while (isSame == true) {


                                if (array_2[i][j] == array_2[i][a]) {
                                    isSame = true;
                                    continue Loop1;
                                } else {
                                    isSame = false;
                                }
                            }
                            isSame = true;//빠져나오면 다시 초기화
                        }


                        //기준 위쪽값들 일치유무검사
                        for (b = col - 1; b >= 0; b--) {
                            while (isSame == true) {
                                if (array_2[i][j] == array_2[b][j]) {
                                    loopCount++;
                                    if (loopCount > 300) { //마지막에 가까운 값이 가로 세로 겹쳐서 무한루프가 도는 경우가 발생하는데 300번이상 루프를 돌면 처음부터 스도쿠를 짜게한다.
                                        continue Loop2;
                                    }

                                    isSame = true;
                                    continue Loop1;
                                } else {
                                    isSame = false;
                                }
                            }
                            isSame = true;//빠져나오면 다시 초기화
                        }


                        break;
                    }
                }
            }