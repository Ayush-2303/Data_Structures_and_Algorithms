public class Sensex {
    static void sen(int [] arr, int s){
        int left=0;
        int maxi=0;
        int indx =0;
        while (left< arr.length-1){
            if(arr[left] > arr[left+1]){
                if(arr[left] > maxi){
                maxi= arr[left];
                    indx = left;
                }
            }
            if(arr[left+1]> arr[left]){
                if (arr[left+1]>arr[left]){
                    if( arr[left+1]>maxi){
                        maxi = arr[left+1];
                        indx =left+1;
                    }
                }
            }
            left++;
            
        }
        System.out.println(indx);
    }
    public static void main(String[] args) {
        int [] arr = {1,15,25,45,42,21,17,12,11};
        int s = 9;
        sen( arr, s);
    }
    
}
