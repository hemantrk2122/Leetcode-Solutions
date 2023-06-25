package DoublyLinkedList;

public class DoublyLinkedList {
    public static void main(String[] args){
        MyDoublyLinkedList list = new MyDoublyLinkedList(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.printDLL();
    }
}

class ListNode{
    int data;
    ListNode next;
    ListNode prev;
    ListNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class MyDoublyLinkedList{
    ListNode head;
    MyDoublyLinkedList(int data){
        head = new ListNode(data);
    }

    void printDLL(){
        ListNode curr = head;
		while(curr!=null){
			System.out.print(curr.data+"<->");
			curr = curr.next;
		}
		System.out.println("null");
    }

    // inserting an element at start
    void push(int data){
        ListNode node = new ListNode(data);
        node.next = head;
        head.prev = node;
        head = node;
    }
}
