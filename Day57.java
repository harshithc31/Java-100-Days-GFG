//Insertion Sort for Singly Linked List
//Given a singly linked list, sort the list (in ascending order) using insertion sort algorithm.

class Solution {
    public static Node insertionSort(Node head) {
        //code here
        if(head == null || head.next == null) return head;
        Node temp = head;
        Node cur = head.next;
        while(cur != null) {
           while(temp != cur) {
               if(temp.data> cur.data) {
                   int d = temp.data;
                   temp.data = cur.data;
                   cur.data = d;
               }
               temp = temp.next;
               
            }
           temp = head;
           cur = cur.next;
        }
      
        return temp;
    }
}
