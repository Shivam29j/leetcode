class Solution {
    public int[] sumZero(int n) {
        int[] arr= new int [n];
if(n==1){
return new int[]{0};
}
int j=0;

    if(n%2==0) {

        for (int i = 0; i < n; i++) {

            arr[0 + i] = (-n / 2) + j;
            if (arr[0 + i] == 0) {
                j++;
                arr[0 + i] = (-n / 2) + j;


            }
            j++;
        }
        return arr;
    }


    for(int i=0;i<n;i++){
        arr[0+i]=(-n/2)+i;
    }

    return arr;
    }
}