class Node {
	int value;
	int count;
	Node next;

	public Node(int value, int count) {
		this.value = value;
		this.count = count;
		this.next = null;
	}
}

class add {
	Node head;

	public Node addinlink(int add, int fre) {
		Node nayi = new Node(add, fre);
		if (head == null)
			head = nayi;
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = nayi;

		}

		return head;

	}

	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.value + "->" + current.count + " ");
			current = current.next;
			System.out.println();
		}

	}
}

public class problem {
	public static void main(String[] args) {
		int prev = 0;
		add ll = new add();
		int arr[] = { 1, 1, 1, 1, 3, 3, 4, 1, 1, 1, 2 };
		int count = 0;

		/* yaha element add ho rahe hai **/
		for (int i = 0; i < arr.length - 1; i++) {
			if (i + 1 > arr.length)
				break;
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				ll.addinlink(arr[i], count + 1);
				count = 0;
			}
		}
		/* yaha baki last vala add ho raha hai */
		for (int i = arr.length; i > 0; i--) {

			if (arr[i - 1] == arr[i - 2]) {
				count++;
			} else {
				ll.addinlink(arr[i - 1], count + 1);
				count = 0;
				break;
			}
		}

		/* yaha print ho raha hai */
		ll.printList();
	}
}
