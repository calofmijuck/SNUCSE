public interface LList {
	public void add(int a); //insert in sorted order
	public int removeFront(); //removes first element and returns
	public int removeLast();  //removes last element and returns
	public void remove(int a); //remove element that hold a
	public String toString(); //report every element of linked list
}