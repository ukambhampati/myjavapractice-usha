package programsjavapractice;
public class GetSubDomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetSubDomain.getSubDomain("https://www.google.com");
	}
	public static void getSubDomain(String url) {
		// url="https://www.google.com
		int start = url.indexOf("://", 0)+3;
		String s1 = new String("usha").intern();
		// String interning will help in checking the string pool before creating new data in the java heap spacec
		int end = url.indexOf(".", start);
		System.out.println(url.substring(start, end));	
		System.out.println(start);
	}
}
