package StackLab;

public class StackLab {
    public static void main(String[] args) {
        MyStack st1= new MyStack(10);
        st1.push(5);
        st1.push(30);
        st1.push(29);
        st1.push(28);
        st1.push(20);
        st1.push(26);
        st1.push(25);
        st1.push(24);
        st1.push(39);
        st1.push(22);
        
        System.out.println(st1.topElement());
        System.out.println(st1.size());
        String x= "333333333333333333333333333333333333333333333333333333333333333333333333333333333333333";
        BigNumber n1= new BigNumber(x);
        String y= "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444";
        BigNumber n2= new BigNumber(y);
        BigNumber n3=n1.add(n2);
        System.out.println(n3.toString());
        String z="55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555";
        BigNumber n4= new BigNumber(z);
        n1= n3.add(n4);
        System.out.println(n1.toString());
    }
}
