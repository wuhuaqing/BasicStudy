package frametool.proxy;

/**
 * Created by admin on 2018/3/27.
 */
public class MainTest {

    public static void  main(String []  args){
        ProxyTestDemo proxyTestDemo = new ProxyTestDemo();

        UserA userA = new UserA();

        //普通的使用方法
//        FunctionA  functionA1 = (FunctionA)  userA ;
//        functionA1.setPfee(1000);

        FunctionA  functionA = (FunctionA) proxyTestDemo.bind(userA);
        functionA.setPfee(999);

         UserB userB = new UserB();
//        userB.setStatus(true);

        FunctionB  functionB = (FunctionB)  proxyTestDemo.bind(userB);
        functionB.setStatus(false);
    }
}
