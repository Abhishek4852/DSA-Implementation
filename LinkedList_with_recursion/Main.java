package LinkedList_with_recursion;

public class Main {
    public static void main(String[] args) {
        LL l = new LL();
        for (int i = 10; i > 0; i--) {
            // l.insert_val(i*2);
        }
       
//         node head = l.get_head();

//         node afterhead = l.insert_at_index(4, 7, head);

//         l.display_manual_head(afterhead);
// System.out.println();
// System.out.println();
//         l.display();

l.insert_val(7);
l.insert_val(6);

 l.insert_val(5);

l.insert_val(4);
l.insert_val(3);
l.insert_val(2);
l.insert_val(1);

l.display();
// node head = l.get_head();
// node temp =l.remove_duplicate(head);
// l.display_manual_head(temp);

// System.out.println();
node head=l.get_head();
//   l.display_manual_head(head);
System.out.println();
node mid=l.get_mid(head);
System.out.println(mid.val);
System.out.println(mid.val);

node newhead=l.reverse(mid);
l.display_manual_head(head);
System.out.println();

l.display_manual_head(newhead);
 node fhead= l.rearrange(head,newhead);
 System.out.println();
l.display_manual_head(fhead);

// System.out.println(l.palindrom(head,newhead));




    }
    
}
