import java.util.Arrays;

public class QuickSort {
	
	
    public static void quick_sort(int[] anArray, int size){
    	recursiveQuickSort(anArray, 0, anArray.length - 1);
    }
    public static void recursiveQuickSort(int[] array, int startIdx, int endIdx) {
    	
    	int pivotIndex=partition(array, startIdx, endIdx);
    	if(startIdx<pivotIndex-1) {
    		recursiveQuickSort(array, startIdx, pivotIndex - 1);
    	}
    	if (endIdx > pivotIndex) { 
    		recursiveQuickSort(array, pivotIndex, endIdx); 
    	}	
    }
    
    public static int partition(int[] array, int left, int right) {
    	int pivot=array[left];
    	while(left<=right) {
    		while(array[left]<pivot) {
    			left++;
    		}
    		while(array[right]>pivot) {
    			right--;
    		}
    		
    		if(left<=right) {
    			int tmp=array[left];
    			array[left]=array[right];
    			array[right]=tmp;
    			
    			left++;
    			right--;
    		}
    	}
    	return left;
    }
	
	
	public static void main (String[] args) {
		int liste[] = {12, 11, 13, 5, 6, 7};
		quick_sort(liste,liste.length);
		System.out.println(Arrays.toString(liste));
	    
	}
}
