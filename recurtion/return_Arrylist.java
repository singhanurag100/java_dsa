import java.util.ArrayList;

public class return_Arrylist {
    public static void main(String[] args) {
        int [] arr = {23,4,3,53,3,6,4,7,9};
        System.out.println(fun(arr, 4,0, new ArrayList<>()));
        System.out.println(fun2(arr, 4, 0));
        
    }
    

    static ArrayList fun(int [] arr , int target , int index, ArrayList list ){
        if(index == arr.length-1){
            return list;
        }
        if (target ==arr[index]) {
            list.add(index);
        }
        return fun(arr , target , index+1 , list);
    }

    static ArrayList fun2(int [] arr , int target , int index ){

        ArrayList list = new ArrayList<>();

        if(index == arr.length-1){
            return list;
        }
        if (target ==arr[index]) {
            list.add(index);
        }
        ArrayList listbelow = fun2(arr , target , index+1);
        
         list.addAll(listbelow);

         return list;
    }

}
