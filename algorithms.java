

class Algorithms {

	public static void main(String[] args) {
		int[] cards = {7, 3, 11, 9, 2, 9, 2};
		int[] sorted = sort(cards);
		String str = "";
		for (int j = 0; j < sorted.length; j ++) {
			str += sorted[j] + ", ";
			
		}

		System.out.println(str);
		System.out.println(present(sorted, 19));

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
			boolean present = false;
			for (int j = 0; j <= a.length; j ++) {
				if (a[j] == b) {
					return present = true;
				}
			}
			return present;
		}
	}
