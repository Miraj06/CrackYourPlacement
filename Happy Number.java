class Solution {
    public boolean isHappy(int n) {
        int s=0;
        while(n>0){
            int a=n%10;
            s+=a*a;
            n=n/10;
        }
        if(s==1){
            return true;
        }
        else if(s==4) {
            return false;
        }
        return isHappy(s);
    }
}
