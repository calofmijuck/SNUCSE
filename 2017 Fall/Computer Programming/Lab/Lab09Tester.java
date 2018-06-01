public class Lab09Tester {
	public static void main(String[] args) {
		Lab09Tree a = new Lab09Tree();
		a.insert(10);
		a.insert(5);
		a.insert(2);
		a.insert(15);
		a.insert(20);
		a.insert(13);
		a.insert(11);
		a.insert(7);
		a.insert(6);
		a.insert(8);
		a.remove(5);
		
		System.out.println("preorder   : " + a.preorder());
		System.out.println("inorder    : " + a.inorder());
		System.out.println("postorder  : " + a.postorder());
		System.out.println("levelorder : " + a.levelorder());
		System.out.println("print sideways\n" + a.printSideways());
	}
}