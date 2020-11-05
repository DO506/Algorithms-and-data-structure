public class InsertionSort {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int ele = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > ele ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = ele;  
        }  
    }  
}  
