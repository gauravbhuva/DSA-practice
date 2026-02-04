import java.lang.Math;
class Solution {
    public boolean isPowerOfTwo(int n) {
        int power[] = new int[31];
        for(int i=0;i<31;i++){
            power[i] = (int)Math.pow(2,i);
            if(n== power[i]){
                return true;
            }
        }
        return false;
    }
}
