// Design a Data Structure SpecialStack that supports all the stack operations
// like push(), pop(), isEmpty(), isFull() and an additional operation getMin()
// which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SpecialStack {
    private List<Integer> specialStack;
    private int size, stack_pointer;

    public SpecialStack() {
        this.stack_pointer = -1;
        this.specialStack = new ArrayList<>();
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int getStack_pointer() {
        return stack_pointer;
    }

    public List<Integer> getSpecialStack() {
        return specialStack;
    }

    public int push(int data){
        if(isFull()){
            return -1;
        }
        specialStack.add(data);
        stack_pointer++;
        return 1;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        return specialStack.remove(stack_pointer--);
    }

    public boolean isEmpty(){
        return stack_pointer == -1;
    }

    public boolean isFull(){
        return stack_pointer == size-1;
    }

    public int getMin(){
        if(isEmpty()){
            return -1;
        }
        return Collections.min(specialStack);
    }

}


class Main {
    public static void main(String[] args) {

        SpecialStack stack = new SpecialStack();
        stack.setSize(5);

        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.push(3);
        System.out.println(stack.getSpecialStack());
        System.out.println(stack.isEmpty());
        stack.push(6);
        stack.push(5);
        stack.push(4);
        System.out.println(stack.getSpecialStack());
        System.out.println(stack.isFull());
        stack.push(11);
        System.out.println(stack.getMin());
        System.out.println(stack.getSpecialStack());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.getSpecialStack());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.getMin());
    }
}
