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

    public class InnerSLLNode {
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
                int el= tail.info;
                if (head==tail) {
                    head=tail=null;
                }
                else{
                    for ( SLLNode temp = head; temp != tail;  temp = temp.next) {
                        
                        temp.next= null;
                        tail=temp;
                                       
                }}
                return el;
            }
        }

    }

}
