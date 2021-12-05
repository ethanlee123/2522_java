package practice_final_2522;

import java.util.ArrayList;

public class Check{
  static void put(ArrayList<? super Integer> list){
      list.add(5);
  }
  static Number get(ArrayList<? extends Number> list){
      list.get(0);
      return list.get(0);
  }
  public static void main(String[] args){	
    ArrayList<Integer> li = new ArrayList<>();
    put(li); 
    get(li); 
    ArrayList<Number> ln = new ArrayList<>();
    put(ln); 
    get(ln);
  }
}
  