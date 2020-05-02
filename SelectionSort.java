
public class SelectionSort {
	
	public static void selectionSort(int [] liste) {
		int n=liste.length;
		int min;
		int temp;
		for(int i=0;i<n;i++) {
			min=i;
			for(int j=i+1;j<n;j++) {
				if(liste[j]<liste[min]) {
					min=j;
				}
				temp=liste[i];
				liste[i]=liste[min];
				liste[min]=temp;
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
		selectionSort(liste);
		printArray(liste);
	}
	
}
