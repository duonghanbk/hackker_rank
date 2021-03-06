import java.io.*;
import java.util.*;

//khoi tao phan tu
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{
public static Node removeDuplicates(Node head) {
      //Write your code here
        
        //neu dslk rong thi tra ve null
        if(head == null)return null;
        
        //tao phan tu chay current
        Node current = head;
        
        //tao arraylist de chua nhung gia tri da xuat hien truoc do
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //xet tu 2 phan tu tro len, neu dslk co 1 phan tu head thi chi can in ra la duoc
        while( current.next != null){
            
            //bat dau them phan tu do vao arraylist
            list.add(current.data);
            
            //neu gia tri phan tu tiep theo da co trong arraylist thi xoa no
            //nguoc lai thi nhay den phan tu ke tiep
            if(list.contains(current.next.data)){
                
                current.next = current.next.next;
            }else{
                current = current.next;
            }
            
        }
        
        // tra ve head
         return head;
    }
public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }