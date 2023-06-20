import java.util.Scanner;

class Node{
    int info;
    Node next;
}
public class q2linkedlist {
    public static void main(String[] args) {
        Node top = null;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                case 1:
                    top = push(top);
                    break;
                case 2:
                    if (isEmpty(top))
                        System.out.println("Stack is empty!");
                    else
                    {
                        top = pop(top);
                        System.out.println("Top element popped from the stack");
                    }
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        }
    }
    public static Node push(Node top){
        Node newnode = new Node();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to push");
        newnode.info = sc.nextInt();
        newnode.next=null;
        if(top == null){
            top = newnode;
        }
        else{
            newnode.next = top;
            top = newnode;
        }
        System.out.println("Element "+newnode.info+" pushed into stack");
        return top;
    }
    public static Node pop(Node top){
        Node poppedNode = top;
        top = top.next;
        poppedNode.next = null;
        return top;
    }
    public static void display(Node top){
        if (isEmpty(top)) {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack elements:");
            Node currentnode = top;
            while(currentnode !=null){
                System.out.println(currentnode.info);
                currentnode = currentnode.next;
            }
        }
    }
    public  static  boolean isEmpty(Node top){
        return  top == null;
    }
}
