class insertionSort{
	
	void sort(int arr[],int max){
			for(int i=1;i<=max;i++){
				int x=arr[i];
				int j=i-1;
				arr[j+1]=x;
				
				while(i>=0 && arr[j]>x){
					arr[j+1]=arr[j];
					j--;
					System.out.println();
					display(arr);	
					}
				arr[j+1]=x;
		}	
		}
		void display(int arr[]){
			for (int i=0;i<=4;i++){
			System.out.print(arr[i]);
			}
		}
	public static void main (String args[]){
		insertionSort i=new insertionSort();
		int arr[]={1,2,4,5,3};
		int n=arr.length;
		int max=n-1;
		i.sort(arr,max);
		System.out.println();
		i.display(arr);
	}
}