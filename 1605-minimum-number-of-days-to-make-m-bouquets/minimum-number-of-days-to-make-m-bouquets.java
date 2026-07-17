class Solution{
    public boolean isPossible(int[]bloomday,int day, int m ,int k){
        int count=0;
        int bouquets=0;
        for(int bloom:bloomday){
            if(bloom<=day){
                count ++;
                if(count==k){
                    bouquets++;
                    count=0;
                }
            }
                else{
                    count=0;
                }
            }
            return bouquets >=m;
        }
        public int minDays(int[]bloomday, int m ,int k){
            long required=(long)m*k;
            if(required>bloomday.length){
                return -1;
            }
            int minday= Integer.MAX_VALUE;
            int maxday= Integer.MIN_VALUE;
            for(int bloom:bloomday){
                minday= Math.min(minday,bloom);
                maxday=Math.max(maxday,bloom);
            }
            int low=minday;
            int high=maxday;
            int result=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(isPossible(bloomday,mid,m,k)){
                    result=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return result;
        }
    }

