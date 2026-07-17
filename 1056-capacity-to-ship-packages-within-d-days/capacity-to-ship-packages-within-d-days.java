class Solution {
    private int findDays(int[] weights,int cap){
        int load=0;
        int days=1;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+load > cap){
            days ++;
            load=weights[i];
        }
        else{
            load +=weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
    int low=0;
    int high=0;
    for(int weight:weights){
        low=Math.max(low,weight);
        high +=weight;
    }
    while(low<=high){
        int mid=(low+high)/2;
        int noOfDays=findDays(weights,mid);
        if(noOfDays<=days){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return low;
    }
}