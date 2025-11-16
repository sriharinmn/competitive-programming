public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        string binary = Integer.toBinaryString(a);

        int left =0, right = 0 , maxlen = 0 , zerocount = 0;

        while(right<binary.length()){
            if(binary.charAt(right)=='0') zerocount++; //detected zero

            while(zerocount > 1){
                if(binary.charAt(left)=='0') zerocount--;   //shrink window
                left++;
            }

            maxlen = Math.max(maxlen , right- left + 1);
            right++;

        }

        SYstem.out.println(maxlen);


    }
}