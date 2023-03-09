import java.util.Arrays;
class DynamicArrayStack implements Stack {
private Object [] elements;
private int capacity;
private int counter;
DynamicArrayStack(int capacity){
    this.capacity=capacity;
    elements=new Object[capacity];
}
    @Override
    public Object push(Object data){
        //pre-condition
        if (size()==capacity)
            expand();
            elements[counter] = data;
            counter++;
            return elements;
    }
public void show(){
    System.out.println(Arrays.toString(elements));
}
    @Override
    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack's empty");
            return elements;
        }
        else {
            shrink();
            counter--;
            elements[counter]= null;
            Object data=elements[counter];
            return data;
        }
         }
    @Override
    public Object peek() {
        if (isEmpty()) {
            System.out.println("Stack's empty");
            return elements;
        }
        else {
            return  elements[counter-1];
        }
    }

    @Override
    public int size() {
        return counter;
    }
    private boolean isEmpty(){
    if (size()==0)
        return true;
        return false;
    }
    private void expand(){
    Object [] newArray;
    newArray=new Object[capacity*2];
    for (int i = 0; i < size(); i++) {
            newArray[i]=elements[i];
        }
    elements=newArray;
        capacity*=2;
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
interface Stack{
    Object push(Object data);
    Object pop();
    Object peek();
    int size();
}