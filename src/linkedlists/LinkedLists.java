package linkedlists;

public class LinkedLists {
	/*-----------------------------------------------------------------------------
	 * MAIN FUNCTION
	 * ----------------------------------------------------------------------------
	 */
	
	/**
	 * Run a test and check time of that test.
	 */
	private void runTests() {
		System.out.println("Start...");
		long startTime = System.nanoTime();
		
		//-Run methods---------------------------------------------------------------------------
		
		// Problem 2.5
		Node h1 = new Node(7);
		h1.append(1);
		h1.append(6);
		h1.append(2);
		h1.append(1);
		Node h2 = new Node(5);
		h2.append(9);
		h2.append(3);
		System.out.println("Result: ");
		sum2NumbRevr(h1, h2).printList();
		//------------------------------------------------------------------------------------------
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000 ;
		System.out.println("End. Execution time is: " + duration);		
	}
	
	/**
	 * Main function
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedLists as = new LinkedLists();
		as.runTests();
	}
	
	/*-----------------------------------------------------------------------------
	 * PROBLEMS 2.5
	 *-----------------------------------------------------------------------------*/
	public Node sum2NumbRevr(Node head1, Node head2) {
		int mem = 0;
		Node result = new Node();
		Node n = result;
		
		// add O if to the shorter list if length of 2 linked lists are different
		Node n1 = head1;
		Node n2 = head2;
		while (n1.next != null || n2.next != null) {
			if (n2.next == null) {n2.next = new Node(0);}
			if (n1.next == null) {n1.next = new Node(0);}
			n1 = n1.next;
			n2 = n2.next;
		}
		head1.printList();
		head2.printList();
		// perform calculation
		while (head1 != null && head2 != null) {
			int s = head1.data + head2.data + mem;
			n.data = s % 10 ;
			mem = (s >= 10) ? 1 : 0;
			if (head1.next != null) {
				n.next = new Node();
				n = n.next;
			}
			head1 = head1.next;
			head2 = head2.next;
		}
		if (mem == 1) {
			n.next = new Node(1);
		}
		
		return result;
	}
}
