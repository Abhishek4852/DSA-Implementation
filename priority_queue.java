
class item{
    int data;
    int priority;

    item(int data, int priority){
        this.data = data;
        this.priority = priority;
    }
}

class p_queue{
    int max = 10;

    item [] pq  = new item[100];

    int f;
    int r;
    p_queue(){
        f=r=-1;
        for(int i=0;i<max;i++){
          pq[i] = new item(-1,-1);

        }
    }

        void insert(int data, int priority){
        // condition for checking full or not

        if(r == 9){
            System.out.println("Queue is full");
            return;
        }
        
       // insert the item;
       if(r == -1 ){
        r = f = 0;
       }else{
        r++;
       }
      
       pq[r] = new item(data,priority);
       
        //sort();

    }

    void display(){
        for( int i = f; i<=r; i++){
            System.out.println("priority = "+pq[i].priority+" | value = "+pq[i].data);
        }
    }

    void delete(int priority){

        if(){
            System.out.println("queue is empty");
        }
        else if(r == f)
        item pq1 = pq[f];
        
        f++;

       pq1.data = -1;
       pq1.priority = -1;
        
        
    }
}


public class priority_queue {



   public static void main(String[] args) {
    p_queue pq = new p_queue();

    pq.insert(34,1);
    pq.insert(35,2);
    pq.insert(32,3);
    pq.insert(31,4);

    pq.display();

   }  
    
}

