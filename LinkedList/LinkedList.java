package LinkedList;
// import java.util.*;
// import java.lang.*;
// import java.io.*;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
    }
}

class MyLinkedList{
    // Making a head for my LinkedList
    ListNode head;
    
    // Initializing my LinkedList
	MyLinkedList(int val){
		head = new ListNode(val);
	}

    // Pushing a element at start in my LinkedList
	void push(int data){
		ListNode listNode = new ListNode(data);
		listNode.next = head;
		head = listNode;
	}

    // Printing my LinkedList
	void printList(){
		ListNode curr = head;
		while(curr!=null){
			System.out.print(curr.data+"->");
			curr = curr.next;
		}
		System.out.println("null");
	}

    // Deleting first element from my LinkedList
	void deleteFirst(){
		head = head.next;
	}

    // Finding length of my LinkedList
	int findLength(){
		ListNode curr = head;
		int count = 0;
		while(curr!=null){
			count++;
			curr = curr.next;
		}
		return count;
	}

    // Finding middle of my LinkedList
	ListNode findMiddle(){
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

    // inserting at the middle in my LinkedList
	void insertAtMiddle(int data){
		ListNode node = findMiddle();
		ListNode toInsert = new ListNode(data);
		toInsert.next = node.next;
		node.next = toInsert;
	}
}

class LinkedList{
    public static void main(String args[]){
        MyLinkedList list = new MyLinkedList(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		// list.push(7);
		list.printList();
		list.insertAtMiddle(8);
		list.printList();
		// System.out.println(list.findMiddle().data);
    }
}