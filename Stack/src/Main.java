public class Main {
    public static void main(String[] args) {
ArrayStack stack=new ArrayStack(4);
stack.push(1);
stack.push(2);
        stack.push(1);
        System.out.println(stack.reverse(stack));
    }
}
interface Stack{
Object peek();
Object pop();
void push(Object data);
int size();
}
//class
//ArrayStack implements Stack{
//    private Object[] a;
//    private int size;
//    public ArrayStack(int cap){
//        a=new Object[cap];
//    }
//    public boolean  isEmpty(boolean isEmpty){
//        return (size==0);
//    }
//    public Object peek(){
//        if(size==0) throw  new IllegalStateException("Stack empty");
//    return a[size-1];
//    }
//    public Object pop(){
//        Object obj=a[--size];
//        a[size]=null;
//        return obj;
//    }
//
//    @Override
//    public Object push() {
//        return null;
//    }
//
//    private void resize(){
//
//    }
//    @Override
//    public int size() {
//        return 0;
//    }
//}