//import java.io.IOException;
//
//public class CuteArrayStack implements Stack{
//  private  Object[] elements;
//    private int counter;
//private int capacity;
//    CuteArrayStack(int capacity) {
//        this.capacity=capacity;
//        elements = new Object[capacity];
//    }
//    public Object push(Object data) {
//        if (counter == capacity) {
//            System.out.println("STACK FULL >.<");
//        } else {
//            elements[counter] = data;
//            counter++;
//         }
//        return elements;
//    }
//    @Override
//    public Object peek() {
//        if (isEmpty()==true){
//            System.out.println("Empty stack sir -.-");
//        }else{
//            if (counter>0)
//            System.out.println(elements[counter-1]);
//        else
//                System.out.println(elements[counter]);
//        }
//        return elements;
//    }
//public boolean isEmpty(){
//        if (elements==null){
//            return true;
//        }
//        else {
//            return false;
//        }
//}
//    public Object pop(){
//        if (counter>0) {
//            counter--;
//            elements[counter] = null;
//        }else{
//            System.out.println("Stack empty boss !");
//        }
//        return elements;
//    }
//
//    @Override
//    public int size() {
//        return counter;
//    }
//
//    public void show() {
//        for (int i = 0; i < elements.length; i++) {
//            System.out.print(elements[i] + " ");
//        }
//    }
//}
