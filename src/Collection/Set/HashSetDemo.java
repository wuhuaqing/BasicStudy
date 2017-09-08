package Collection.Set;

import java.util.*;

/**
 * Created by admin on 2017/8/3.
 */
public class HashSetDemo {

    public static void main(String [] args){

        HashSetDemo hashSetDemo = new HashSetDemo();
        //hashSetDemo.hashSetTestMethod();
        hashSetDemo. hashSetPutObj();

    }

    public void hashSetTestMethod(){
        //不具备排序功能
       // HashSet <String> hashSet = new HashSet<String>(new compator());
        HashSet <String> hashSet = new HashSet<String>();
        for (int i = 0 ;i<5;i++){
            hashSet.add("a"+i);
        }
        //System.out.println(hashSet);
        for(Iterator<String> iterator = hashSet.iterator(); iterator.hasNext();){
            System.out.println(iterator.next()+" ");
        }

    }
    class  compator  implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }
    public void hashSetPutObj(){
        HashSet <Person> hashSet = new HashSet<Person>();
       /* for (int i = 0 ;i<5;i++){
            Person person = new Person(i,"a"+i,i*1.1d);
            hashSet.add(person);
        }*/
        for (int i = 0 ;i<5;i++){
            Person person = new Person(5,"a"+5,5);//HashSet是不能存放相同对象，这种写法本身是不同的对象，会存入五个数据。这时，重写hashcode()和equals()方法，就只能存入一个了
            hashSet.add(person);
        }
        for(Iterator<Person> iterator = hashSet.iterator(); iterator.hasNext();){
            System.out.print(iterator.next()+" ");
        }

        HashMap<String ,String  >map = new HashMap<>();

    }
}
