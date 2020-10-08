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
       
    public static void main(String a[]){    
        int[] array = {3,6,8,4,7,4,3,6,4,};    
        System.out.println("Before Insertion Sort");    
        for(int i=0; i<array.length; i++){  
            System.out.print(array[i]+ " ");  
        } 
        System.out.println();    
            
        insertionSort(array);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i=0; i<array.length; i++){  
            System.out.print(array[i]+ " ");  
        }     
    }    
}  
