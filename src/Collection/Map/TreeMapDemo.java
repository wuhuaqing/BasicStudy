package Collection.Map;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by admin on 2017/8/3.
 */
public class TreeMapDemo {

    public static void main(String [] args){

        /*TreeMap<String,Person> treeMap = new TreeMap<String, Person>();
        treeMap.keySet();
        Set<Map.Entry<String,Person>> entries = treeMap.entrySet();*/
        TreeMapDemo treeMapDemo = new TreeMapDemo();
        treeMapDemo.setDataForTreeMap();
    }

    public void setDataForTreeMap(){
        TreeMap<String,String> treeMap = new TreeMap<String, String>();
        for (int i = 0  ; i < 5;i++){
            treeMap.put("i"+i,"aa"+i);
        }
       for( String  keyset : treeMap.keySet()){
           System.out.println(" "+keyset+"  :　"+ treeMap.get(keyset));
       }

    }
}
