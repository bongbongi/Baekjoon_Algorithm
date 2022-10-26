class Solution {
    public int solution(int price) {
        int answer = 0;
        answer = ((price>=500000)?(100-20):(price>=300000)?(100-10):(price>=100000)?(100-5):100) ;
       
        return (price * answer)/100;
    }
}