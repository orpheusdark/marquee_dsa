public class distance {
	public static int Distance(int[] arr) {
		
		int n = arr.length;
		int first = 0;
		while (first < n && arr[first] % 2 != 0) {
			first++;
		}
		if (first == n) return 0; 
		int last = n - 1;
		while (last > first && arr[last] % 2 != 0) {
			last--;
		}
		return last - first; // 0 if same index
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 6, 5, 8, 7};

		System.out.println(Distance(arr));
	}
}



// find first even from left -> find last even from right -> return distance
// 2 pointer aapproach
