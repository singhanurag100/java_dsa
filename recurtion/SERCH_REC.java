import java.util.ArrayList;

public class SERCH_REC {
    public static void main(String[] args) {
    int [] arr ={1,2,3,4,56,56,56,7,5};
   System.out.println(search(arr,56,0));
   System.out.println(serch_check(arr, 56, 0));
   System.out.println(search_last(arr, 56, arr.length-1));
   findall(arr, 56, 0);
   System.out.println(listy);
    
    }

    static int search(int [] arr, int target , int index){
        if (index == arr.length -1 && arr[index] != target) {
            return -1;
        }
        else if (arr[index] == target) {
            return index;
        }
        else{
            return search(arr, 56, index+1);
        }
    }
    static boolean serch_check(int [] arr , int target , int index){
        if (index == arr.length) {
            return false;
        }
        return (arr[index]==target) || serch_check(arr, 56, index+1);
    }
    static int search_last(int [] arr , int target , int index){
        if (index == -1) {
            return -1;
        }
        else if(arr[index]==target){
            return index;
        }
        else{
           return search_last(arr, 56, index-1);
        }
    }
    static ArrayList listy = new ArrayList<>();
    static void findall(int [] arr, int target , int index){
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            listy.add(index);
        }
        
            findall(arr, 56, index+1);
        
    }
}
