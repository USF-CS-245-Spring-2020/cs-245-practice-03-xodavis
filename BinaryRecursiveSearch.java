public class BinaryRecursiveSearch implements Practice03Search{
	public int search(int [] arr, int target){
		int max = arr.length - 1;
		int min = 0;
		binSearch(arr, target, max, min);
	}

	public int binSearch(int [] a, int target, int max, int min){
		if(min > max)
			return -1;
		int mid = (max + min)/2;
		if(a[mid] == target)
			return mid;
		else if(a[mid] < target)
			return binSearch(a, target, max, mid + 1);
		else
			return binSearch(a, target, mid - 1, min);
	}
}