import java.util.ArrayList;

public final class Encrypt {
	public static int[] toArray(int data, boolean print) {
		int copy = data;
		int write = 0;
		ArrayList<Integer> storageTemp = new ArrayList<Integer>();
		
		while(copy!=0) {
			write = copy%10;
			copy/=10;
			storageTemp.add(write);
		}
		int[] out = new int[storageTemp.size()];
		int otherCounter = 0;
		for(int i=storageTemp.size()-1; i>=0; i--) {
			out[otherCounter] = storageTemp.get(i);
      otherCounter++;
		}
		if(print) {
			System.out.print("[ ");
			for(int i : out) {
        System.out.print(i+" ");
      }
      System.out.println(" ]");
		}
		return out;
	}
  public static int toInt(int[] data) {
    int placeCounter = 1;
    int total = 0;
    for(int i=data.length-1;i>=0;i--) {
      total += data[i] * placeCounter;
      placeCounter *= 10;
    }
    return total;
  }
	public static int rotateEnc(int data, int key) {
		int[] dataArray = toArray(data, false);
    int test = 0;
    for(int i=0; i<dataArray.length; i++) {
      dataArray[i] += key;
      if(dataArray[i]>9) {
        test = dataArray[i]%10;
        dataArray[i] = test;
      }
      System.out.println(dataArray[i]);
    }
    return toInt(dataArray);
	}
}
