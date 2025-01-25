public class SearchLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Insert a node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Search for a node by value
    public void search(int value) {
        if (head == null) {
            System.out.println("List is empty. Cannot search.");
            return;
        }

        Node temp = head;
        int index = 0;
        while (temp != null && temp.data != value) {
            temp = temp.next;
            index++;
        }

        if (temp != null) {
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found: " + value);
        }
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SearchLinkedList list = new SearchLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.display();
        System.out.println();

        list.search(30);
        list.search(60);
    }
    
}
