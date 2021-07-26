package datastructure;

import java.util.Scanner;

class LLNode{
    int data;
    LLNode next;

    public LLNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListDemo {
 LLNode head;

    private LLNode insertInBeg(int data, LLNode head) {
        LLNode ttemp = new LLNode(data);
        if(head ==  null){
            head = ttemp;
        }else{
            ttemp.next=head;
            head= ttemp;
        }
    return head;
    }


    private int length(LLNode head) {
        LLNode temp = head;
        int c=0;
       while(temp != null){
           temp = temp.next;
           c++;
       }
        return c;
    }

    private LLNode insertInEnd(int nextInt, LLNode head) {
        LLNode ttmp1 = head;
        LLNode ttmp = new LLNode(nextInt);
        if(ttmp1 == null){
            head = ttmp;
        }else {
            while (ttmp1.next != null) {
                ttmp1 = ttmp1.next;
            }

            ttmp1.next = ttmp;
        }

        return head;
    }


    private LLNode delete(int pos, LLNode head) {
        LLNode ttmp = head;
        if(pos == 1){
            head = ttmp.next;
        }else{
            for(int i=1;ttmp!=null && i<pos-1;i++)
                ttmp=ttmp.next;
            ttmp.next=ttmp.next.next;
        }
        return head;
    }
    private void display(LLNode head) {
        LLNode temp = head;
        while(temp != null){
            System.out.println(temp.data+" -> ");
            temp = temp.next;
        }
    }

    private LLNode reverse(LLNode head) {
            LLNode prevLNode=null,curLNode=head,nextLNode=null;
            while(curLNode!=null)
            {
                nextLNode=curLNode.next;
                curLNode.next=prevLNode;

                prevLNode=curLNode;
                curLNode=nextLNode;
            }

            head=prevLNode;
            return head;
    }

    private LLNode insertAtPos(int key, int pos, LLNode head) {
        LLNode ttmp1 = head;
        LLNode ttmp = new LLNode(key);
        int count =0;
        if (pos == 1) {
            ttmp.next=head;
            head=ttmp;
        }else {
            for(int i=1;ttmp1!=null && i<pos;i++)
                ttmp1=ttmp1.next;
            ttmp.next=ttmp1.next;
            ttmp1.next=ttmp;
        }
        return head;
    }

    public static void main(String[] args)
    {
        LinkedListDemo l=new LinkedListDemo();
        l.head=null;
        Scanner in=new Scanner(System.in);
        do
        {
            System.out.println("\n********* MENU *********");
            System.out.println("1.Insert In End");
            System.out.println("2.Insert In Beg");
            System.out.println("3.Insert At A  Particular Pos");
            System.out.println("4.Delete At a Pos");
            System.out.println("5.Length");
           // System.out.println("6.Reverse");
            System.out.println("7.Display");
            System.out.println("8.EXIT");
            System.out.println("enter ur choice : ");
            int n=in.nextInt();
            switch(n)
            {case 1: System.out.println("enter the value ");
                l.head=l.insertInEnd(in.nextInt(),l.head);
                break;
                case 2: System.out.println("\nenter the value");
                    l.head=l.insertInBeg(in.nextInt(),l.head);
                    break;
                case 3: System.out.println("\nenter the value");
                    l.head=l.insertAtPos(in.nextInt(),in.nextInt(),l.head);
                    break;
                case 4:
                    l.head=l.delete(in.nextInt(),l.head);
                    break;
                case 5:
                    System.out.println("Size = "+l.length(l.head));
                    break;
                case 6:
                    l.head=l.reverse(l.head);
                    break;
                case 7:
                    l.display(l.head);
                    break;
                case 8: System.exit(0);
                    break;
                default: System.out.println("\n Wrong Choice!");
                    break;
            }
            System.out.println("\n do u want to cont... ");
        }while(in.nextInt()==1);

    }


}
