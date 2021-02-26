

public class hello{
	public static void main(String[] args){
		int a = 8, b = 2;

		a = swap(b, b = a);

		System.out.println(a + " " + b);
	}

	static int swap(int a, int b){
		return a;
	}
}