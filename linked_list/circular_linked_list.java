class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
     // Initialize the next pointer to point to itself
    this.next = this; 
  }
}

class CLL {
  Node head;

  CLL() {
    head = null;
  }

  void insert_at_last(Node node) {
    if (head == null) {
      head = node;
      head.next = head;  // Circular link
    } else {
      Node temp = head;
      // Traverse the list to find the last node
      while (temp.next != head) {
        temp = temp.next;
      }
      temp.next = node;  // Insert new node at the end
      node.next = head;  // Point the new node to head to maintain circularity
    }
  }
void insert_at_begin(Node node){
  if(head == null){
    head  = node;
    head.next = head;
  }
  else {
    Node temp = head.next;
    do{
       temp = temp.next;
    }while(temp.next!=head);  
    node.next = head;
    temp.next = node;
    head = node;
  }
}
Node delete_from_last(){
  if(head == null){
    System.out.println("list is empty");
    return null;
  }
    if(head.next==head){
      Node temp = head;
      head = null;
      return temp;
    }
  else{
    Node temp = head.next;
    do{
      temp = temp.next;
    }while(temp.next.next!=head);
    Node dd = temp.next;
    temp.next = head;
  Node t = dd;
    dd = null;
    return t;
  }
}
  Node delete_from_begin(){
    if(head == null){
      System.out.println("list in empty begin delete");
      return null;
}
    else if(head.next==head){
      Node temp = head;
      head = null;
      return temp;
}
else{
      Node temp = head.next;
  do{
    temp = temp.next;
  }while(temp.next!=head);
Node dd = head,delete = head; // node for nulling nad return
temp.next = head.next;
  head = head.next;
  dd = null;
  return delete;
}
  }
  void show() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    Node temp = head;
    do {
      System.out.print(temp.data + " ");
      temp = temp.next;
    } while (temp != head);  // Loop until we come back to the head node
   
  }
}

public class Main {
  public static void main(String[] args) {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);

    CLL l = new CLL();
   l.insert_at_last(n1);
   l.insert_at_last(n4);
   l.insert_at_last(n2);
    l.insert_at_begin(n3);
     // System.out.println(l.delete_from_last().data);
     // System.out.println(l.delete_from_last().data);
     // System.out.println(l.delete_from_last().data);
     // System.out.println(l.delete_from_last().data);
    System.out.println(l.delete_from_begin().data);
    System.out.println(l.delete_from_begin().data);
    System.out.println(l.delete_from_begin().data);
    System.out.println(l.delete_from_begin().data);
    System.out.println(l.delete_from_begin());
    l.show();
  }
}
