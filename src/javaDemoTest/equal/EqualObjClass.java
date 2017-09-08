package javaDemoTest.equal;

/**
 * Created by admin on 2017/7/19.
 */
public class EqualObjClass {

    public String name;
    public int age;
    public double height;

    @Override
    public boolean equals(Object obj) {
        EqualObjClass equalObjClass = (EqualObjClass) obj;
        boolean isTrue =  true;
        if(equalObjClass.name.equals(this.name)&&equalObjClass.age==this.age&&equalObjClass.height==this.height){
            isTrue= isTrue;
        }else{
            isTrue =false;
        }

        return isTrue;
    }

    @Override
    public int hashCode() {

        return super.hashCode();
    }
}
