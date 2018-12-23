package bit.operation;

public class Test4 {
	static int clearLeftBit(int num, int i) {
		return num & ((1 << i) -1);
	}
	public static void main(String[] args) {
		// 10101001
		// 00000001
		
		System.out.println(clearLeftBit(169, 3));
	}
}
