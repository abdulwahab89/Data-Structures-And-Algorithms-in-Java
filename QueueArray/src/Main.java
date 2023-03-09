public class Main {
    public static void main(String[] args) {
QueueArray queue=new QueueArray(10);
queue.enqueue("Queue");
queue.dequeue();
queue.display();
    }
}
class QueueArray{
    private  int capacity;
    private int front,rear;
    private Object [] queue;
    QueueArray(int capacity){
    this.capacity=capacity;
        queue=new Object[capacity];
    this.front=-1;
    this.rear=-1;
    }
    boolean isFull(){
        return rear==capacity-1;
    }
    boolean isEmpty(){
        return front==-1;
    }
    void enqueue(Object data){
        if (isFull()){
            throw  new IllegalStateException("The queue is full");
        }else{
            if (isEmpty()){
                front=0;
               }
            rear++;
            queue[rear]=data;

        }
    }
    Object dequeue(){
        Object item;
        if (isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }else{
            item=queue[front];
            if (front>=rear){
                front=-1;
                rear=-1;
            }
            else{
                front++;
            }
        }
        return item;
    }
    void display(){
        if (isEmpty()){
            System.out.println("List is empty");
        }else{
            for (int i = front; i <=rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
