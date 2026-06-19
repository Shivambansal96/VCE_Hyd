
public class Day4Stacks {
    int n;
    int top = -1;
    int[] arr;

    public Day4Stacks(int size) {
        this.n = size;
        this.arr = new int[size];

        System.out.println("A Stack is Created");
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == n - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack OVERFLOW");
        } else {
            top++;
            arr[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack UNDERFLOW");
            return 0;
        } else {
            int send = arr[top];
            top--;
            return send;
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is EMPTY!!!");
        } else {
            while (!isEmpty()) {
                // System.out.print(arr[top] + " ");
                System.out.print(this.pop() + " ");
            }
        }
    }

    public static void main(String[] args) {

        Day4Stacks stk = new Day4Stacks(3);
        System.out.println(stk.isEmpty());
        System.out.println(stk.isFull());
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.pop(); // 30
        stk.push(40);

        stk.printStack();

    }
}
