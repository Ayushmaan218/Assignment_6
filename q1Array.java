import java.util.Scanner;

public class q1Array {
    static  final  int MAX = 100;
    public static void main(String[] args) {
        int[] stack = new int[MAX];
        int top = -1;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("********MENU*******");
            System.out.println("0. Exit");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Check if Stack is Empty");
            System.out.println("5. Check if Stack is Full");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = sc.nextInt();
                    top = push(stack, top, element);
                    break;
                case 2:
                    if (!isEmpty(top))
                    {
                        int poppedElement = pop(stack, top);
                        System.out.println("Popped element: " + poppedElement);
                        top--;
                    }
                    else
                        System.out.println("Stack is Empty!");
                    break;
                case 3:
                    display(stack, top);
                    break;
                case 4:
                    if (isEmpty(top))
                        System.out.println("Stack is Empty");
                    else
                        System.out.println("Stack is not Empty");
                    break;
                case 5:
                    if (isFull(top))
                        System.out.println("Stack is full");
                    else
                        System.out.println("Stack is not full");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
    public static int push(int[] S, int top, int element){
        if(isFull(top)){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            S[top]=element;
            System.out.println("Element "+element+" pushed to the stack");
        }
        return top;
    }
    public static int pop(int[] S, int top){
        if (isEmpty(top)) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int element = S[top];
            System.out.println("Element popped: " + element);
            top--;
            return element;
        }
    }
    public static void display(int[] S, int top){
        if(isEmpty(top)){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack elements");
            for(int i=0;i<=top;i++){
                System.out.println(S[i]);
            }
        }
    }
    public static boolean isEmpty(int top){
        return top == -1;
    }
    public static boolean isFull(int top){
        return top == MAX - 1;
    }
}
