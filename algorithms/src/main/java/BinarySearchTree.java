import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {

    private Node root;
    private int length;

    public void insert(final Integer value) {
        if (value == null) {
            throw new IllegalArgumentException("Nulls not allowed");
        } else {
            Node newNode = new Node(value, null, null);
            if (length == 0) {
                this.root = newNode;
                length++;
            } else {
                Node currentNode = root;
                while (true) {
                    if (value > currentNode.getValue()) {
                        Node right = currentNode.getRight();
                        if (right == null) {
                            currentNode.setRight(newNode);
                            length++;
                            break;
                        } else {
                            currentNode = right;
                        }
                    } else {
                        Node left = currentNode.getLeft();
                        if (left == null) {
                            currentNode.setLeft(newNode);
                            length++;
                            break;
                        } else {
                            currentNode = left;
                        }
                    }
                }
            }
        }
    }

    public Integer lookup(final Integer value) {
        if (root != null) {
            Node currentNode = root;
            while (currentNode != null) {
                if (value.equals(currentNode.getValue())) {
                    return value;
                } else {
                    if (value > currentNode.getValue()) {
                        currentNode = currentNode.getRight();
                    } else {
                        currentNode = currentNode.getLeft();
                    }
                }
            }
        }
        return null;
    }

    public Integer[] BFS() {
        List<Integer> retVal = new ArrayList<>(length);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (queue.peek() != null) {
            Node headOfQueue = queue.poll();
            retVal.add(headOfQueue.value);
            if (headOfQueue.left != null) {
                queue.offer(headOfQueue.left);
            }
            if (headOfQueue.right != null) {
                queue.offer(headOfQueue.right);
            }
        }
        return retVal.toArray(Integer[]::new);
    }

    public void BFSRecursive(Queue<Node> queue, List<Integer> retVal) {
        if (queue.peek() == null) {
            return;
        }
        Node node = queue.poll();
        retVal.add(node.value);
        if (node.getLeft() != null) {
            queue.offer(node.getLeft());
        }
        if (node.getRight() != null) {
            queue.offer(node.getRight());
        }
        BFSRecursive(queue, retVal);
    }

    public void DFSInOrder(Node node, Queue<Integer> retVal) {
        if (node.getLeft() != null) {
            DFSInOrder(node.getLeft(), retVal);
        }
        retVal.offer(node.getValue());
        if (node.getRight() != null) {
            DFSInOrder(node.getRight(), retVal);
        }
    }

    public void DFSPreOrder(Node node, Queue<Integer> retVal) {
        retVal.offer(node.getValue());
        if (node.getLeft() != null) {
            DFSPreOrder(node.getLeft(), retVal);
        }
        if (node.getRight() != null) {
            DFSPreOrder(node.getRight(), retVal);
        }
    }

    public void DFSPostOrder(Node node, Queue<Integer> retVal) {
        if (node.getLeft() != null) {
            DFSPostOrder(node.getLeft(), retVal);
        }
        if (node.getRight() != null) {
            DFSPostOrder(node.getRight(), retVal);
        }
        retVal.offer(node.getValue());
    }

    public void remove(Integer value) {
        // TODO
    }

    public Integer[] traverse() {
        return null;
    }

    public int getLength() {
        return length;
    }

    public Node getRoot() {
        return root;
    }

    class Node {
        Integer value;
        Node left;
        Node right;

        public Node(Integer value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
