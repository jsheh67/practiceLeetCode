package NovWeekOne;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c =0;
        int i=0;
        switch(ruleKey){
            case "color":
                i=1;
                break;
            case "name":
                i=2;
                break;
        }

        for(List<String> item: items){
            if(item.get(i).equals(ruleValue)){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        List<String> list1= new ArrayList<>();
        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");

        List<String> list2= new ArrayList<>();
        list2.add("computer");
        list2.add("silver");
        list2.add("lenovo");

        List<String> list3= new ArrayList<>();
        list3.add("phone");
        list3.add("silver");
        list3.add("iphone");

        List<List<String>> outerList = new ArrayList<>();
        outerList.add(list1);
        outerList.add(list2);
        outerList.add(list3);

        System.out.println(outerList.toString());

       System.out.println(countMatches(outerList,"color", "silver" ));
    }
}
