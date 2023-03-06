class CustomLL{
    Node head;
    Node tail;
    int size;
    static int a;
    
    CustomLL(){
        this.size=0;
    }
    
    //get a particular Node
    public Node getNode(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

   //merge 
   public  CustomLL merge(CustomLL list1 , CustomLL list2){
            CustomLL ans= new CustomLL();
            Node first=list1.head;
            Node second=list2.head;

                while(first!=null && second!=null){

                    if(first.value<second.value){
                        ans.insertAtLast(first.value);
                        first=first.next;
                        }

                    else{
                        ans.insertAtLast(second.value);
                        second=second.next;
                    }
                }
                while(first!=null){
                    ans.insertAtLast(first.value);
                    first=first.next;
                }
                while(second!=null){
                    ans.insertAtLast(second.value);
                    second=second.next;
                }
            return ans;
   }
    
    // Insert at first
    
    public void insertAtFirst(int val){
        Node node= new Node(val);
        node.next=head;
        head=node;
        
        // In case of emptyList
        if(tail==null){
            tail=head;
        }
        
        size++;
    }
    
    // Insert at last
    
    public void insertAtLast(int val){
        Node n= new Node(val);
        if(tail==null){
            insertAtFirst(val);
            return;
        }
        
        tail.next=n;
        tail=n;
        size++;
    }
    
    //Insert at Particular index
    
    public void insert(int val,int index){
        if(index==0){
            insertAtFirst(val);
            return;
        }
        if(index==size){
            insertAtLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node= new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    
    //Delete First index
        
    public void deleteFirst(){
        // Node temp=head;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        // we can also print the removed element
    }
    
    // Delete the last index
    
    public void deleteLast(){
        //this is singly linked list not doubly linked list
        if(size<=1){
            deleteFirst();
            return;
        }
       Node rightIndex=getNode(size-2);
        tail=rightIndex;
        tail.next=null;
    }
    
    //Delete

    public void Delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size){
            deleteLast();
            return;
        }
        Node temp=getNode(index-1);
        Node temp2=getNode(index+1);
        temp.next=temp2;
        size--;
    }


    // Delete a Value 
    public void deleteValue(int val){
        if(size==1){
            deleteFirst();
        }
        Node temp=head;
        while(temp.next.value !=val){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;

    }


    // Display
    
    public void Display(){
        if(head==null ){
            System.out.println("List is emptyList");
        }
        
        // this is wrong because it will displace the head position 
        
        // while(head!=null){
        //     System.out.println(head.value);
        //     head =head.next;
        // }
        
        // so we take a temprary node 
           Node temp=head;
          while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp =temp.next;
        } 
        System.out.println("END");
    }
    
    class Node{
        int value;
        Node next;
        
        public Node(int value){
            this.value=value;
        }
        
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
        
    }
    // public static void main(String[] args) {
    //     CustomLL list1= new CustomLL();
    //     CustomLL list2= new CustomLL();
    //     list1.insertAtLast(1);
    //     list1.insertAtLast(2);
    //     list1.insertAtLast(4);
    //     list2.insertAtLast(1);
    //     list2.insertAtLast(3);
    //     list2.insertAtLast(4);
    //     CustomLL a =merge(list1, list2);
    //     a.Display();
    // }
}

