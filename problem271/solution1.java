package inter;


public class Problem14 {

    public static void main(String[] args) {
    	String input1 = "((abc)((de))";
        String output1 = removeUnbalanced(input1);
        System.out.println("Input  : " + input1);
        System.out.println("Output : " + output1); 
    }
    public static String removeUnbalanced(String s)
    {	
    	
    	if(s.isEmpty()||s==null)
    	{
    		return " ";
    	}
    	int open =0;
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<s.length();i++)
    	{
    		char c=s.charAt(i);
    		if(c=='(')
    		{
    			open++;
    			sb.append(c);
    		}
    		else if(c==')')
    		{
    			if(open>0)
    			{
    				sb.append(c);
    				open--;
    			}
    		}
    		else
    		{
    			sb.append(c);
    		}
    	}
    	int extraOpen=open;
    	StringBuilder res=new StringBuilder();
    	for(int i=sb.length()-1;i>=0;i--)
    	{
    		char c=s.charAt(i);
    		if(c=='('&&extraOpen>0)
    		{
    			extraOpen--;
    			continue;
    		}
    		res.insert(0,c);
    	}
    	
    	return res.toString();
    }

}

    
