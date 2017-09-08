package javaDemoTest.equal;

/**
 * Created by admin on 2017/7/19.
 */
public class ClassEqualsDemo {

    public static void main(String[] args){

        System.out.println("main function");

        EqualObjClass equalObjClass = new EqualObjClass();
        equalObjClass.age =  12;
        equalObjClass.name = "whq";
        equalObjClass.height=  177;

        EqualObjClass equalObjClass1 = new EqualObjClass();
        equalObjClass1.age =  12;
        equalObjClass1.name = "whq";
        equalObjClass1.height=  177;

        System.out.println(equalObjClass.equals(equalObjClass1));
    }
}
