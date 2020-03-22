package tddjunit;

public class RemoveAChar {

	public String remove(String string) {
		// TODO Auto-generated method stub
		String str="";
		int i =0;
		 while(i<2 && i<string.length()){
			if(string.charAt(i)!='A') {
				str+=string.charAt(i);
			}
			i++;
		}
	return str+string.substring(i);

}
}