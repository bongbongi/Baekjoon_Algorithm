class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        if(a==b){
            sum=a;
        }else{
            int max=a>b?a:b;
            int min=a>b?b:a;
            
            for(int i=min;i<=max;i++){
                sum += i;
            }
        }
        return sum;
    }
}