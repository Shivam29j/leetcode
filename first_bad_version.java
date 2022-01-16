 public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
          int first=1,last=n,ans=-1;
            while(first<=last)
            {
                int mid=first+(last-first)/2;
                if(isBadVersion(mid))
                   {
                       ans=mid;
                       last=mid-1;
                   }
                   else
                   {
                       first=mid+1;
                   }
            }
            return ans;
        }
    } 