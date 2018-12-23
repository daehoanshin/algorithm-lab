package bit.operation;

public class Test {
	static boolean getBit(int num, int i) {
		return (num & (1 << i)) != 0; 
	}
	public static void main(String[] args) {
		// 1 0 0 1 
		System.out.println(getBit(9, 3));
		// 0 1 0 1 
		System.out.println(getBit(5, 3));
	}
}
