//서로 다른 세정수를 만들자
// math.random() 을 사용

class Main {
  public static void main(String[] args) {
    int range = 10;
    int start = 1;
    int a = 0, b = 0, c = 0;
    while(a==b || b==c || c==a){
      a = (int)(range*Math.random()+start);
      b = (int)(range*Math.random()+start);
      c = (int)(range*Math.random()+start);

      //if(a != b &&  b != c && c != a) 
      break;
    }



    System.out.printf("%d\t%d\t%d",a,b,c);
  }
}
