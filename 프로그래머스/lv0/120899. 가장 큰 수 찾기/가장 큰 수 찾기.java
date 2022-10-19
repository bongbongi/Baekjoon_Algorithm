
	class Solution {
		public int[] solution(int[] array) {
			int[] answer = new int[2];
			int tmp = 0;
			for (int i = 0; i < array.length; i++) {
				if (tmp < array[i]) {
					tmp = array[i];
					answer[0] = tmp;
					answer[1] = i;

				}

			}
			return answer;
		}

	}