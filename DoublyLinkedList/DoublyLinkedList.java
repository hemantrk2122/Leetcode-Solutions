package DoublyLinkedList;

public class DoublyLinkedList {
    public static void main(String[] args){

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
}
