package frametool.proxy;

/**
 * Created by admin on 2018/3/27.
 */
public class UserA  implements  FunctionA{
    @Override
    public void setUser(String name, int age) {
        System.out.println("name: "+ name +"... age: "+age);
    }

    @Override
    public void setPfee(long money) {
        System.out.println("money: "+ money );
    }
}
