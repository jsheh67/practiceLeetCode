package DecWeek1;

import java.util.ArrayList;
import java.util.List;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        List<String> allCities = new ArrayList<>();
        for(List<String> p: paths){
            allCities.add(p.get(0));
        }
        for(List<String> p: paths){
            allCities.add(p.get(1));
        }

        List<String> startandEnd = new ArrayList<>();

        for(String city: allCities){
            int count=0;
            for(String cit: allCities){
                if(cit.equals(city)){
                    count++;
                }
            }
            if(count==1){
                startandEnd.add(city);
            }
        }
        return startandEnd.get(1);

    }

}
