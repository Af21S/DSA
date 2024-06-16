import java.util.LinkedList;
import java.util.Queue;


public class reverse_number {
    
    public static void main(String[] args) {

     //Stack stack= new Stack<>();

     //rev_num(1824, stack);
     //numm(stack);

     Queue queue = new LinkedList<>();
     rev_num(1824, queue);
     numm(queue);
    }
    static void rev_num(int num, Queue queue){
        if(num==0){return;}
        int dig= num%10;
        System.out.println("enqueue "+dig);
        queue.offer(dig);
        num=num/10;
        rev_num(num, queue);
       

        
    }
    static void numm(Queue queue){
        if(queue.isEmpty()){return;}
        int elem = (int)queue.poll();
        System.out.println(elem);
       
        numm(queue);
    }

    /*static void rev_num(int num, Stack stack){
        if(num==0){return;}
        int dig= num%10;
        System.out.println("pushing "+dig);
        stack.push(dig);
        num=num/10;
        rev_num(num, stack);

        
    }
    static void numm(Stack stack){
        if(stack.isEmpty()){return;}
        int elem = (int)stack.pop();
        System.out.println(elem);
       
        numm(stack);
    }*/


  
    
}
