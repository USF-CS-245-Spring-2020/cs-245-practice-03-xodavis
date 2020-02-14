public class BubbleSort implements Practice03Sort{
		public void sort(int [] a){
			int incrimator = 1;
			boolean swapper = true;
			while(swapper){
				swapper = false;
				for(int i = 0; i < a.length - incrimator; i++){
					if(a[i] > a[i + 1]){
						swap(a, a[i], a[i + 1]);
						swapper = true;
					}
				}
				++incrimator;
			}
		}

		void swap(int [] a, int more, int less){
			int temp = a[more];
			a[more] = a[less];
			a[less] = temp;
		}
}