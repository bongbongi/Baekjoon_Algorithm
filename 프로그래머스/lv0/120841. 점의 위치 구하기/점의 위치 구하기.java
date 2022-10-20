
class Solution {
	public int solution(int[] dot) {
		int cnt = 0;
		int result = 0;
		for (int i = 0; i < dot.length; i++) {
			if (dot[i] > 0) {
				cnt++;
			}
			switch (cnt) {
			case 0:
				result = 3;
				break;
			case 2:
				result = 1;
				break;
			case 1:
				if (dot[0] < 0) {
					result = 2;
				} else {
					result = 4;
				}
				break;
			}
		}
		return result;
	}
}