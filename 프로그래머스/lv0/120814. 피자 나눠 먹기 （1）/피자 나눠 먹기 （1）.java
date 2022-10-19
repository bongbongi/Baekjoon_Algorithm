class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt=0;
        
        answer = n/7;
        cnt = n%7>0?1:0;
        return answer+cnt;
    }
}