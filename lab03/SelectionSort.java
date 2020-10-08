public class SelectionSort{
	public static void sort(int[] array){
		int n = array.length;
		for (int i=0; i<n-1; i++){

			int smallest = i;
			for (int j=i+1; j<n; j++){
				if(array[j]<array[smallest]){
					smallest=j;
				}
				
			}
			int smallerNumber = array[smallest];
			array[smallest] = array[i];
			array[i] = smallerNumber;
		}
	}
	public static void main(String a[]){  
        int[] array = {3,6,8,4,7,4,3,6,4,};  
        System.out.println("Before Selection Sort");  
        for(int i=0; i<array.length; i++){  
            System.out.print(array[i]+ " ");  
        }  
        System.out.println();  
          
        sort(array);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i=0; i<array.length; i++){  
            System.out.print(array[i]+" ");  
        }  
    }  
}
