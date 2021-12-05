package practice_final_2522;

class Generic<T> {
	public static <T> void swap(T t, T x){
		T temp = t;
		t = x;
		x = temp;
	}


	public void something() {}; // this type parameter is infered by the classes type parameter

  public static void main(String[] args) {
    int x = 1;
    Generic.swap(x, 2);
    swap(1, 2);
  }
}
