
public class problem3 {

	public static void main(String[] args) {
		String s= "ababcddccdddrr";
		int count[]= new int[27];
	  String ans="";
		
		for(int i=0; i<s.length();i++)
		{
			count[s.charAt(i)-'a']++;
		}
		
		for(int i =0; i<27;i++)
		{
			if(count[i]!=0)
			{
				char t=(char) ((char) i+97);
				ans=ans+t+count[i];
				
			}
		}
		System.out.println(ans);
		
	}

}
