package com.example.crack;

public class CheckOutput {

    public static void main(String[] args) {
        //["MyLinkedList","addAtHead","addAtHead","addAtHead","addAtIndex","deleteAtIndex","addAtHead","addAtTail","get","addAtHead","addAtIndex",
        // addAtHead"]
        //[[],[7],[2],[1],[3,0],[2],[6],[4],[4],[4],[5,0],[6]]
//        MyLinkedList linkedList = new MyLinkedList(); // Initialize empty LinkedList
//        linkedList.addAtHead(7);
//        System.out.println(linkedList);
//
//        linkedList.addAtTail(2);
//        System.out.println(linkedList);
//
//        linkedList.addAtTail(1);
//        System.out.println(linkedList);
//
//        linkedList.addAtIndex(3, 0);
//        System.out.println("add"+ linkedList);
//
//        linkedList.deleteAtIndex(2);
//        System.out.println(linkedList);
//
//        linkedList.addAtHead(6);
//        System.out.println(linkedList);
//
//        linkedList.addAtTail(4);
//        System.out.println(linkedList);
//
//        System.out.println(linkedList.get(4));
//        linkedList.addAtHead(4);
//        linkedList.addAtIndex(5,0);
//        linkedList.addAtHead(6);
//
//
//        System.out.println(linkedList);
//        linkedList.deleteAtIndex(0);
//        System.out.println(linkedList);

//        ["MyLinkedList","addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtTail","get","deleteAtIndex",
//        "deleteAtIndex"]
//[[],[2],[1],[2],[7],[3],[2],[5],[5],[5],[6],[4]]

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(2);
        System.out.println(linkedList);

        linkedList.deleteAtIndex(1);
        System.out.println(linkedList);

        linkedList.addAtHead(2);
        linkedList.addAtHead(7);
        linkedList.addAtHead(3);
        linkedList.addAtHead(2);
        linkedList.addAtHead(5);
        linkedList.addAtTail(5);
        linkedList.get(5);
        linkedList.deleteAtIndex(6);
        linkedList.deleteAtIndex(4);

        System.out.println(linkedList);
    }
}
