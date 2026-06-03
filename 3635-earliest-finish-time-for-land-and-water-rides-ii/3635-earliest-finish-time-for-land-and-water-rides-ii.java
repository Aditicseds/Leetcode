class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
            int minLandEnd = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            minLandEnd = Math.min(minLandEnd, landStartTime[i] + landDuration[i]);
        }
        
        int option1 = Integer.MAX_VALUE;
        for (int j = 0; j < waterStartTime.length; j++) {
            int total = Math.max(waterStartTime[j], minLandEnd) + waterDuration[j];
            option1 = Math.min(option1, total);
        }
        int minWaterEnd = Integer.MAX_VALUE;
        for (int j = 0; j < waterStartTime.length; j++) {
            minWaterEnd = Math.min(minWaterEnd, waterStartTime[j] + waterDuration[j]);
        }
        
        int option2 = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            int total = Math.max(landStartTime[i], minWaterEnd) + landDuration[i];
            option2 = Math.min(option2, total);
        }

        return Math.min(option1, option2); 
    }
}