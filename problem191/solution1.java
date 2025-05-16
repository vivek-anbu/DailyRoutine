
	public static Node reverse(Node head){
		Node curr = head;
		Node prev = null;
		Node n = null;
		while(curr != null){
			n = curr.next;
			curr.next = prev;
			prev = curr;
			curr = n;
		}
		return prev;
	}
	public static Node addOne(Node head) {
		// Write your code here.
		Node temp = reverse(head);
		int carry = 1;
		Node t = temp;
		Node prev = null;
		while(t != null){
			int sum = carry;
			sum += t.data;
			t.data = sum%10;
			carry = sum/10;
			prev = t;
			t = t.next;
		}
		if(carry != 0){
			Node ans = new Node(carry);
			prev.next = ans;
		}
		return reverse(temp);
