package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ManagerDict {


    public static void main(String args[]){

        HashMap<String,String> dict = new HashMap<>();
        dict.put("A","C");
        dict.put("B","C");
        dict.put("C","F");
        dict.put("D","E");
        dict.put("E","F");
        dict.put("F","F");
        HashMap<String,ArrayList<String>> rdict = new HashMap<>();

        for (Map.Entry<String,String> element: dict.entrySet()) {
           String emp = element.getKey();
           String mngr = element.getValue();
           if(!emp.equals(mngr)){
               ArrayList<String> emplylist = rdict.get(mngr);
               if (emplylist==null){
                   emplylist = new ArrayList<>();
               }
               emplylist.add(emp);
               rdict.put(mngr,emplylist);
           }
           else{

           }



        }
        System.out.println(rdict);
    }


}
