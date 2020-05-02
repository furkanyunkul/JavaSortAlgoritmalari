
public class BubleSort {
	public static void bubleSort(int [] liste) {
		int n=liste.length-1;
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				if(liste[j-1]>liste[j]) {
					int temp=liste[j];
					liste[j]=liste[j-1];
					liste[j-1]=temp;
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
		bubleSort(liste);
		printArray(liste);
	}
}
