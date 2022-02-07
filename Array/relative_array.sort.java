class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
      int max = 0;
        for(int num: arr1){
           max = Math.max(num, max); 
        }
        int[] farr= new int[max+1];
        for(int num: arr1){
            farr[num]++;
        }
        int i = 0, j=0;
        while(j<arr2.length){
            if(farr[arr2[j]] > 0){
                arr1[i] = arr2[j];
                i++;
                farr[arr2[j]]--;
            }else{
                j++;
            }
        }
        int k = 0;
        while(k<farr.length){
          if(farr[k] > 0){
              arr1[i] = k;
              i++;
              farr[k]--;
          }else{
              k++;
          }  
        }
        return arr1;
    }
} 
    
