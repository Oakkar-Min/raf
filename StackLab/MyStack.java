package StackLab;

public class MyStack {
    
        int[]info;
        int top;

        public MyStack(int capacity){
            info= new int[capacity];
            top=0;

        }
        public void push(int newInfo){
            if(!isFull()){
                info[top]= newInfo;
            top++;
            }
            
        }
        public int pop(){
            int x= -1;
            if(!isEmpty()){
                top--;
                x=info[top];
                
            }
            
            return x;
        }
        public int topElement(){
            int x= -1;
            if (!isEmpty()){
              
                x=info[top-1];
            }
            return x;
        }
        public boolean isEmpty(){
            return top==0;
        }
        public boolean isFull(){
            return top== info.length;
        }
        public int size(){
            return top;
        }



    

}
