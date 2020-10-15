public class MergeSort {
    
    // stably merge a[lo .. mid] with a[mid+1 ..hi] using aux[lo .. hi]
    private static void merge(int [] a, int[] aux, int lo, int mid, int hi) {
         for(int i = lo; i < hi + 1; i ++)
            aux[i] = a[i];

        int i = lo;
        int j = mid + 1;
        for (int m = lo; m <= hi; m ++){

            if (i == mid + 1){
                a[m] = aux[j++];
            }
            else if (j == hi + 1){
                a[m] = aux[i ++];
            }
            else if (less(aux[i], aux[j])){
                a[m] = aux[i++];
            }
            else{
                a[m] = aux[j++];
            }

        }
    }

    // mergesort a[lo..hi] using auxiliary array aux[lo..hi]
    private static void sort(int[] a, int[] aux, int lo, int hi) {
        if (lo<hi){
            int mid = (lo + hi ) / 2;
            sort(a,aux,lo, mid);
            sort(a,aux,mid + 1, hi);
            merge(a, aux, lo, mid, hi);    
        }
   }

    
    //Rearranges the array in ascending order, using the natural order.
     
     private static void sort(int[] a) {
        int[] aux= new int[a.length];
        sort(a,aux, 0, a.length - 1);

     }


   // /***************************************************************************
   //  *  Helper sorting function.
   //  ***************************************************************************/
    
    // is v < w ?
    private static boolean less(Integer v, Integer w) {
        if (v.compareTo(w) < 0)
            return true;
        return false;
   
    }
        
   // /***************************************************************************
   //  *  Check if array is sorted - useful for debugging.
   //  ***************************************************************************/
   //  private static boolean isSorted(int[] a) {
   //      return isSorted(a,0,a.length - 1);
      
   //  }

    // private static boolean isSorted(int[] a, int lo, int hi) {
    //     for (int i = lo + 1; i <= hi; i++){
    //         if(less(a[i], a[i-1])){
    //             return false;
    //         }
    //     }
    //     return true;

    // }

    // print array to standard output
    public static void show(int[] a) {
        sort(a);
        System.out.print("Sorted array ");
        for (int i = 0; i < a.length; i ++){
            System.out.print(a[i]+" ");
        }
        
    }

 
     //Reads in a sequence of strings from standard input; mergesorts them; 
    //and prints them to standard output in ascending order. 
    public static void main(String[] args) {
       // created an unsorted array
    int[] a= { 6, 5, 12, 10, 28, 56 };
    System.out.print("Unsorted array ");

    for (int i = 0; i < a.length; i ++){
            System.out.print(a[i]+" ");
    }
    System.out.println();
   MergeSort.sort(a);
   show(a);
   
  }
    
    
}