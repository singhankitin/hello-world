public class Queue {

    private Node head;
    private Node tail;
    private int length;

    public void enqueue(String value) {
        Node node = new Node(value, null);
        if (length == 0) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        length++;
        System.out.println(this);
    }

    public String peek() {
        System.out.println(this);
        if (length == 0) {
            return null;
        } else {
            return head.getValue();
        }
    }

    public String dequeue() {
        if (length == 0) {
            System.out.println(this);
            return null;
        } else {
            String dequeuedValue = head.getValue();
            head = head.getNext();
            if (head == null) {
                tail = null; // we removed the last element
            }
            length--;
            System.out.println(this);
            return dequeuedValue;
        }
    }

    public int getLength() {
        return length;
    }

    private class Node {
        private String value;
        private Node next;

        private Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Node{");
            sb.append("value='").append(value).append('\'');
            sb.append(", next=").append(next);
            sb.append('}');
            return sb.toString();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Queue{");
        sb.append("head=").append(head);
        sb.append(", tail=").append(tail);
        sb.append(", length=").append(length);
        sb.append(", listContents=[").append(length);
        Node pointer = head;
        while (pointer != null) {
            sb.append(", ").append(pointer.getValue());
            pointer = pointer.getNext();
        }
        sb.append("]");
        sb.append('}');
        return sb.toString();
    }
}
