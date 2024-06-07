
class node{
  int data;
  node next;
  node prev;
  node(int data){
    this.data = data;
    next = null;
    prev = null;
    
}

}

class dll{
  node head;
  node tail;
  int length;
  dll(){
    head = null;
    tail = null;
    length = 1;
  }
void insert_at_end(node node){
  if(head == null)
    head = tail = node;
else {
  tail.next = node;
  node.prev = tail;
  tail = node; 
}
length++;
}

  void insert_at_begin(node node){
    if(head==null)
      head = node;
    else{
    node.next = head;
    head.prev = node;
    head = node;
      }
  length++;
  }
  void insert_at_position(node node, int pos){
    
   if(pos <=0)
     insert_at_begin(node);
    else if(pos>= length)
      insert_at_end(node);
    else{
      node temp = head;
      for(int i = 2;i<pos;i++)
        temp = temp.next;

      node.next = temp.next;
      temp.next.prev =node;
      temp.next = node;
      node.prev = temp;
    }
    length++;
  }
 // node delete_at_begin();
 // node delete_at_end();
 //  node delete_at_positon(int pos);
  void show(){
    node temp = head;

    while(temp != null){
      System.out.print(temp.data+"  ");
      temp = temp.next;
    }
  }
}


public class Main {
  public static void main(String[] args) {
    node n1 = new node(1);   
   // node n2 = new node(5);   
   node n3 = new node(2);   
   node n4 = new node(4);   
   node n5 = new node(4);   
   node n6 = new node(6);

    dll l = new dll();
    // l.insert_at_end(n1);
    // l.insert_at_end(n2);
   // l.insert_at_end(n3);
    l.insert_at_end(n4);
    l.insert_at_end(n5);
   l.insert_at_end(n6);
     l.insert_at_begin(n1);
    l.insert_at_position(n3,3);
    l.show();
}

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
