
public class Day4Stacks {

    int size;
    static int[] arr;
    int top;

    public Day4Stacks(int size) {
        this.arr = new int[size];
        this.top = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        } else if (isEmpty()) {
            top = 0;
            arr[top] = data;
        } else {
            top++;
            arr[top] = data;
        }
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty !!!");
            return 0;
        }

        int topper = arr[top];
        arr[top] = 0;
        top--;
        size--;

        return topper;

    }

    public int peek() {
        return arr[top];
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println("|   " + arr[i] + "    |");
            System.out.println("|---------|");
        }

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {

        Day4Stacks stk = new Day4Stacks(3);

        // System.out.println(stk.isFull());
        // System.out.println(stk.isEmpty());
        stk.push(10);
        stk.push(20);
        stk.push(30);
        // stk.push(40);
        stk.printStack();

        stk.pop();

        stk.printStack();

        System.out.println(stk.peek());

    }
}
