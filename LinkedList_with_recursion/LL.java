package LinkedList_with_recursion;


class node{
    int val;
    node next;
   node(int val){
    this.val = val;
    next=null;
    
   }
}

public class LL {
    node head;
   LL(){
    head = null;
   }

   public void insert_val(int val){
    node temp = new node(val);
    if(head == null){
        head = temp;
   }
else{
    temp.next = head;
    head=temp;
}

   }


// remove duplicates
// public node remove_duplicate(node head){
//     if(head == null ){
//         return head;
//     }
      
    
//  head.next = remove_duplicate(head.next);
    
//  if (head.next != null && head.val == head.next.val) {
//     head = head.next;
// }

// return head;
// }
public node remove_duplicate(node head) {
    if (head == null) {
        return head;
    }

    // Use a helper method for recursion
    head.next = remove_duplicate(head.next);

    // If the current node is a duplicate, skip it
    if (head.next != null && head.val == head.next.val) {
        head = head.next;
    }

    return head;
}





// insert at index
public node insert_at_index(int index,int vall,node temp_head){
    if(index==0){
        node temp = new node(vall);
        temp.next = temp_head;
        return temp;
    }

     temp_head.next = insert_at_index(index-1, vall, temp_head.next);
     return temp_head;
}




//  gettinthead
public node get_head(){
    return head;
}




// display by manual head
//    display
public void display_manual_head(node temp_head){
    node temp =temp_head;
    while (temp!=null) {
        System.out.print(temp.val+"  ");
        temp=temp.next;
        
    }
}





//    display
public void display(){
    node temp =head;
    while (temp!=null) {
        System.out.print(temp.val+"  ");
        temp=temp.next;
        
    }
}


// reverse a linked list
public  node reverse(node thead){

    if(thead==null || thead.next==null)
    return head;

    node current = thead;
   node Next = thead.next;
  node prev = null;

  while(current!=null){
    Next=current.next;
    current.next=prev;
    prev=current;
    current=Next;
  }

    return prev;
}


// get mid node of ll
public node get_mid(node thead){
    node prev = thead;
    node slow=thead;
    node fast=thead;
    while(fast!=null&&fast.next!=null){
        prev=slow;
        slow=slow.next;
        fast=fast.next.next;
    }
    prev.next=null;
    return slow;
}

// check pelindrom 
public boolean palindrom(node thead1,node thead2){


    while (thead1!=null&&thead2!=null) {
        if(thead1.val!=thead2.val)
        return false;   
        thead1=thead1.next;
        thead2=thead2.next;  
    }
    return true;
}

// rearrange list

public node rearrange(node thead1,node head2){

    node head1 = thead1;
    node t1 = head1.next;
    node t2 = head2.next;

    while(t1!=null&t2!=null){
        head1.next=head2;
        head2.next=t1;
        head1=t1;
        t1=t1.next;
        head2=t2;
        t2=t2.next;
    }
  head1.next=head2;
    return thead1;

}

}
