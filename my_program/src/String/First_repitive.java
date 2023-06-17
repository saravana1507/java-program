package String;

public class First_repitive {
// find the first repitive letter 
	public static void main(String[] args) {
		First_repitive ob=new First_repitive();
		  ob.letter();

	}
	public void letter()
	{
		String s=" i am reading book";
		boolean flag=false;
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j) && s.charAt(i) != ' ') {
					System.out.println("first repeat letter : " + s.charAt(i));
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
	}

}
