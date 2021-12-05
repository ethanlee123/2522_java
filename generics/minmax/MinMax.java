package generics.minmax;

//Make GENERIC
//Test with an array of strings

public class MinMax<T>{

	public static <T> T min(T[] test){
		T result = test[0];
		for (T value : test){
		// if (result.compareTo(value)>0)
			result = value;
		}
		return result;
	}
	public static void main(String[] args){
		Integer test[] = {7,3,8,12,1,5};
    Double test2[] = {1.1, 2.2, 3.3};
		System.out.println("smallest = " + MinMax.min(test));
		System.out.println("smallest = " + MinMax.min(test2));
	}
}
