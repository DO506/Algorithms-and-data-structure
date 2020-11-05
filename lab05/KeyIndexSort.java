public class KeyIndexSort{
	public void Keyindexcounting(char[] a){
		// int N = a.length;
		// int R = 256;
		// int count[] = new int[R + 1];
		// int[] aux = new int[a.length];
		
		int N = a.length;
		int R = 256;
		int count[] = new int [R + 1];
		char[] aux = new char[a.length];

		for (int i=0; i<N; i++){
			count[a[i]+1]++;
		}
		for (int r =0; r<R; r++){
			count[r+1] += count[r];
		}
		for(int i=0;i<N;i++){
			aux[count[a[i]] ++] = a[i];
		}
		for (int i = 0; i < N; i++){
			a[i] = aux[i];
		}

	}
	public static void main(String[] args) {

		KeyIndexSort obj = new KeyIndexSort();
		//int a[] = {1, 2, 3, 2, 1, 2, 1 };
		char a[] = {'t','y','s','j'};
		obj.Keyindexcounting(a);
		
		for(int i = 0;i<a.length;i++){
			System.out.println(" " +a[i]);
		}
		
	}
}