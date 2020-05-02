import java.util.Arrays;
import java.util.Random;
import java.io.InputStream;
import java.lang.*;

public class Sort {



    public static int randomFill(){
        Random rand = new Random();
        int randomNum = rand.nextInt();
        return (randomNum%1000)+1000;
    }


    public static void selection_sort(int[] anArray, int size){
    	
    	int tmp;
    	int min;
    	for (int i=0;i<size-1;i++) {
    		min=i;
    		for(int j=i+1;j<size;j++) {
    			if(anArray[j]<anArray[min]) {
    				tmp=anArray[i];
    				anArray[i]=anArray[min];
    				anArray[min]=tmp;
    			}
    		}
    	}
    }
    
    public static void insertion_sort(int[] anArray, int size){
    	
    	for(int i=0;i<size;i++) {
    		int min=anArray[i];
    		for(int j=i;j>0;j--) {
    			if(min<anArray[j-1]) {
        			int tmp=anArray[i];
        			anArray[j]=anArray[j-1];
        			anArray[j-1]=tmp;
    			}
    			else {
    				break;
    			}
    		}
    	}
    }
    
    public static void merge_sort(int[] anArray, int size){
    	
    	if(size<2) {
    		return;
    	}
    	int mid=size/2;
    	int leftSize=mid;
    	int rightSize=size-mid;
    	int []left=new int[leftSize];
    	int [] right=new int[rightSize];
    	for(int i=0;i<mid;i++) {
    		left[i]=anArray[i];
    	}
    	for(int i=mid;i<size;i++) {
    		right[i-mid]=anArray[i];
    	}
    	merge_sort(left,leftSize);
    	merge_sort(right,rightSize);
    	merge(left, right, anArray);

    }
    public static void merge(int[] left, int[] right, int[] arr) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < leftSize) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < leftSize) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }
    
    
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
      int size= 1000;
      int choice=3;

      System.out.println(size);
      System.out.println(choice);
      int[] anArray;
 
      if (args.length > 0) {
        try {
          size = Integer.parseInt(args[0]);
          choice = Integer.parseInt(args[1]);
        System.out.println(size + choice);
      } catch (NumberFormatException e) {
        System.err.println("Argument" + args[0] + " must be an integer.");
          System.exit(1);
        }
      }
      System.out.println(size);
      System.out.println(choice);
      
      if(choice>=1 && choice<=4){
        anArray = new int[size];
        for(int i=0;i<anArray.length;i++)
        {
          anArray[i] = randomFill();
          //System.out.println(anArray[i]);
        }

        double startTime = System.nanoTime();

        if(choice == 1){
            System.out.println("Selection sort is selected\n");
            selection_sort(anArray, size);
        }
        if(choice == 2){
            System.out.println("Insertion sort is selected\n");
            insertion_sort(anArray, size);
        }
        if(choice == 3){
            System.out.println("Merge sort is selected\n");
            merge_sort(anArray, size);
        }
        if(choice == 4){
            System.out.println("Quick sort is selected\n");
            quick_sort(anArray, size);
        }


        double endTime = System.nanoTime();

        double duration = (endTime - startTime)/1000000;  //divide by 1000000 to get milliseconds.
        System.out.println("it took: " + duration + " milliseconds");
      }

    }

}
