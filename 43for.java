//for 명확할때
//while 불명확할때  ( 끝나는 조건이 명확할때)

//입력받은 temp가 1이 될때까지 while 구문 반복
// temp 홀수이면 3배값에 1을 더하고 
// temp 짝수이면 2로 나눈다
// do~while은 적어도 한번 반드시 실행 조건문 아래에서 판단함 

import java.util.*;

class Main {
  public static void show(int n ){
    int temp = n;

    for(temp=0; temp != 1;) {
      if(temp%2==1){
        temp = temp*3+1;
      }else{
        temp/=2;
      }
  }
  System.out.println("["+temp+"]");
  }

  public static void main(String[] args) {
    show(122);
  }
}
