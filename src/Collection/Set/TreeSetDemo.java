package Collection.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by admin on 2017/8/3.
 */
public class TreeSetDemo {

    public static void main(String [] args){
        TreeSetDemo treeSetDemo = new TreeSetDemo();
        treeSetDemo.hashSetTestMethod();

    }
    public void hashSetTestMethod(){
        //默认排序
        TreeSet<String> treeSet = new TreeSet<String>();
        for (int i = 0 ;i<5;i++){
            treeSet.add("a"+i);
        }
        for(Iterator<String> iterator = treeSet.iterator(); iterator.hasNext();){
            System.out.println(iterator.next()+" ");
        }
        System.out.println( "-------------------------------------------");
         //做一个倒序比较器
        TreeSet<String> treeSet2 = new TreeSet<String>(new compator());
        for (int i = 0 ;i<5;i++){
            treeSet2.add("a"+i);
        }
        //不会放重复的元素
        treeSet2.add("a4");
        for(Iterator<String> iterator = treeSet2.iterator(); iterator.hasNext();){
            System.out.println(iterator.next()+" ");
        }
    }

    class  compator  implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }
}
