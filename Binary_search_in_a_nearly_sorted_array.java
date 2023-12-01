public class Binary_search_in_a_nearly_sorted_array {
    public static void main(String[] args) {
        int[] arr = {10,3,40,20,50,80,70};
        int n = 50;
        int s = 0;
        int e = arr.length-1;
        int mid = s+(e-s)/2;
        while(s<=e){
            if(arr[mid]==n){
                System.out.println(mid);
                return;
            }else if(mid>=s && arr[mid-1]==n){
                System.out.println(mid-1);
                return;
            }else if(mid<=e &&  arr[mid+1]==n){
                System.out.println(mid+1);
                return;
            } else if (n>arr[mid]) {
                s=mid+2;
            }else{
                e=mid-2;
            }
            mid= s+e/2;
        }
        System.out.println(-1);
    }
}
