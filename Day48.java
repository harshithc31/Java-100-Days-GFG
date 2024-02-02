//Merge 2 sorted linked list in reverse order
//Given two linked lists of size N and M, which are sorted in non-decreasing order. The task is to merge them in such a way that the resulting list is in non-increasing order.

class GfG {
    Node mergeResult(Node node1, Node node2) {
	  // Your code here	
	    Node prev = null;
	    Node temp = null;
	    while(node1!=null &&node2!=null){
	        if(node1.data<=node2.data){
	            temp = node1;
	            node1 = node1.next;
	        }else{
	            temp = node2;
	            node2 = node2.next;
	        }
	        temp.next = prev;
	        prev = temp;
	    }
	    while(node1!=null){
	        temp = node1;
	        node1 = node1.next;
	        temp.next = prev;
	        prev = temp;
	    }
	    
	    while(node2!=null){
	        temp = node2;
	        node2 = node2.next;
	        temp.next = prev;
	        prev = temp;
	    }
	    
	    return prev;
    }
}
