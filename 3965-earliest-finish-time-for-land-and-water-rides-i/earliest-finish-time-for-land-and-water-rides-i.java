class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++) {
            for(int j=0;j<waterStartTime.length;j++) {
                int landFinish=landStartTime[i]+landDuration[i];
                int waterStart=Math.max(landFinish,waterStartTime[j]);
                int finish=waterStart+waterDuration[j];
                ans=Math.min(ans,finish);
                int waterFinish=waterStartTime[j]+waterDuration[j];
                int landStart=Math.max(waterFinish,landStartTime[i]);
                finish=landStart+landDuration[i];

                ans=Math.min(ans,finish);
            }
        }

        return ans;

    }
}