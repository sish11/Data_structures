import java.util.Scanner;
class ioBuffer{
   public static void main(String[] args){
       Scanner read = new Scanner(System.in);
       Queue myQueue = new Queue();
       String inp = "";

       while((inp = read.nextLine()).charAt(0) != 'X'){
           if(inp.charAt(0) == 'O'){
               System.out.println( myQueue.deQueue());
           }
           else{
               myQueue.enQueue(inp);
           }
       }
   }
}


class Queue{
   private int N;
   private Node first;
   private Node last;
  
   private class Node{
       private String data;
       private   Node next;
   }

   public Queue(){
       N =0;
       first = null;
       last = null;
   }
  
   public boolean isEmpty(){
       return (first == null);
   }
  
   public void enQueue(String data){
       Node temp = last;
       last = new Node();
       last.data = data;
       last.next = null;
       if(isEmpty()){
           first = last;
       }
       else{
           temp.next = last;
       }
       N++;
   }
  
   public String deQueue(){  
       String temp = "";
       if(!isEmpty()){
           temp = "Data: " + first.data;
           first = first.next;
           N--;
       }
       else if(isEmpty()){
           last = null;
           temp = "Buffer Empty";
       }
       return temp;
   }
}




