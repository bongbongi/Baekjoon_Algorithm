class Solution {
   public int[] solution(int money) {
	        int[] answer = new int[2];
	        int Ame=5500;
	        answer[0]=money/Ame;
	        answer[1]=money-(answer[0]*Ame);
	        return answer;
	    }

}

