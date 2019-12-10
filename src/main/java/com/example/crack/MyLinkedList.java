package com.example.crack;

class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

class MyLinkedList {

    ListNode head;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        head = new ListNode();
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            return -1;
        } else {
            return temp.val;
        }
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        if (head.val == 0 && head.next == null) {
            newNode.next = null;
            newNode.val = val;
        } else {
            newNode.next = head;
        }
        head = newNode;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        ListNode newNode = new ListNode(val);
        temp.next = newNode;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
            return;
        }
        ListNode prevNode = head;
        ListNode nextNode = head;
        for (int i = 0; i < index; i++) {
            if (nextNode == null) {
                return;
            }
            if (nextNode.next == null) {
                addAtTail(val);
                return;
            }
            prevNode = nextNode;
            nextNode = nextNode.next;
        }
        ListNode newNode = new ListNode(val);
        prevNode.next = newNode;
        newNode.next = nextNode;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        ListNode prevNode = head;
        ListNode actualNode = head;
        if(index == 0){
            actualNode = actualNode.next;
            head = actualNode;
            return;
        }
        for (int i = 0; i < index; i++) {
            prevNode = actualNode;
            actualNode = actualNode.next;
        }
        if(actualNode == null) {
            return;
        }
         prevNode.next = actualNode.next;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */