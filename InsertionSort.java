public class InsertionSort implements Practice03Sort{
	public void sort(int [] a){
		for(int i = 1; i < a.length; i++){
			int temp = a[i];
			int j = i - 1; //j = 0 at this point for the first iteration
			while(temp < a[j] && j >= 0){
				a[j + 1] = a[j];
				--j;
			}
			a[j + 1] = temp;
		}
	}
}