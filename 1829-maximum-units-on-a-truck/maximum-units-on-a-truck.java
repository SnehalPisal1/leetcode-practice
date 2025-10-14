class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes , (a,b) -> b[1] - a[1]);
        int maxUnit = 0;
        int boxesLoaded = 0;

        for(int[] boxType : boxTypes){

            int numberOfBoxes = boxType[0];
            int unitsPerBox = boxType[1];

            System.out.println(numberOfBoxes+ " : " + unitsPerBox);


         int boxesTake = Math.min(numberOfBoxes, truckSize - boxesLoaded); 
            System.out.println( "boxesTake : " + boxesTake);

          maxUnit += boxesTake * unitsPerBox;
            System.out.println( "maxUnit : " + maxUnit);
            boxesLoaded += boxesTake;
            if(boxesLoaded >= truckSize){
                break;
            }

        }

        return maxUnit;
    }
}