class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> studQ = new LinkedList<>(); 

        for(int s : students){
            studQ.add(s);
        }
        System.out.println(studQ);

        int index  = 0;
        int failure = 0;

        while(!studQ.isEmpty() && index < sandwiches.length && failure <  sandwiches.length) {
                 System.out.println("ssandwiches[index] : "+sandwiches[index]);

        // if sandwiches[index] == student  -> peek sand and leave queue

        if(sandwiches[index] == studQ.peek()){
            studQ.poll();
             System.out.println("same : "+studQ);
            index++;
            failure = 0;
        }

        // else remove student from first and add at last
        else {
                int stud=  studQ.poll();
                studQ.offer(stud);
                System.out.println("not same : "+studQ);
                failure++;
        }
        }
    
        return studQ.size();
          
    }
}