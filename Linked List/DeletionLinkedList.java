class DeletionLinkedList {
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

    // Delete a node by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        // If the head node is to be deleted
        if (head.data == value) {
            head = head.next;
            System.out.println("Deleted: " + value);
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Deleted: " + value);
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
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeletionLinkedList list = new DeletionLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);

        System.out.println("Original List:");
        list.display();

        list.delete(2);
        System.out.println("After Deleting 2:");
        list.display();

        list.delete(5); // Trying to delete a non-existing value
    }
}