// ArrayList
// add(value)         : ArrayList의 끝에 값을 추가
// add(index, value)  : 특정 위치 index 삽입
// clear()            : 지우고싶을때 리스트 초기화      
// indexOf(value)     : 특정 값의 위치값을 반환 // get과 반대의 개념
// get(index)         : 특정 위치 값을 반환
// remove(index)      : 특정 위치 값을 삭제
// set(index,value)   : 특정 위치 값을 value 값으로 변경
// size(index)        : 갯수를 반환
// toString()         : 리스트 전체의 목록을 반환

import java.util.*;

class Main{
  public static void main(String[] args) {
    
    List<String> TestList = new ArrayList<String>();

    TestList.add("One"); //리스트의 끝에 추가
    TestList.add("Two");
    TestList.add("Three");
    TestList.add(0, "Big Data");
    TestList.add(3, "Test");

    System.out.println();
    System.out.println();

  
    // System.out.println(TestList.indexOf("Three"));

    TestList.set(3,"삼");

    // TestList.remove(3);
    
    System.out.println(TestList.get(3));  // 특정 위치의 값을 반환 
    System.out.println(TestList.size()); // 전체의 갯수를 반환 
    System.out.println(TestList.toString()); // 전체목록을 반환 


    //TestList.clear(); 리스트 초기화

    // for(String i: TestList) {
      // System.out.println(i);
      

    }


    //System.out.println("hellow world");
  }

