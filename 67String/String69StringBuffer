// string과 비슷하지만 다른 특징을 가진다.
// string은 새로운 문자열을 얻으면 새로운 주소를 받는다. stringbuffer의 주소는 동일하다. 
class Main {
  public static void main(String[] args) {

    StringBuffer sb1 = new StringBuffer();

    sb1.append("안녕하세요").append("또 만나요").append("안녕");

    System.out.println(sb1.toString() +sb1.hashCode());

    sb1.replace(0,2,"나보기가 역겨워");

    System.out.println(sb1.toString() +sb1.hashCode());

    sb1.reverse();
    System.out.println(sb1.toString()+sb1.hashCode());

    
  }
}

// String은 문자열의 내용이 조금이라도 바뀌거나 또는 concat을 사용하면 새로운 객체를 만든다. 레퍼런스를 잃어버린 객체는 가비지 컬렉션의 대상이 되고 새로운 객체에게 새 주소를 주므로 위치값도 변한다
//그러나 StringBuffer는 원래 있던 객체의 내용만 바뀌어 (주소는 변하지 않고) 뮤터블한 특성이 있어서 StringBuffer의 사용을 권장한다

//3줄요약

// String 내용을 바꾸면 새로 만들어지니까
// 주소나 위치값을 이용한 코딩을 해야한다면
// StringBuffer를 써라 

