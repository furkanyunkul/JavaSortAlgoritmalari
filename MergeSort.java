
public class MergeSort {

	public static void merge(int liste[], int first, int mid, int last) {
        int n1 = mid - first + 1; 
        int n2 = last - mid; 
        
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = liste[first + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = liste[mid + 1+ j]; 
		
        /* Merge the temp arrays */
        
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
        // Initial index of merged subarry array 
        int index = first; 
        
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                liste[index] = L[i]; 
                i++; 
            } 
            else
            { 
            	liste[index] = R[j]; 
                j++; 
            } 
            index++; 
        } 
        
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
        	liste[index] = L[i]; 
            i++; 
            index++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
        	liste[index] = R[j]; 
            j++; 
            index++; 
        } 
	}
	
	
	public static void mergeSort(int liste[],int first,int last) {
		if(first<last) {
            // Find the middle point 
            int mid = (first+last)/2; 
  
            // Sort first and second halves 
            mergeSort(liste, first, mid); 
            mergeSort(liste , mid+1, last); 
  
            // Merge the sorted halves 
            merge(liste, first, mid, last); 
		}
	}
	
    public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	
	public static void main (String[] args) {
		int liste[] = {12, 11, 13, 5, 6, 7};
	    System.out.println("Given Array"); 
	    printArray(liste);
	    mergeSort(liste, 0, liste.length-1);
        System.out.println("\nSorted array"); 
        printArray(liste); 
	}
}
