
public class mock3 {

	private String name="Anish";

	public String getName(String name) {
		try {
			if (this.name.equals(name)) {
			
				for (int i = 0; i <name.length(); i++) {
					char temp=name.charAt(i);
				if ((temp>='a' && temp<='z') && temp!=' ') {
					temp=(char)(temp+26);
				}
				
				}
				return reverse(name);
			}
		} catch (IllegalArgumentException e) {
			return "Try again enter valid name";
		}
		return name;
		
	}
	
	public String reverse(String s)
	{
        String ans="";
       for (int i = s.length()-1; i>=0; i--) {
		ans+=s.charAt(i);
	}
       return ans;
       
	}
	
	public static void main(String[] args) {
		mock3 m=new mock3();
		m.getName("Anish");
	}

	
	
	
}
