public class SelectionSort implements Practice03Sort{
	public void sort(int [] a){
		for(int i = 0; i < a.length -1; i++){
			swap(a, i, findmin(a, i));
		}
	}

	public int findmin(int [] a, int start){
		int min = start;
		for(int i = start + 1; i < a.length; i++){
			if(a[i] < a[min])
				min = i;
		}
		return min;
	}

	public void swap(int [] a, int l, int m){
		int temp = a[l];
		a[l] = a[m];
		a[m] = temp;
	}
}