public class basic{
    static void trend(int a, int [] arr ,String[] arr2){
        int left=0;
        int temp=0;
        String stat;
        while(left < arr.length-1){
            if (arr[left] > arr[left+1]){
                temp = arr[left] ;
                arr[left]= arr[left+1];
                arr[left+1] = temp;
                stat = arr2 [left] ;
                arr2[left] = arr2[left+1];
                arr2[left+1]= stat;
                
            }
            left++;
            
        }
        // for( int s=0; s<arr.length;s++){
        //             System.out.println(arr[s]);
        //         }
        String seq = arr2[0];
        for (int val = 0; val <arr2.length; val++){
            if (!arr2[val].equals(seq)){
                System.out.println(arr[val]);
                System.out.println(seq);
                break;
            }
        }

    }
    public static void main(String[] args) {
        int a=5;
        int [] arr={2004,1999,2019,2009,2014};
        String [] arr2 ={"JDU","JDU","CON","JDU","CON"};
        trend(a,arr,arr2);

    }
}