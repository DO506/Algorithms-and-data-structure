public class arrayResize{
	static int[] a;
	public static int[] resize(int length){
		
		int[] temp = new int[length];
		for (int i=0;i<a.length;i++){
			temp[i] = a[i];

		}
		temp[length - 1] = 4;
		a = temp;
		return a;

	}

	public static void main(String[] args){
		a = new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		int[] newArr=resize(4);

		for (int i=0;i<newArr.length;i++){
			System.out.println(newArr[i]);
		}
		

		
	}
	
}