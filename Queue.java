public class Queue <ContentType> {

    public class QueueNode {
        private ContentType contentObj;
        private QueueNode nextNode;

        public QueueNode(ContentType obj, QueueNode nextNode) {
            this.contentObj = obj;
            this.nextNode = nextNode;
        }

        public void setNext(QueueNode nextNode) {
            this.nextNode = nextNode;
        }

        public QueueNode getNext() {
            return this.nextNode;
        }

        public ContentType getContent() {
            return this.contentObj;
        }
    }

    private QueueNode head;
    private QueueNode tail;

    public Queue() {
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enque(ContentType obj) {
        QueueNode newNode = new QueueNode(obj, null);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public ContentType front() {
        ContentType obj = null;
        if (!isEmpty()) {
            obj = head.getContent();
            if (head != tail) {
                head = head.getNext();
            } else if (head == tail) {
                head = null;
                tail = null;
            }
        }
        return obj;
    }
}
