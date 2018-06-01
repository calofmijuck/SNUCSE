import java.util.*;

public class LinkedIntList {
    private ListNode front;
    private ListNode end;
    private int size;

    public LinkedIntList() {
	front = null;
	end = null;
	size = 0;
    }

    // Adds the given value to the end of the list.
    public void add(int val) {
	if(front == null) { // Adding to an empty list.
	    front = new ListNode(val);
	    end = front;
	    size++;
	} else { // Adding to the end of an existing list.
	    ListNode current = front;
	    while(current.next != null) {
		current = current.next;
	    }
	    current.next = new ListNode(val);
	    end = current.next;
	    size++;
	}
    }

    // Returns the value in list at given index.
    public int get(int index) {
	ListNode res = front;
	for(int i = 0; i < index; i++) {
	    res = res.next;
	}
	return res.data;
    }

    // Inserts the given value at the given index.
    public void add(int index, int value) {
	if(index == 0) {
	    front = new ListNode(value, front);
	} else {
	    ListNode current = front;
	    for(int i = 0; i < index - 1; i++) {
		current = current.next;
	    }
	    current.next = new ListNode(value, current.next);   
	}
    }

    // Removes and returns the list's first value
    public int remove() {
	if(front == null) {
	    throw new NoSuchElementException();
	}
	int res = front.data;
	front = front.next;
	size--;
	return res;
    }

    // Removes value at given index from list
    public int remove(int index) {
	if(index == 0) {
	    int res = remove();
	    return res;
	} else {
	    ListNode current = front;
	    for(int i = 0; i < index - 1; i++) {
		current = current.next;
	    }
	    int res = current.next.data;
	    current.next = current.next.next;
	    size--;
	    return res;
	}
    }

    // Adds given value to the list in sorted order.
    // Precondition: Existing elements are already sorted.
    public void addSorted(int n) {
	if(front == null || n <= front.data) { // insert at front of the list
	    front = new ListNode(n, front);
	    size++;
	} else { // insert in the middle of the list
	    ListNode current = front;
	    while(current.next != null && current.next.data <= n) {
		current = current.next;
	    }
	    current.next = new ListNode(n, current.next);
	    size++;
	}
    }

    public int size() {
	return size;
    }

    public boolean isEmpty() {
	return (size == 0) ? true : false;
    }

    public void clear() {
	front = null;
    }

    public String toString() {
	String res = "";
	ListNode current = front;
	while(current.next != null) {
	    res += current.data + " ";
	    current = current.next;
	}
	res += current.data;
	return res;
    }

    public int indexOf(int value) {
	int index = 0;
	ListNode current = front;
	for(int i = 0; i < size - 1; i++) {
	    if(current.data == value) {
		return i;
	    } else {
		current = current.next;
	    }
	}
	if(current.data == value) {
	    return size;
	} else{
	    return -1;
	} // Not found
    }

    public boolean contains(int value) {
	ListNode current = front;
	while(current.next != null) {
	    if(current.data == value) {
		return true;
	    } else {
		current = current.next;
	    }
	}
	if(current.data == value) {
	    return true;
	} else {
	    return false;
	}
    }
}
