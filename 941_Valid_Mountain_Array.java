class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean peak=false;
        for(int i=0;i<arr.length-1;i++){
            if(peak){
               if(! (arr[i]>arr[i+1])){
                return false;
               }
            }else{
                if(arr[i]>arr[i+1] && i>0){
                    peak=true;
                    continue;
                }
                if(!(arr[i]<arr[i+1])){
                    return false;
                }
            }
        }
        if(peak){
            return true;
        }else{
            return false;
        }
    }
}
