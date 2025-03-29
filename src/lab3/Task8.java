package lab3;

public class Task8 {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.createTailRec(10);
        System.out.println(myList);
        myList.Insert(26, 3);
        System.out.println(myList);
        myList.remove(3);
        System.out.println(myList);
    }
}

class LinkedList {
    static class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;

    public void createHead(int length) {
        for (int i = length; i >= 0; i--) {
            head = new Node(i, head);
        }
    }

    public void createTail(int length) {
        for (int i = 0; i <= length; i++) {
            Node newNode = new Node(i, null);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        Node ref = head;
        while (ref != null) {
            result.append(ref.value).append(", ");
            ref = ref.next;
        }
        return result.substring(0, result.length() - 2);
    }

    public void addFirst(int value) {
        head = new Node(value, head);
    }

    public void addLast(int value) {
        Node newNode = new Node(value, null);
        if (tail == null) {
            Node ref = head;
            while (ref != null) {
                ref = ref.next;
            }
            ref.next = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void Insert(int value, int index) {
        Node newNode = new Node(value, null);
        Node ref = head;

        for (int i = 0; i != index - 1; i++) {
            ref = ref.next;
        }

        newNode.next = ref.next;
        ref.next = newNode;
    }

    public void removeFirst() {
        head = head.next;
    }

    public void removeLast() {
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public void remove(int index) {
        Node ref = head;
        for (int i = 0; i != index - 1; i++) {
            ref = ref.next;
        }
        ref.next = ref.next.next;
    }

    public void createHeadRec(int length) {
        head = headRec(0, length - 1);
    }

    private Node headRec(int i, int length) {
        if (i > length) return null;
        return new Node(i, headRec(i + 1, length));
    }

    public void createTailRec(int length) {
        head = tailRec(0, length);
    }

    private Node tailRec(int i, int length) {
        if (i > length) return null;
        return new Node(i, tailRec(i + 1, length));
    }

    public String toStringRec(Node node) {
        if (node == null) return "";
        return node.value + (node.next != null ? " " + toStringRec(node.next) : "");
    }
}
