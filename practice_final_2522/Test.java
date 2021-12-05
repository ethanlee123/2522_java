package practice_final_2522;

interface Factory<T>{
	T create();
}

class Foo <T>{
	T t;
	public Foo(Factory<T> myFactory){
		// t = new T();//illegal - b/c 
		t = myFactory.create();
    System.out.println(t);
	}
}
class IntegerFactory<T> implements Factory<Integer>{
	public Integer create(){
		return new Integer(123123); //deprecated
	}
}
public class Test {
	public static void main(String[] args){
		Foo<Integer> fi = new Foo<Integer>(
			new IntegerFactory()
		);
	}
}
