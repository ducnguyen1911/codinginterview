package linkedlists;

public class Node {
	int data;
	Node next = null;

	Node() {}
	
	Node(int d) {
		this.data = d;
	}

	/**
	 * Append a new node to the tail of LinkedList
	 * @param d
	 */
	void append(int d) {
		Node newNode = new Node(d);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = newNode;
	}

	/**
	 * Delete a node with a given data then return head node.
	 * @param d
	 */
	Node delete(Node head, int d) {
		Node n = head;
		if (n.data == d) {
			return n.next;
		} else {
			while (n.next != null) {
				if (n.next.data == d) {
					n.next = n.next.next;
					return head;
				}
				n = n.next;
			}
			return head;
		}
	}

	/**
	 * Print a LinkedList from the current node.
	 */
	void printList() {
		Node n = this;
		System.out.println();
		while (n != null) {
			System.out.print(n.data + " ");
			if (n.next != null) {
				n = n.next;
			} else {
				System.out.println();
				break;
			}
		}
	}

	/**
	 * Main function
	 * @param args
	 */
	public static void main(String[] args) {
		Node headLL = new Node(12);
		headLL.append(11);
		headLL.append(8);
		headLL.printList();

		headLL = headLL.delete(headLL, 12); // return a new head
		headLL.printList();

	}

}
