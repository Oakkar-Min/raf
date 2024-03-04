package StackLab;

public class BigNumber {
    String number;
    public BigNumber(String number){
        this.number= number;
    }
    public BigNumber(int number){
        this.number= number+"";
    }
    public int length(){
        return this.number.length();
    }
    public String toString(){
        return this.number;
    }
    public BigNumber add(BigNumber number2){
        MyStack operand1= new MyStack(this.length());
        MyStack operand2= new MyStack(number2.length());
        int resultLength= (this.length() > number2.length()? this.length() : number2.length())+1;
        MyStack result= new MyStack(resultLength);
        for (int i=0;i<this.length();i++){
            operand1.push(this.number.charAt(i)-48);
        }
        for(int i=0;i<number2.length();i++){
            operand2.push(number2.toString().charAt(i)-48);
        }
        int carry=0;
        while (!operand1.isEmpty() || !operand2.isEmpty()) {
           int a= (operand1.isEmpty()? 0: operand1.pop()) +
                  (operand2.isEmpty()? 0: +operand2.pop())+ carry;
           result.push(a%10);
           carry= a/10;

        }
        if (carry>0) {
            result.push(carry);
        }
        String answer="";
        while (!result.isEmpty()) {
            answer= answer+result.pop();
        }
    
        return new BigNumber(answer);
        
        

    }


}

