import java.util.ArrayList;

public final class Encrypt {
	public static int[] toArray(int data, boolean print) {
		int copy = data;
		int write = 0
		ArrayList<Integer> storageTemp = new Arraylist<>();
		
		while(copy!=0) {
			write = copy%10;
			copy/=10;
			storageTemp.add(write);
		}
		int[] out = new int[storageTemp.size()];
		int otherCounter = 0;
		for(int i=storageTemp.size()-1; i>=0; i--) {
			out[otherCounter] = storageTemp.get(i);
		}
		if(print) {
			System.out.println("[ ");
			for(int : )
		}
		return out;
	}
	public static int rotateEnc(int data, int key) {
		return 0;
	}
}