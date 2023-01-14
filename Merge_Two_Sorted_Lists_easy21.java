package romanLeet;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class Merge_Two_Sorted_Lists_easy21 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		System.out.println(a < b?b:a);

	}

	static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode n = new ListNode(-1);
		ListNode c = n;
		if (list1 == null || list2 == null) {
			if (list1 == null)
				c.next = list2;
			else
				c.next = list1;

			return n.next;
		}

		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				c.next = list1;
				list1 = list1.next;
			} else {
				c.next = list2;
				list2 = list2.next;
			}
			c = c.next;
		}
		c.next = list1 == null ? list2 : list1;
		return n.next;

	}

}
