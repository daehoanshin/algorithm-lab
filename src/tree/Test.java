package tree;
class Tree {
	class Node {
		int data;
		Node left, right;
		Node(int data) {
			this.data = data;
		}
	}
	Node root;
	static int pIndex = 0;
	public void buildTreeByInPre(int in[], int pre[]) {
		pIndex = 0;
		root = buildTreeByInPre(in, pre, 0, in.length - 1);
	}
	private Node buildTreeByInPre(int[] in, int[] pre, int start, int end) {
		if(start > end) return null;
		Node node = new Node(pre[pIndex++]);
		if(start == end) return node;
		int mid = search(in, start, end, node.data);
		node.left = buildTreeByInPre(in, pre, start, mid - 1);
		node.left = buildTreeByInPre(in, pre, mid  + 1, end);
		return node;
	}
	private int search(int[] in, int start, int end, int data) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class Test {

}
