public class Queue {
    int size;
    int[] arr= new int[size];
    int first,last= -1;

    public Queue(){
        this.size=100;
    }

    public Queue(int size){
        this.size= size;
    }

    public boolean isFull(){
        return first==0 && last== size-1 || first==last+1;
    }

    public boolean isEmpty(){
        return first==-1;
    }

    public void Enqueue(int value){
     if(!isFull()){
        if(isEmpty()){
            first=last=0;
        }else if(last==size-1){
            last=0;
        }else{
            last++;
        }
        arr[last]=value;
     } else{
        System.out.println("The Queue if Full");
     } 
    }

    public int Dequeue(int value){
        int temp=-1;
        if(!isEmpty()){
             temp= arr[first];
            if(first==last){
                first=last=-1;
            }else if(first==size-1){
                first=0;
            }else{
                first++;
            }
        }else{
            System.out.println("Empty Array!");
        }
        
        return temp;
    }

}
