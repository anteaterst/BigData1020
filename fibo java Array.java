//n번째 피보나치 수열 값 : ? 
//n번째 까지의 피보나치 수열 개수 : ? 
//n번째 까지의 모든 피보나치 수열 나열 : [?]
//n번째 까지의 모든 피보나치 수열 합계 : ?

import java.util.*;



class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    List<Integer> ilist = new ArrayList<>();

    ilist.add(0);
    ilist.add(1);
    ilist.add(2);
    
    int n = sc.nextInt();
    int s = 0;

    for (int i = 3; i <=n; i++) {
      // d[i] = d[i - 1] + d[i - 2];
      ilist.add(i, ilist.get(i-1) + ilist.get(i-2));
    }
    
    for(int m:ilist) {
      s += m;
    }
    System.out.println(ilist.get(n));  //수열의 값
    System.out.println(ilist.size()-1); //갯수
    System.out.println(ilist.toString()); //수열 전부
    System.out.println(s); //합계
  }
}
