package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {
    private Map<String, Boolean> flightMap;

    public SearchFlight() {
        flightMap = flightBase();
    }

    public Map<String, Boolean> flightBase(){
        Map<String, Boolean> flightBase = new HashMap<>();
        flightBase.put("Berlin", true);
        flightBase.put("Wroclaw", true);
        flightBase.put("London", true);
        flightBase.put("Warsaw", true);

        return flightBase;
    }

    public boolean searchFlight(String airport) throws RouteNotFoundException{
        if(flightMap.containsKey(airport)) {
            return flightMap.get(airport);
        }else {
            throw new RouteNotFoundException("Airport is not founded!");
        }
    }
}
