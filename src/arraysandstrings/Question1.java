package arraysandstrings;

public class Question1 {
	static int checker=0;
	public static void main(String[] args) {
		
		Question1 q1=new Question1();
		System.out.println(q1.isUniqueChars("ramu"));
	}

	public boolean isUniqueChars(String s) {
		
		for(int i=0; i<s.length(); i++)
		{
			int val = s.charAt(i)-'a';
			if((checker & (1<<val))>0)
{
	return false;
}
checker|=(1<<val);
		}
		return true;
		}
		
	}
