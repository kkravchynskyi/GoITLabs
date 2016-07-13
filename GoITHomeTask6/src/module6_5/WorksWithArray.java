package module6_5;

public class WorksWithArray {
	private double[] arr = new double[20];
	private double min;
	private double max;
	private int sizeArray;
	
	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public int getSizeArray() {
		return sizeArray;
	}

	public void setSizeArray(int sizeArray) {
		this.sizeArray = sizeArray;
	}

	public double getElelementArray(int i){
				return arr[i];
	}
	
	public void setElementArray(int i, double x){
				arr[i] = x;
	}
	
	public int lengthArray(){
				return arr.length;
	}
	
	void findMaxMin(){
		max = arr[0];
		min = arr[0];
		for(int i = 1; i < sizeArray; i++){
			if(max < arr[i]) max = arr[i];
			if(min > arr[i]) min = arr[i];
		}
	}
	
	void sortSelection(){
		 for (int i = 0; i < sizeArray; i++) {
		   double min = arr[i];
		   int min_i = i; 
		   for (int j = i+1; j < sizeArray; j++) {
		      if (arr[j] < min) {
		         min = arr[j];
		         min_i = j;
		      }
		   }
		   if (i != min_i) {
		      double tmp = arr[i];
		      arr[i] = arr[min_i];
		      arr[min_i] = tmp;
		   }
		 }
	}
}
