class LinkedListSearchByIndex {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Insert a node at the end of the linked list
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

    // Search for a value by index in the linked list
    public int searchByIndex(int index) {
        Node temp = head;
        int currentIndex = 0;

        while (temp != null) {
            if (currentIndex == index) {
                return temp.data; // Return the value at the specified index
            }
            temp = temp.next;
            currentIndex++;
        }

        throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListSearchByIndex list = new LinkedListSearchByIndex();

        // Insert elements into the linked list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Display the linked list
        System.out.println("Linked List:");
        list.display();

        // Search for values by index
        int index1 = 2;
        try {
            System.out.println("Value at index " + index1 + ": " + list.searchByIndex(index1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        int index2 = 5; // Invalid index
        try {
            System.out.println("Value at index " + index2 + ": " + list.searchByIndex(index2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
