import java.util.*;
class Node{
    public Object item;
    public Node next;
}
public class dsa7 {
    private int size;
    private Node head;

   public dsa6(){
        this.size=0;
        this.head= null;   
   }
   public void insertingnode(int i){
    Node node= new Node();
    node.item= i;
    Node current=this.head;
    if (this.head==null){
        this.head=node;
        this.head.next= null;
        this.size=1;
    }else{
        while(current.next!=null){
            current=current.next;
        }
        current.next=node;
        node.next=null;
        this.size+=1;
    }
   }
   public void display(){
    Node current=this.head;
    for(int i=0;i<size;i++){
        System.out.print(current.item+" ");
        
        current=current.next;
    }
    System.out.println();
}
public void removeduplicate(){
    Node temp1=this.head;
    Node temp2=null;
    Node temp3=null;
    while(temp1 != null && temp1.next!=null){
        temp2=temp1;
        while(temp2.next!=null){
            if(temp1.item == temp2.next.item){
                temp2.next=temp2.next.next;
            }
            else {
                temp2=temp2.next;
            }
        }
        temp1=temp1.next;
    }
}
public static void main(String[] args) {
    dsa7 list=new dsa7();
    list.insertingnode(2);
    list.insertingnode(5);
    list.insertingnode(12);
    list.insertingnode(2);
    list.insertingnode(3);
    list.insertingnode(5);
    list.insertingnode(1);
    list.insertingnode(2);
    list.insertingnode(5);
    list.insertingnode(5);
    list.display();
    list.removeduplicate();
    list.display();
}
}
