package threadtest;
import java.util.concurrent.*;

/**
 *
 * Created by whq on 2017/12/13.
 * 线程池使用介绍：http://blog.csdn.net/u012702547/article/details/52259529
 * Thread
 * 与线程处理相关的类：
 * 任务接口：
 * Callable（run方法有返回值）  Runnable(run方法无返回值)
 *
 * Future  FutureTask   RunnableFuture
 *
 * ThreadPool Executor
 */
public class ThreadTestMain {

    public static void main(String[] args){

        testThreadPoolHasReturn();

    }

    public static void testThread(){
        //可对线程各种状态进行控制
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                return null;
            }



        });

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        /***
         * 线程常用也是普通的两种使用方式：
         */
        TestThread testThread = new TestThread();
        testThread.start();
        Thread thread = new Thread(runnable);
        thread.start();
    }

   static class  TestThread extends  Thread{
        @Override
        public void run() {
            super.run();
        }
    }

    /***
     * 线程有返回值
     */
    public static void testThreadPoolHasReturn(){
         ExecutorService executorService =   getFixedThreadPool();
        //线程池使用submit 执行一个任务时，有返回值，不过要接口callable的实现类来处理
        Callable callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1000);
                return Thread.currentThread().getName();
            }
        };
        //使用线程池执行器的submit来获取线程执行任务后的返回值
        Future future = executorService.submit(callable);
        try {
            System.out.println("线程执行任务后的返回值： "+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    /***
     * 几种常用线程池的使用方式，以及他们之间的不同的地方
     */
    public static void testThradPool(){
        // ExecutorService executorService =   getFixedThreadPool();
       // ExecutorService executorService =   getSignleThreadPool();
       // ExecutorService executorService =   getCacheThreadPool();
       ExecutorService executorService =   getScheduledThreadPooll();

       for (int i=0;i<30;i++) {
           final int index = i;
           Runnable runnable = new Runnable() {
               @Override
               public void run() {
                   try {
                       Thread.sleep(1000);
                       System.out.println("currentThread:---" + Thread.currentThread().getName() + " and index:--" + index);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           };
           executorService.execute(runnable);
       }
   }


    //----------------------------------------线程----------------------------------
    /**
     * 提高系统资源的利用效率，对CPU做操作
     */


    //----------------------------------------线程池--------------------------------
    /***
     * 线程池用来对线程管理的工具，能够有效执行各种不同应用场景下的异步任务，能够有效合理的利用系统资源，方便管理
     */
    /**
     * 获取FixedThreadPool
     * @return
     */
    public static  ExecutorService  getFixedThreadPool(){
     ExecutorService executorService =   Executors.newFixedThreadPool(5);
      return  executorService;
    }

    public static ExecutorService getCacheThreadPool(){
        ExecutorService executorService =   Executors.newCachedThreadPool();
        return  executorService;
    }

    public  static ExecutorService getSignleThreadPool(){
        ExecutorService executorService =   Executors.newSingleThreadExecutor();
        return  executorService;
    }

    public static ExecutorService getScheduledThreadPooll(){
        ExecutorService executorService =   Executors.newScheduledThreadPool(3);
        return  executorService;
    }
}
