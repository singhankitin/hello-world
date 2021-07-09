public class Stack {

    private Node top;
    private int size;

    public String peek() {
        if (null == top) {
            return null;
        } else {
            return top.getValue();
        }
    }

    public String pop() {
        if (size == 0) {
            return null;
        } else {
            String retVal = top.getValue();
            top = top.getNext();
            size--;
            return retVal;
        }
    }

    public void push(String value) {
        if (null == value) {
            throw new IllegalArgumentException("NULLs not allowed");
        } else {
            top = new Node(value, top);
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    private class Node {
        private final String value;
        private final Node next;

        private Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

        public String getValue() {
            return value;
        }

        public Node getNext() {
            return next;
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
}
