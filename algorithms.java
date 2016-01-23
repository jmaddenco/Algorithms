class Algorithms {

	public static void main(String[] args) {
		int[] cards = {7, 3, 11, 9, 2, 9, 2, 1};
		int[] sorted = sort(cards);
		String str = "";
		for (int j = 0; j < sorted.length; j ++) {
			str += sorted[j] + ", ";
			
		}

		System.out.println(str);
		System.out.println(present(sorted, 11));

	}

	public static int max(int[] a) {
		
		int max = 0;

		for (int j=0; j < a.length; j ++) {
			if (a[j] > max) {
				max = a[j];
			}
		}
		return max;
	}

	public static int[] sort(int[] a) {
		
		int[] sorted = a;
		int temp = 0;

		for (int j = 0; j < sorted.length; j ++) {
			for (int l = j + 1; l < sorted.length; l ++) {
				if (sorted[l] > sorted[j]) {
					temp = sorted[j];
					sorted[j] = sorted[l];
					sorted[l] = temp;
				}
			}

			}
		return sorted;
		}

		public static boolean present(int[] a, int b) {
			int[] newA = a;
			int mid = newA.length/2;
			int upper = 0;
			int lower = newA.length/2;

			for (int j = 0; j < newA.length; j ++) {
				if (b > newA[lower]) {
					System.out.println("Higher");
					upper = newA.length/2 + 1;
					lower = mid;
				} else if (b < newA[lower]) {
					System.out.println("Lower");
					upper = mid;
					lower = newA.length/2 - 1;
				} else if (newA[j] == b) {
					return true;
				} else {
					return false;
				}
			}
			return false;
		}
	}