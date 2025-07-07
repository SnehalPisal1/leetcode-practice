class Solution {
    public int calPoints(String[] operations) {

        int result = 0 ;
        List<Integer> list = new ArrayList<>();

        for(String n : operations){
                        System.out.println(n);

            if( n.equals("+")){
                result = list.get(list.size()-1) + list.get(list.size() - 2);
                list.add(result);
            }

           else if(n.equals("D")){
               result =  list.get(list.size()-1) * 2;
               list.add(result);
            }

           else if(n.equals("C")){
                System.out.println(list.size());

                list.remove(list.size()-1);
            }
            else{
                int no= Integer.parseInt(n);
                list.add(no);
            }
            System.out.println(list);
        }

        int res=0;
        for(int n: list){
            res += n;
        }
        return res;
    }
}