 import java.util.*;

public class solution {
	public static int Floor(BinaryTreeNode<Integer> node, int input) {
	
		int floor=-1;
		if(node==null)
		{
			 return Integer.MAX_VALUE;
		}
		if(node.data==input)
		{
			return node.data;
		}

		if(node.data>input)
		{
			return Floor(node.left,input);
		}
		else
		{
			 floor=Floor(node.right,input);
		}

		if(floor<=input)
		{
			return floor;
		}
		return node.data;

	}

}
