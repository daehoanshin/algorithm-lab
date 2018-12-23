package bit.operation;

public class Test6 {
	static int updateBit(int num, int i, boolean val) {
		return (num & ~(1 << i)) | ((val ? 1:0) << i);
	}
	public static void main(String[] args) {
		// 10101001
		// 10100001
		System.out.println(updateBit(169, 3, true));
	}
}
