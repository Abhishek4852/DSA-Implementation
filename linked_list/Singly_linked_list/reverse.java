public class rev{

listnode last = null;
  listnode first;
  listnode  mid;



  listnode lastnode;
 
 listnode reverseBetween(listnode head, int left, int right) {
      if(head==null || head.next == null){
        return head;

      }
   System.out.println("hiiii");
      int counter = 0;
        listnode temp = head;
    //      listnode first = head;
    //      listnode last=null;
    // listnode mid ;
   while(temp!=null && counter <=right){
     if(counter == right-1)
       first = temp;

     if(counter == right ){
       mid = temp;
       if(mid.next!= null){
         last = temp.next;
         mid.next = null;
       }
       }
     counter++;
     temp = temp.next;
   }
  listnode tt = first.next;
   first.next = null;
   listnode newhead = reverse(tt);

   // first.next = newhead;
   // lastnode.next = last;

   return head;

  }


  listnode reverse(listnode node){

    if(node == null || node.next == null){
      System.out.println(node.data);
     
      return node;

  }

    listnode newnode = reverse(node.next);
     System.out.println("hellow");
    listnode front = node.next;
    front.next = node;
    node.next = null;
    lastnode = node;
    
    return newnode;
  }

  void show(listnode head){
    listnode temp = head;

    while(temp != null){
      System.out.print(temp.data+"  ");
      temp = temp.next;
    }
}
}
