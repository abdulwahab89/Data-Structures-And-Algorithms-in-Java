class StackList{
    Node top;
    public void push(Object data){

        Node newNode=new Node(data);
        if (top==null){
            top=newNode;
        }else
        newNode.next=top;
        top=newNode;
    }
    public Object pop(){
        if (top==null){
            System.out.println("Stack's empty");
        return top;
        }else
            top=top.next;
        return top.data.toString();
    }
    public void display(){
        Node currentNode=top;
        while (currentNode!=null){
            System.out.println(currentNode.data);
        currentNode=currentNode.next;
        }
    }
    public Object peek(){
        if (top==null){
            System.out.println("Stack's empty");
        return null;
        }else{
            return top;
        }
    }
    class Node{
        Object data;
        Node next;
        Node(Object data){
            this.data=data;
        this.next=null;
        }
    }
}
class Main{
    public static void main(String[] args) {
StackList stack=new StackList();
stack.push(1);
stack.push(2);
stack.push(3);
        System.out.println(stack.peek());
stack.display();
    }
}