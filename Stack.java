public class Stack {
    int index;
    int size;
    int [] stack= new int[size];

    public Stack(){
        this.size=10;
    }
    public Stack(int size){
        this.size=size;
    }
    public boolean isEmpty(){
        return index==0;
    }
    public boolean isFull(){
         return index==size;
    }

    public void Push(int value){
        if (!isFull()) {
            stack[index++]=value;
        }else{
            System.out.println("Full!");
        }
        
       
    }
    public int Pop(int value){
        if(!isEmpty()){
           return stack[--index];
        }else{
            return -1;
        }
    }
}
