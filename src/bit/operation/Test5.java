package bit.operation;

public class Test5 {
	static int clearRightBit(int num, int i) {
		return num & (-1 << (i+1));
	}
	public static void main(String[] args) {
		// 10101001
		// 10100000
		System.out.println(clearRightBit(169, 3));
	}
}
