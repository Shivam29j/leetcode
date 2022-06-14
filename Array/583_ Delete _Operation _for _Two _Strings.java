class Solution {
    public int minDistance(String word1, String word2) {
           int m=word1.length();
        int n=word2.length();
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=i;
        }
        for(int i=1;i<=m;i++){
            int[] curr=new int[n+1];
            curr[0]=i;
            for(int j=1;j<=n;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    curr[j]=arr[j-1];
                    System.out.println("Current[j]: "+curr[j]);
                }
                else{
                    int a=arr[j];
                    int b=curr[j-1];
                    System.out.println("A: "+a+" B: "+b);
                    curr[j]=Math.min(a,b)+1;
                    System.out.println("Curr[j]: "+curr[j]);
                }
            }
            arr=curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        return arr[n]; 
    }
}