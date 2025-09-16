class Solution {
    public double average(int[] salary) {
        // min sal
        // max sal
        // total - min - max / no. of elements - 2

        Arrays.sort(salary);

        double total = 0;

        for(int n: salary){
            total +=n;
        }

        return (total - salary[0] - salary[salary.length - 1]) / (salary.length - 2);
        
    }
}