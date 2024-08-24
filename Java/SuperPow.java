import java.math.BigInteger;

class Solution {
    public int superPow(int a, int[] b) {
        String s = "";
        for(int i=0;i<b.length;i++){
            s += b[i];
        }
        BigInteger power = new BigInteger(s);
        BigInteger base = BigInteger.valueOf(a);
        return base.modPow(power,BigInteger.valueOf(1337)).intValue();
    }
}
