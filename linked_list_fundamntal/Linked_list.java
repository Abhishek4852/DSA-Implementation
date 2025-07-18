

public class Linked_list {

    node head;
    node top;
    node head2;

    Linked_list(){
        head = null;
        top = null;
    }

    void insert(int data){
       node temp = new node(data);

       if(head == null){
        head = temp;
       }
       else{
        node temp2 = head;

        while(temp2.next != null){
            temp2 = temp2.next;
        }
       temp2.next = temp;

       }

     
    }

    void delete(int data){
        if(head == null){
            System.out.println(" list is empty");
            return ;
        }

        node temp = head;

        node temp2 =  head;

        if( head.data == data){
            head = head.next;
            System.out.println("node deleted successfuly");
                return;
        }

        while(temp != null){
            
            if(temp.data == data){
                temp2.next = temp2.next.next;
                System.out.println("node deleted successfuly");
                return;
            }
            temp2 = temp;
            temp = temp.next;
        }

    }

    void push(int data){
    node temp = new node(data);
    
    if(top == null){
        top = temp;
        head2 = top;
    }else{
        top.next = temp;
        top = top.next;
    }

    
    }
    void display_stack(){
        if(head2 == null){
            System.out.println(" stack is empty");
        }
        else {
            node temp = head2;
           System.out.println();
            while(temp!= null){
                System.out.print(temp.data+" ---> ");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
        
        }
    }

    int pop(){

        

        if( top == null){
            System.out.println("statck is empty");
            return -1;
        }
         
        node temp = head2;
      if(top.next == null){
        temp = top;
        top = null;
        return temp.data;
      }
    while(temp.next != null){
        top = temp;
        temp = temp.next;
    }
        int data = temp.data;
        top.next = null;
         return data;

       
    }


    void display(){
        if(head == null){
            System.out.println(" list is empty");
        }
        else {
            node temp = head;
           System.out.println();
            while(temp!= null){
                System.out.print(temp.data+" ---> ");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
        
        }
    }
}

class node {
    int data;
    node next;

    node(int data){
        this.data = data;
        next = null;
    }
}