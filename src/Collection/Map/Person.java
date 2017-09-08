package Collection.Map;

/**
 * Created by admin on 2017/8/3.
 */
public class Person {

    public Person(int age, String name, double height){
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public int age;
    public String name;
    public double height;

    @Override
    public String toString() {
        return    "   age:  "+age
                + " name:  "+name
                + " height: "+height;
    }


    /**
     * 重写hashcode 与 equals  方法后，让它们数据相同就为同一个对象，这个时候，hashset只会存入一个值
     * @return
     */
    @Override
    public int hashCode() {
       int hashcode =  this.name.hashCode()*31;
        return hashcode;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        Person person = (Person) obj;
        if(this.age == person.age&& this.name.equals(person.name)&&this.height == person.height){
            return true;
        }else {
            return false;
        }
    }
}
