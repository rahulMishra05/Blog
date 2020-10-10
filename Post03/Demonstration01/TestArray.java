class TestArray{
	public static void main(String args[]){
		int a[] = {10, 20, 30, 40, 50};		// Initilization
		
		// Traversing array
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
		// Average calculation
		float sum = 0, avg;
		for(int i = 0; i<a.length; i++)
			sum += a[i];
		avg = sim/a.length;
		System.out.println("Average = " + avg);
	}
}