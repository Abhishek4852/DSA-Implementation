// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.*;
// code for creation of node
class listnode{
  int data;
  listnode next;

   listnode(int data){
    this.data = data;
    next = null;
  }
}




// code for operation of linked list
class linkedlist{
  listnode head;
  int length;
  linkedlist(){
    head = null;
    length = 0;
  }

  // insert node at end of linked list
    void insert(listnode node){
      if(head == null)
        head = node;
      // else if(head.next == null){
      //   head.next = node;
      // }
    else {
     // System.out.println(head.next.data);
      listnode temp = head;
      while(temp.next!=null)
        temp = temp.next;
      
      temp.next = node;
      length++;
    }
    
  }
  
// insert directly data 
    void insertdata(int data){
    listnode n = new listnode(data);
    insert(n);
  }

//  inser at begining 
void insert_at_begin(listnode node){
  if(head==null)
    head = node;
  node.next=head;
  head = node;
  length++;
}

// add node at position 
// if position is < 0 then add at head
// if position is > length the add at end
void insert_at_position(listnode node , int pos){
   if(pos <=0)
     insert_at_begin(node);

   else if(pos >= length)
     insert(node);

  else {
    listnode temp = head;
 for(int i = 1 ; i < pos-1 ; i++){
  temp = temp.next;
}

     node.next = temp.next;
     temp.next = node;
}
length++;
}

  // delete at head 
listnode delete_at_begin(){
   listnode n = head;
  if(head == null)
    return null;
  else {
   
    head = n.next;
    n.next = null;
  }
  length--;
    return n;
  }

  // delete from last of the linked list 
  listnode delete_at_last(){
    
    listnode temp = head,n=head,p;
    while(temp.next!=null){
      n=temp;
      temp = temp.next;
    }
    p=n.next;
  //  System.out.println(n.next.data);
    n.next = null;
    length--;
   return p;
  }


  // delete at position 
  listnode delete_at_position(int pos){
    if(pos<=0)
    return  delete_at_begin();
    else if(pos >= length)
     return delete_at_last();
    else {
      listnode temp = head, prev = head;
      for(int i = 2; i < pos; i++){
        temp = temp.next;
      }
      prev = temp.next;
      temp.next = temp.next.next;
      length--;
      return prev;
    }
  }


  // delete by matching the node 
  listnode delete_by_matching(listnode node){
    listnode temp = head,prev;
    if (head.equals(node)){
      head = null;
      return temp;
    }
    while(temp!=null){
      prev = temp;
      temp = temp.next;
      if(temp.equals(node)){
        prev.next = temp.next;
        return temp;
      }
    }
    return null;
    
  }

  listnode get_head(){
    return head;
  } 
  // show linked list 
  void show(){
    listnode temp = head;

    while(temp != null){
      System.out.print(temp.data+"  ");
      temp = temp.next;
    }

  }

//  innsert element in hash map 
void  delete_ele_in_hashmap(int pos){

  listnode temp = head;

  HashMap<Integer, listnode> mpp = new HashMap<>();
int length =0;
  while(temp!=null){
    mpp.put(length,temp);
    length++;
    temp=temp.next;
  }
  System.out.println();
  System.out.println();
  System.out.println((mpp.get(pos).data)+" deleting");

  System.out.println();
  System.out.println();
listnode temp2 = mpp.get(pos-1);
  listnode temp3 = mpp.get(pos);

  if (pos == 0) {
    head = head.next;
  } else {
    listnode prevNode = mpp.get(pos - 1);
    listnode nodeToDelete = mpp.get(pos);

    prevNode.next = nodeToDelete.next;
  }
}

  // ListNode* reverseList(ListNode* head) {

  //   if(head == NULL || head->next == NULL){
  //       return head;
  //   }

  //   ListNode* newhead = reverseList(head->next);
  //   ListNode* front = head->next;
  //   front->next=head;
  //   head->next =NULL;

  //   return newhead;

  


  
  // show in string formate 
  void show_str(){

    System.out.print("[");
    if(head != null){
      
    System.out.print("'"+head.data+"'");
    
        if(head.next!=null){
          listnode temp = head.next;
    
          while(temp!=null){
             System.out.print(",'"+temp.data+"'");
             temp =temp.next;
    }
        }
    }
    System.out.print("]");
      
  }
}



public class Main {
  public static void main(String[] args) throws Exception {
    listnode n1 = new listnode(3);
    listnode n2 = new listnode(4);
    listnode n3 = new listnode(4);
    listnode n4 = new listnode(6);
    listnode n5 = new listnode(3);
    listnode n6 = new listnode(4);

    // linkedlist l = new linkedlist();
    // l.insert(n1);
    //  l.insert(n2);
    //  l.insert(n3);
    //  l.insert(n4);

    // l.insert(n5);
    //  l.insert(n6);
linkedlist l = new linkedlist();
// inserting elements in list 
    for(int i = 0; i<9; i++){
      
       l.insertdata(i*i);
    }

// l.insert_at_begin(n6);
//    // l.insert_at_begin(n4);
   
    // l.insert_at_position(n4,10);
    // System.out.println(l.delete_at_begin().data);
    // System.out.println(l.delete_at_begin().data);

   // System.out.println(l.delete_at_last().data);
   // System.out.println(l.delete_at_position(3).data);
   // System.out.println(l.delete_by_matching(n4).data);
    
   //  l.show_str();
    // l.show();
    rev r = new rev();
    l.show();
    System.out.println();
    System.out.println();
 listnode nn = l.get_head();
    
    // listnode ss = r.reverse(nn);
    
     listnode ss = r.reverseBetween(nn,2,4);
    
    r.show(ss);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
