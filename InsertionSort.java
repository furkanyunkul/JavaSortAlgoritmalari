
public class InsertionSort {
	public static void insertionSort(int [] liste) {
		int n=liste.length;
		for(int i=0;i<n;i++) {
			int min=liste[i];
			
			for(int j=i;j>0;j--) {
				
				if(min<liste[j-1]) {
					int temp=liste[j];
					liste[j]=liste[j-1];
					liste[j-1]=temp;
					}
				else {
					break;
				}
			}
		}
	}
	
	public static void printArray(int liste[]) 
    { 
        int n = liste.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(liste[i] + " "); 
        System.out.println(); 
    } 
	
	public static void main(String[] args) {
		int[] liste= {23,78,45,8,32,56};
		insertionSort(liste);
		printArray(liste);
	}
}
