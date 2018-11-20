package examen_daniel.exam_daniel;

public class MyString {
	
	String st;
	
	public MyString(String st){
		this.st = st;
	}
	
	public int compareTo(MyString ms){
		String otherSt = ms.getString();
		int minLength = Math.max(st.length(), otherSt.length());
		
		for (int i = 0; i < minLength; i++){
			int diff = st.charAt(i)-otherSt.charAt(i);
			if (diff != 0){
				return diff;
			}
		}
		
		if (st.length() == otherSt.length()){		
			return 0;
		}else{
			return (st.length() - otherSt.length());
		}
	}
	
	public String getString(){
		return st;
	}
}
