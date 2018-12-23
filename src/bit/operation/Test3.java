package bit.operation;

public class Test3 {
	static int clearBit(int num, int i) {
		return num & ~(i << i);
	}
	public static void main(String[] args) {
		// 1 0 0 1
		System.out.println(clearBit(9, 3));
	}
}
