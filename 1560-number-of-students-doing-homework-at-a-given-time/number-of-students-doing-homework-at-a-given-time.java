class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int count = 0;
        // startTime <= queryTime <= endTime

        for(int i = 0 ; i< endTime.length;i++){
            if(startTime[i] <= queryTime && queryTime <= endTime[i]){
                count++;
            }
        }

        // return number of students
        return count;
    }
}