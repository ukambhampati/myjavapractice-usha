package programsjavapractice;
import java.util.Random;

public class ExtractFileExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "halloworld.txt";
		System.out.println(s1.substring(s1.lastIndexOf('.')+1));
		System.out.println(String.format("hey there %s, i want to attend %d interviews in %s days", "Usha",4,"30"));
		System.out.println(Math.random());
		String alphanum = "ABCDEFGHIKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghiklmnopqrstuvwxyz";
		StringBuilder ab = new StringBuilder();
		for(int y=0;y<10;y++) {
			int index = (int)(alphanum.length()*Math.random());
			ab.append(alphanum.charAt(index));
		}
		System.out.println(ab.toString());
	}

}
