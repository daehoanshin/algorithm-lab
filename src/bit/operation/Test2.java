package bit.operation;

public class Test2 {
	static int setBit(int num, int i) {
		System.out.println((1 << i));
		return num | (1 << i); 
	}
	public static void main(String[] args) {
		// 0 1 0 1
		System.out.println(setBit(5, 3));
	}
}
