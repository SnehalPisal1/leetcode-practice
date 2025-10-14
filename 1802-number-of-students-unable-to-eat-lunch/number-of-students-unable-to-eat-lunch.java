class Solution {
    public int countStudents(int[] students, int[] sandwiches) {


        Queue<Integer> que = new LinkedList<>();

        for(int student : students){
            que.offer(student);
        }

        System.out.println(que);
        int i = 0;
        int failure = 0;
        while(!que.isEmpty() && i <= sandwiches.length && failure <= sandwiches.length ){

        // if match found -> student take sandwich and leave the queue
                System.out.println(que.peek() +" : "+sandwiches[i]);

        if(que.peek() == sandwiches[i]){
                que.poll();
                i++;
                System.out.println("match : "+que);
                failure = 0;
        }
        // else -> levae the que and go to the end of the que
        else {
           int stud = que.poll();
           que.offer(stud);
             System.out.println("NOT : "+que);
             failure++;
        }

        }
       
        return que.size();

          
    }
}