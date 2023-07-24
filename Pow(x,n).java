class Solution {
    public double myPow(double x, int n) {
        return myPower(x,n);    
    }
    private double myPower(double x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        double result = myPower(x,n/2);
         result *= result;
         if(n % 2 != 0){
             return (n > 0) ? result * x : result / x;
         }
         else{
             return result;
         }
    }
}
