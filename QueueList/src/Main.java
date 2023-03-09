import java.util.Queue;
public class Main {
    public static void main(String[] args) {
QueueLinkedList queueLinkedList=new QueueLinkedList(5);
queueLinkedList.enqueue("Queue");
        System.out.println("deleted =>"+ queueLinkedList.dequeue());
queueLinkedList.display();
    }
}
    class QueueLinkedList {
        Node front, rear;
        private int capacity;
        private int size;

        QueueLinkedList(int capacity) {
            this.capacity = capacity;
        }

        boolean isFull() {
            return size == capacity;
        }

        boolean isEmpty() {
            return front == null;
        }

        void enqueue(Object data) {
            if (isFull()) {
                throw new IllegalStateException("QueueList is full");
            } else {
                Node newNode = new Node(data);
                if (isEmpty()) {
                    front = newNode;
                    rear = newNode;
                } else {
                    rear.next = newNode;
                    rear = newNode;
                }
            }
            size++;
        }

        Object dequeue() {
            Object item;
            if (isEmpty()) {
                throw new IllegalStateException("QueueList is empty");
            } else {
                if (front == rear) {
                    item=front.data;
                    front = null;
                    rear = null;
                }
                else {
                    item=front.data;
                    front = front.next;
                }
            }
            size--;
            return item;
        }
        void display(){
            if (isEmpty()){
                System.out.println("List's empty");
            }else{
                Node currentNode;
                for (currentNode=front; currentNode!=null; currentNode=currentNode.next){
                    System.out.println(currentNode.data);
                }
            }
        }
    }
    class Node{
        Node next;
        Object data;
        Node(Object data){
            this.data=data;
            this.next=null;
        }
    }
