public class Main{
    public static void main(String[] args){
        String input = "1011001";

        int left = 0 , right = 0 , maxlen = 0 , zerocount = 0;

        while(right<input.length()){
            if(input.charAt(right)=='0') zerocount++;

            while(zerocount > 1 ){
                if(input.charAt(left)=='0') zerocount--;
                left++;
            }

            maxlen = Math.max(maxlen , right - left + 1);
            right++;
        }
    }
}