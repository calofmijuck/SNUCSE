public class IntTreeNode {
    public int data;
    public IntTreeNode left, right;

    public IntTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
