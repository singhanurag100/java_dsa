public class code1 {
    public static void main(String[] args) {
        
        fun(5);
        fun2(5);

    }
    static void fun( int n ){
        if (n==0) {
            return;
        }
        else{
            fun(n-1);
            System.out.println(n);
        }
    }

    static void fun2( int n ){
        if (n==0) {
                return;
        }
        else{
                
            System.out.println(n);
            fun2(n-1);
            }
        }
        
    
}
