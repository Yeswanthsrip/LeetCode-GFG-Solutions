/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        if(head==null){
            Node la=new Node(x);
            head=la;
            return head;
        }
        int c=0;
        Node p=head;
        while(p!=null){
            c++;
            p=p.next;
        }
        if(c%2!=0){
            c=c/2+1;
        }
        else
            c=c/2;
        p=head;
        for(int i=1;i<c;i++){
            p=p.next;
        }
        Node la=new Node(x);
        la.next=p.next;
        p.next=la;
        return head;
    }
}