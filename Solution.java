
//  Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class Solution {
    public ListNode sortList(ListNode head) {
       if(head==null||head.next==null) 
           return head;
        
        ListNode mid = middleNode(head);
        
        ListNode righthead=mid.next;
        mid.next=null;
        ListNode right = sortList(head);
          ListNode left = sortList(righthead);
        
        return mergeList(left,right);
                                                     
    }
       public ListNode mergeList(ListNode list1,ListNode list2) {
         ListNode tail = new ListNode(0);
           ListNode newtail=tail;
           while(list1!=null&&list2!=null){
               if(list1.val>list2.val){
                   tail.next = list2;
                   list2=list2.next;
               }else{
                   tail.next=list1;
                   list1=list1.next;
               }
               tail=tail.next;
           }
           
           tail.next = (list1==null)?list2:list1;
       return newtail.next;
       }
    
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode temp1 = head;
        ListNode temp2 = head;
                                                  
        while(temp2!=null && temp2.next!=null){
            temp1 = temp1.next;
            temp2= temp2.next.next;
            
        }
        return temp1;
        
    } 
}