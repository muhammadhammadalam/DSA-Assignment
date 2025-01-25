class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;

    // Insert at the end
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
            newNode.prev = temp;
        }
    }

    // Delete a node by value
    public void delete(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp != null) {
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            }
        }
    }

    // Search for a value
    public boolean search(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        System.out.println("List after insertion:");
        list.display();

        System.out.println("Search for 2: " + list.search(2));
        System.out.println("Search for 5: " + list.search(5));

        list.delete(2);
        System.out.println("List after deletion of 2:");
        list.display();
    }
}
