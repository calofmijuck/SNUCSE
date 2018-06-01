import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Lab09Tree {
	private Lab09Node root;
	private LinkedList<Lab09Node> list = new LinkedList<>();

	public void insert(int v) {
		root = insert(v, root);
	}
	private Lab09Node insert(int v, Lab09Node n) {
		if (n == null) {
			n = new Lab09Node(v);
		} else if (n.val > v) {
			n.left = insert(v, n.left);
		} else if (n.val < v) {
			n.right = insert(v, n.right);
		}

		return n;
	}

	public void remove(int v) {
		root = remove(v, root);
	}

	private Lab09Node remove(int v, Lab09Node n) {
		if (n == null) {
			return null;
		} else if (n.val > v) {
			n.left = remove(v, n.left);
		} else if (n.val < v) {
			n.right = remove(v, n.right);
		} else {
			if (n.right == null) {
				return n.left;
			} else if (n.left == null) {
				return n.right;
			} else {
				n.val = getMin(n.right);
				n.right = remove(n.val, n.right);
			}
		}
		return n;
	}
	public int getMin() {
		if (root == null) {
			throw new NoSuchElementException();
		}
		return getMin(root);
	}

	private int getMin(Lab09Node root) {
		if (root.left == null) {
			return root.val;
		} else {
			return getMin(root.left);
		}
	}
	public String preorder() {
		return preorder(root);
	}

	public String inorder() {
		return inorder(root);
	}

	public String postorder() {
		return postorder(root);
	}

	public String levelorder() {
		return levelorder(root);
	}

	public String printSideways() {
		return printSideways(root, "");
	}

	private String preorder(Lab09Node n) {
		String res = "";
		if (n != null) {
			res += n.val + " " + preorder(n.left) + preorder(n.right);
		}
		return res;
	}

	private String inorder(Lab09Node n) {
		String res = "";
		if (n != null) {
			res += inorder(n.left) + n.val + " " + inorder(n.right);
		}
		return res;
	}

	private String postorder(Lab09Node n) {
		String res = "";
		if (n != null) {
			res += postorder(n.left) + postorder(n.right) + n.val +" ";
		}
		return res;
	}

	private String levelorder(Lab09Node n) {
		String res = "";
		if(n != null) {
			list.add(n);
			while(!list.isEmpty()) {
				Lab09Node temp = list.removeFirst();
				res += (temp.val + " ");
				if(temp.left != null){
					list.add(temp.left);
				}
				if(temp.right != null) {
					list.add(temp.right);
				}
			}
		}
		return res;
	}

	private String printSideways(Lab09Node n, String indent) {
		String res = "";
		if (n != null) {
			res += printSideways(n.right, indent + "    ");
			res += indent + n.val + "\n";
			res += printSideways(n.left, indent + "    ");
		}
		return res;
	}
}