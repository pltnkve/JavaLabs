package lab3;

public class Task7Tail {
    public static void main(String[] args) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i <= 9; i++) {
            Node newNode = new Node(i, null);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }

        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
