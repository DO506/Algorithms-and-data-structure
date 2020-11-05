public class LinearSearch{

	public static int LinearSearch(int[]a, int key){
		for (int i=0; i<a.length;i++){
			if(a[i] == key){
				return i;
			}
		}
		return -1;
	}

	public static void main(String [] args){

		int[] a ={12,45,67,43,54,35};
		int key = 5;
		if(LinearSearch(a,key)==-1){
			System.out.println("key elment not found");
			
		}
		else{
			System.out.println("the key " + key+ " is at index " +LinearSearch(a,key));
			
		}
		


	}
}