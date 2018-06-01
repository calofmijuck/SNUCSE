public class S11_1 {
    public static void main(String[] args) {
	LinkedIntList list = new LinkedIntList();
	list.add(1);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(9);
	list.add(100);
	list.add(72);
	list.add(85);
	System.out.println(list);
	System.out.println(list.contains(11));
	System.out.println(list.indexOf(100));
	System.out.println(list.isEmpty());
	list.remove();
	list.remove(4);
	System.out.println(list);
	System.out.println(list.get(2));
	System.out.println(list.size());
    }
}
