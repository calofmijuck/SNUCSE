import java.util.NoSuchElementException;

public class MyList implements LList {
    private ListNode front;
    private int size;

    public MyList() {
        front = null;
        size = 0;
    }

    public void add(int n){
        if(front == null){
            front = new ListNode(n);
        }
        else{
            ListNode prev = null;
            ListNode current = front;
            while(current.data < n && current.next != null){
                prev = current;
                current = current.next;
            }
            if(current.data < n){
                current.next = new ListNode(n);
            }
            else if(prev == null){
                front = new ListNode(n, current);
            }
            else{
                prev.next = new ListNode(n, current);
            }
        }
        size++;
    }

    public int removeFront(){
        if(front == null){
            throw new NoSuchElementException();
        }
        else{
            int result = front.data;
            front = front.next;
            return result;
        }
    }

    public int removeLast(){
        if(front == null){
            throw new NoSuchElementException();
        }
        else{
            ListNode current = front;
            while(current.next.next != null){
                current = current.next;
            }
            int result = current.next.data;
            current.next = null;
            return result;
        }
    }

    public void remove(int a){
        if(a == front.data){
            front = front.next;
        }
        else{
            ListNode current = front;
            while(current.next.data != a){
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    public String toString(){
        return report(front);
    }

    private String report(ListNode n){
        if(n.next == null){
            return Integer.toString(n.data);
        }
        else{
            return n.data + " " + report(n.next)  ;
        }
    }
}
