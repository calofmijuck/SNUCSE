public class IntTree {
    private IntTreeNode overallRoot;

    public IntTree(IntTreeNode overallRoot) {

    }

    public IntTree(int height) {

    }

    public void print() {
        print(overallRoot);
        System.out.println();
    }

    private void print(IntTreeNode root) {
        if(root != null) {
            print(root.left);
            System.out.println(root.data + " ");
            print(root.right);
        }
    }
}
