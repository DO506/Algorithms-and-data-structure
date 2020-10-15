public class BubbleSort{  
    static void bubbleSort(int[] arr) {  
        boolean swapped=true;
        int n=arr.length;
        int temp=0;
    
        while(swapped)
        {
            swapped=false;
             
            for(int i=0; i<n-1; i++)
            {
               
                if(arr[i]>arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swapped=true;
                }
            }
            n--;
 
        }
    }
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  