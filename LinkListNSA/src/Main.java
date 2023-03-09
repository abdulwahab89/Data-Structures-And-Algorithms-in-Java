public class Main {
    public static void concat(LinkedList linkedList, LinkedList linkedList2){
        LinkedList.Node node=linkedList.head;
        while (node.next!=null){
            node=node.next;
        }
        node.next=linkedList2.head;
    }
    public static void main(String[] args) {
    LinkedList linkedList=new LinkedList();
    LinkedList linkedList2=new LinkedList();
    linkedList.insertAtLast(3);
    linkedList.insertAtLast(4);
    linkedList.insertAtLast(5);
    linkedList.insertAtPosition(7,2);
        linkedList2.insertAtLast(8);
        linkedList2.insertAtLast(9);
        linkedList2.insertAtLast(10);
        linkedList2.insertAtFirst(11);
//        concat(linkedList,linkedList2);
        linkedList.deleteAtPosition(1);
        linkedList.show();
    }
}
    class LinkedList{

        class Node {
            Node next;
            int data;

            Node(int data) {
                this.data = data;
            }
        }
        Node head;
        public void insertAtLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
            }else{
                Node n=head;
                while (n.next!=null){
                    n=n.next;
                }
                n.next=newNode;
            }
        }
        public  void insertAtFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
            }else{
                newNode.next=head;
                head=newNode;
            }
        }
       public void deleteAtFirst(){
            if(head==null){
                System.out.println("No element in list, list is empty");
            }else{
                head=head.next;
            }
       }
       public void deleteAtPosition(int position){
            Node n=head;
            if (head==null){
                System.out.println("EMPTY LIST DUDE ._.");
            }else{
                for (int i = 0; i <position-1; i++){
                    n=n.next;
                }
                n.next=n.next.next;
            }
       }
        public void insertAtPosition(int data, int position){
            try{
            Node n=head;
            Node newNode=new Node(data);
            if (head==null){
                head=newNode;
                return;
                }else{
                for (int i = 0; i <position-1; i++){
                    n=n.next;
                }
                newNode.next=n.next;
                n.next=newNode;
            }
        }
        catch (NullPointerException e){
            System.out.println("Position doesn't exist");
        }

        }
        public void show(){
            Node n=head;
            if(head==null){
                System.out.println("List is empty boss! ");
            }
            else{
                while (n.next!=null){
                    System.out.println(n.data);
                    n=n.next;
                }
                System.out.println(n.data);
            }
        }
    }


