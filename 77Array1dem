// 배열은 같은 타입의 나열이다. 배열은 new로 생성하는 동적 배열이 있고 new 없이 사용하는 정적배열이 있다. 사용 방법은 동일하나 선언 방법 다르다. 동적배열은 필요할때마다 다시 초기화 할수 있고 정적은 초기화 할수 없다. 

import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int [] a;  // 배열 선언

    a= new int[5];

    a[0] = 2;
    a[1] = 5;
    a[2] = 3;
    a[3] = 9;
    a[4] = 8;

    int [] b = new int[]{2,5,4,9,8};

    int [] c ={2,5,3,9,8};  //정적 , 다시 대입 불가

    int [] e = new int[5];  //int 타입 5개 배열 생성 
    Arrays.fill(e,-1); // 5개를 모두 -1 채운다. 

    System.arraycopy(c,0,e,0,c.length);

    Arrays.sort(e); // 오름차순 정렬

    print(e);

    e = new int[]{1,2,3,4,5,6}; //동적 배열은 다시 초기화 가능 
    print(e);
  }
    public static void print(int[] a){
      for(int i = 0 ; i < a.length ; i++){
        System.out.print(a[i]+"\t");
      }
      System.out.println();
    }


}
