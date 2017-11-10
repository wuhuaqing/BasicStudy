/**
 * Created by admin on 2017/10/16.
 */
public class MainTest {
    public int value = 1;

    public static void main(String[] args){
        final  MainTest mainTest = new MainTest(); 
          new Thread(new Runnable() {
             @Override
             public void run() {
                 try {
                     mainTest.a();
                 } catch ( Exception e) {//InterruptedException
                     e.printStackTrace();
                 }
             }
         }).start();

         new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    mainTest.a();
                    System.out.println();
                   // Thread.sleep(3000);
                } catch ( Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    public  void a(){
        System.out.println("...method a init...."+System.currentTimeMillis());
    }

    public void b(){
        System.out.println("method a init....");
    }

}
