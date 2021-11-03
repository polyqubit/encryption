import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int data = 123456;
    		System.out.println(Encrypt.toInt(Encrypt.toArray(data, true)));
	    	int encryptedData = Encrypt.rotateEnc(data,202);
	    	System.out.println(encryptedData);
	    	Encrypt.toArray(encryptedData, true);
	    	//Method of encryption useless
	    	//There are only 9 possible keys(10 including key = 0)
	}
}
