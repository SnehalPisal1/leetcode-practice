class Solution {
    public String destCity(List<List<String>> paths) {

    
        Set<String> startCities = new LinkedHashSet<>();
        Set<String> endCities = new LinkedHashSet<>();

        for(List<String> listCities : paths){

            startCities.add(listCities.get(0));
            endCities.add(listCities.get(1));
        }

        //   dest city is present in endCities. -> it should not be present in the startCities Set

        for(String city : endCities){

            if(!startCities.contains(city)){
                return city;
            }
        }
       return null; 
    }
}