public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    public void reverseOriginal() {
        if (length > 1) {
            Node leader = head;
            Node follower = head.getNext();
            while (leader != null) {
                Node followersFollower = null;
                if (null != follower) { // when we reach the original head
                    followersFollower = follower.getNext();
                    follower.setNext(leader);
                }
                leader = follower;
                follower = followersFollower;
            }
            Node headTempCopy = head;
            head = tail;
            tail = headTempCopy;
            tail.setNext(null);
        }
    }

    public void reverseSimplified() {
        if (length > 1) {
            Node leader = head;
            Node follower = head.getNext();
            while (follower != null) {
                Node followersFollower = follower.getNext();
                follower.setNext(leader);
                leader = follower;
                follower = followersFollower;
            }
            Node headTempCopy = head;
            head = tail;
            tail = headTempCopy;
            tail.setNext(null);
        }
    }

    // add an element to the end of the list
    public SinglyLinkedList add(String value) {
        Node node = new Node(value, null);
        if (length == 0) {
            // empty
            head = node;
        } else {
            // not empty
            tail.setNext(node);
        }
        tail = node;
        length++;
        return this;
    }

    // remove element at provided index
    public void remove(int index) {
        if (index > length || length == 0) {
            throw new IllegalArgumentException();
        } else {
            // only one element in the list
            if (length == 1 && index == 1) {
                head = null;
                tail = null;
                length = 0;
                // > 1 element
            } else {
                Node currentNode = head;
                Node previousNode = null;
                int i = 1;
                while (currentNode != null) {
                    if (i == index) {
                        // beginning
                        if (previousNode == null) {
                            head = head.getNext();
                            currentNode.setNext(null);
                            // end
                        } else if (currentNode.getNext() == null) {
                            previousNode.setNext(null);
                            tail = previousNode;
                        } else {
                            // middle
                            previousNode.setNext(currentNode.getNext());
                            currentNode.setNext(null);
                        }
                        length--;
                        return;
                    }
                    previousNode = currentNode;
                    currentNode = currentNode.getNext();
                    i++;
                }
            }
        }
    }

    // add after provided index - indexes are 1 based
    public void insertAfter(int index, String value) {
        if (index > length) {
            throw new IllegalArgumentException();
        } else {
            Node node = head;
            int i = 1;
            while (node != null) {
                if (i == index) {
                    Node newNode = new Node(value, node.getNext());
                    node.setNext(newNode);
                    // end
                    if (i == length) {
                        tail = newNode;
                    }
                    length++;
                    break;
                } else {
                    i++;
                    node = node.getNext();
                }
            }
        }
    }

    // get element at index
    public String get(int index) {
        if (index > length) {
            throw new IllegalArgumentException();
        } else {
            Node node = head;
            int i = 1;
            while (node != null) {
                if (i == index) {
                    return node.getValue();
                } else {
                    node = node.getNext();
                    i++;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        Node node = head;
        final StringBuilder stringBuilder = new StringBuilder();
        while (node != null) {
            stringBuilder.append(node.getValue()).append(" ");
            node = node.getNext();
        }
        return stringBuilder.toString();
    }

    public int getLength() {
        return length;
    }
}

class Node {
    private String value;
    private Node next;

    Node(String value, Node next) {
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