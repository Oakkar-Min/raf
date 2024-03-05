public class SLLNode {
    int info;
    SLLNode next;

    public SLLNode(int value) {
        this(value, null);
    }

    public SLLNode(int value, SLLNode next) {
        this.info = value;
        this.next = next;
    }
}

class InnerSLLNode {
    static SLLNode head = null;
    static SLLNode tail = null;

    public static boolean isEmpty() {
        return head == null;

    }

    public void addToHead(int el) {
        if (head == null) {
            head = tail = new SLLNode(el);
        } else {
            head = new SLLNode(el, head);

        }
    }

    public void addToTail(int el) {
        if (head == null) {
            head = tail = new SLLNode(el);
        } else {
            tail.next = new SLLNode(el);
            this.tail = tail.next;
        }
    }

    public int removeFromHead() {
        if (head == null) {
            return -1;
        } else {
            int temp = head.info;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return temp;
        }
    }

    public int removeFromTail() {
        if (head == null) {
            return -1;
        } else {
            int el = tail.info;
            if (head == tail) {
                head = tail = null;
            } else {
                for (SLLNode temp = head; temp != tail; temp = temp.next) {

                    temp.next = null;
                    tail = temp;

                }
            }
            return el;
        }
    }

    public void deleteElement(int el) {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            if (head == tail && el == head.info) {
                head = tail = null;
            } else if (head.info == el) {
                head = head.next;
            } else {
                SLLNode prev, cur;
                for(prev=head,cur=head.next;cur!=null && cur.info!=el;prev=prev.next,cur=cur.next){
                    if(cur!=null){
                        prev.next=cur.next;
                    if(cur==tail)
                        tail= prev;
                    }
                }
            }
        }
    }

    public void deletenthNode(int n) {
        if(n==1){
            if(head==tail){
                head=tail=null;
            }else{
                head=head.next;
            }
        }else{
            SLLNode tmp=head;
            for(int i=1;i<n;i++,tmp=tmp.next){
                if(tmp.next==tail){
                    tmp.next=null;
                    tail=tmp;
                }else
                tmp.next=tmp.next.next;

            }
        }
       
    }

    public int count(int key){
        int count=0;
        if(head==null){
            return 0;

        }
        else if(head==tail){
            if(head.info==key){
                return 1;
            }else{
                return 0;
            }
        }
        else{
            SLLNode temp;
            for(temp=head;temp!=null;temp= temp.next){
                if(temp.info==key){
                    count++;
                }
            }
            return count;
        }
    }

    

}



