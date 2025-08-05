class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int result[] = new int[nums.length];

        //? array is null - > null?

        // 0 even n%2 == 0
        // 1 odd n%2 != 0      
        Queue<Integer> even = new LinkedList();
        Queue<Integer> odd = new LinkedList();

        for(int n : nums){  // [4,2,5,7]
            if(n % 2 == 0){
                even.add(n); // 4, 2
            } else {
                odd.add(n); // 5 ,7 
            }
        }
        System.out.println("Even List: "+even);
        System.out.println("odd List: "+odd);

        // fill even values in array

        for(int i = 0 ; i<nums.length;i +=2){
                result[i] = even.poll();
        }

        //  fill odd values in array
        for(int i = 1 ; i<nums.length;i +=2){
                result[i] = odd.poll();
        }

        return result;
    }
}