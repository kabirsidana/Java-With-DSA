class DoublyLL{
    int size;
    Node head;
    
    //Constructor
    public DoublyLL(){
        this.size=0;
    }
    
    //Get Node
    public Node getNode(int size){
        Node temp= head;
        for(int i=1;i<size;i++){
            temp=temp.next;
        }
        return temp;
    }
    
    // Insert At First 
  public void insertAtFirst(int val){
           Node node = new Node(val);
           if(size<1){
               head=node;
               head.prev=null;
               head.next=null;
               size++;
               return;
           }
           node.next=head;
           node.prev=null;
           head.prev=node;
           head=node;
           size++;
       } 
       
       //Insert At Last
       
       public void insertAtLast(int val){
           Node node = new Node(val);
           if(size==0){
               insertAtFirst(val);
               return;
           }
           Node secondlast=getNode(size);
           secondlast.next=node;
           node.prev=secondlast;
           node.next=null;
           size++;
       }
       
       // Insert Anywhere
       

       public void insert(int val,int index){
           if(index==0){
               insertAtFirst(val);
               return;
           }
           if(index==size){
               insertAtLast(val);
               return;
           }
           Node node = new Node(val);
           Node before=getNode(index-1);
           Node after=getNode(index+1);
           node.prev=before;
           node.next=after;
           before.next=node;
           after.prev=node;
           size++;
       }
       
       
       //Display
       
      public void display(){
          Node temp=head;
          while(temp!=null){
              System.out.print(temp.value+" -> ");
              temp=temp.next;
          }
          System.out.print("END");
      }
      
      //display in reverse
      
      public void displayRev(){
         Node temp=head;
          while(temp.next!=null){
              temp=temp.next;
          }
          while(temp!=null){
              System.out.print(temp.value+" -> ");
              temp=temp.prev;
          }
             System.out.print("END");
      }
       
    class Node{
        int value;
        Node next;
        Node prev;
        
        public Node(int value){
            this.value=value;
        }
        
        public Node(int value,Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
        
     
    }
}