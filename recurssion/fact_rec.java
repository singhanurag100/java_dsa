public class fact_rec {
    public static void main(String[] args) {
        fun(5);
        System.out.println(fun(5));
    }

    static int fun(int n){
        
        if (n==0) {
            return 1;
        }
        else{
            return n*fun(n-1);
        }
    }
}
