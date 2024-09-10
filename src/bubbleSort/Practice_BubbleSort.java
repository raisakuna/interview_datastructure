package bubbleSort;


public class Practice_BubbleSort {
	public static void printArray(int [] arr) {
		for(int i =0; i <arr.length; i++) {
			System.out.print( arr[i] + " ") ;
		}
	}
	public static void main(String[] args) {
		int [] arrayData = {45,5,33,78,32,21,6};
		
		for(int i = 0; i < arrayData.length; i++) {
			int flag = 0;
			for(int j = 0; j <arrayData.length -i -1; j++) {
				if (arrayData[j] >arrayData[j+1]) {
					int temp = arrayData[j];
					arrayData[j] =arrayData[j+1];
					arrayData[j+1] = temp;
					
				flag = 1;
			}
		}
		if (flag == 0) {
			break;
		}
	}
		printArray(arrayData);
}
}