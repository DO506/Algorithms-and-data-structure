class BinarySearch{  
 public static void binarySearch(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }

      else if ( arr[mid] == key ){  
        System.out.println("Element "+key+" is found at index: " + mid);  
        break;  
      }

      else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  
 public static void main(String args[]){  
        int arr[] = {10,4,24,8,20,35,97,40,70};  
        InsertionSort.insertionSort(arr);
        for (int i=0;i<arr.length ;i++ ) {
        	System.out.println(" " +arr[i]);
        }  
        int key = 4;  
        int last=arr.length-1; 
        binarySearch(arr,0,last,key);  
       
 }  
}  