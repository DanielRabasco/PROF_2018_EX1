package examen_daniel.exam_daniel;

public class MyString {
	
	private String st;
	
	public MyString(String st){
		this.st = st;
	}
	
	public int compareTo(MyString ms){
		String otherSt = ms.getString();
		int minLength = Math.min(st.length(), otherSt.length());
		
		//nodo 2
		for (int i = 0; i < minLength; i++){
			int diff = st.charAt(i)-otherSt.charAt(i);
			//nodo 3
			if (diff != 0){
				return diff;
			}
		}
		
		// nodo 5 
		if (st.length() == otherSt.length()){	
			// nodo 5 -> 6
			return 0;
		}else{
			// nodo 5 -> 7
			return (st.length() - otherSt.length());
		}
	}
	
	public String getString(){
		return st;
	}
}
