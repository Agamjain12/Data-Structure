package LinkedList;

public class LL {
         private Node start;
         private Node tail;
         private int size;

         public LL(){
             this.size=0;
         }

         public void inserFirst(int val){
             Node node = new Node(val);
             node.next = start;
             start = node;
             if(tail==null){
                 tail = start;
             }
             size++;
         }

         public void display(){
             Node temp = start;
             while(temp!=null){
                 System.out.print(temp.value +" => ");
                 temp = temp.next;
             }
             System.out.print("END");
         }
         public void lastInsert(int val){
             if(tail==null){
                 inserFirst(val);
                 return;
             }
             Node node = new Node(val);
             tail.next = node;
             tail = node;
             size++;

         }
    private class Node {
        private Node next;
        private int value;

        private Node(int value){
            this.value = value;
        }

        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}