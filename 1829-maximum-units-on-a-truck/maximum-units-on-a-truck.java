class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

       // sort array with decending order based sec element of each array
        Arrays.sort(boxTypes , (a,b) -> b[1] - a[1]);
       // iterate array - > first element numberOfBoxesi - >0 / numberOfUnitsPerBoxi - > 1 ;
        int boxLoaded = 0;
        int unit = 0;
       for(int[] boxType : boxTypes){

        int numberOfBoxes = boxType[0];
        int unitsPerBox =  boxType[1];

        int boxToTake = Math.min(numberOfBoxes , truckSize - boxLoaded);

        boxLoaded += boxToTake;

        unit +=  boxToTake * unitsPerBox;

        if(boxLoaded >= truckSize){
            break;
        }

       }

       return unit;
    }
}