class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int x = 0;
        for(String operation : operations){

            switch(operation){
                case "--X": --x;
                break;
                case "X++": x++;
                break;
                case "++X": ++x;
                break;
                case "X--": x--;
                break;
                default: break;
            }

            System.out.println(x);

        }

        return x;
        
    }
}