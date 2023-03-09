import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
     stack.push("JAVA");

        stack.push(2);
        stack.push("JAVA");
        stack.reverse(stack);
        System.out.println(stack);
    }
}
class ArrayStack implements Stack {
    Object[] elements;
    int capacity;
    int counter;

    ArrayStack(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
    }
     public String toString(){
        String b = "";
        for (int i = 0; i < capacity; i++) {
             b+=elements[i]+" ";
         }
return b;
    }
    @Override
    public Object push(Object data) {
        if (size() == capacity) {
            resize();
        }
            elements[counter] = data;
            counter++;

        return data;
    }
    @Override
    public Object pop(){
        if (isEmpty()){
            throw new IllegalStateException("Empty stack baby");
        }else {
            shrink();
            counter--;
            elements[counter]=null;
        }
    return elements;
    }
public boolean isEmpty(){
        if (size()==0){
            return true;
        }else {
            return false;
        }
}
public Object reverse(ArrayStack s){
  if (isEmpty()){
      throw new IllegalStateException("Empty......");
  }
  ArrayStack newStack=new ArrayStack(capacity);
  for (int i=s.size(); i>0; i--){
      newStack.push(s.elements[i]);
  }
  return newStack;
}
    @Override
    public Object peek() {
    if (isEmpty()){
        throw new IllegalStateException("Empty stack babe");
    }else{
        return elements[counter-1];
    }
    }
    @Override
    public int size() {
        return counter-1;
    }

    public void resize() {
        Object[] newArray;
            newArray = new Object[capacity * 2];
            for (int i = 0; i < capacity; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
            capacity *= 2;
        }

    private void shrink(){
        if (size()<=(capacity/2)/2) {
            capacity = (capacity / 2);
        }
        Object newArray[]=new Object[capacity];
        for (int i = 0; i < size(); i++) {
            newArray[i]=elements[i];
        }
        elements=newArray;
    }
}
    interface Stack {
        Object push(Object data);

        Object pop();

        Object peek();

        int size();
    }
