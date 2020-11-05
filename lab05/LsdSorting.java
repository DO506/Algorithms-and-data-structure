public class LsdSorting{
	public void LsdIndexSorting(String[] a, int W){
		int N = a.length;
		int R = 256;
		
		String[] aux = new String[a.length];
		
		for (int d=W-1; d>=0; d--){
			int count[] = new int[R + 1];

			for (int i = 0; i < N; i++){
			count[a[i].charAt(d) + 1]++;
			}
			for (int r = 0; r < R; r++){
				count[r+1] += count[r];
			}
			for (int i = 0; i < N; i++){
				aux[count[a[i].charAt(d)]++] = a[i];
			}
			for (int i = 0; i < N; i++){
				a[i] = aux[i];
			}

		}
	}

	public static void main(String[] args){
		LsdSorting obj = new LsdSorting();
		String a[] = {"tenzin","yanzom","soonam","jatsho"};
		obj.LsdIndexSorting(a,6h);
		
		for(int i = 0;i<a.length;i++){
			System.out.println(" " +a[i]);
		}
		
	}
}