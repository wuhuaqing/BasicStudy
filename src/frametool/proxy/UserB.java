package frametool.proxy;

/**
 * Created by admin on 2018/3/27.
 */
public class UserB implements FunctionB {
    @Override
    public void setTime(long time) {

    }

    @Override
    public void setStatus(boolean hid) {
       if (hid){
           System.out.println("情况为true");
       }else{
           System.out.println("情况为false");
       }
    }
}
