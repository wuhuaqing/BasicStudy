package listdemo.stack;

import java.util.Iterator;

/**
 * Created by admin on 2017/8/1.
 */
public class StackDemo {

    public  static  void main(String []  args){
      //  stackTest();
        systemStackTest();
    }

    public static void systemStackTest(){
        java.util.Stack<String> stack = new java.util.Stack();
        for (int i = 0;i<3;i++){
            stack.push("aa"+i);
        }
       Iterator iterator =  stack.iterator();

        while (iterator.hasNext()){
           String string  = (String) iterator.next();
           System.out.println("stack: "+ string);
        }
        System.out.println("-----------------------------");
        while (true){
            if(!stack.isEmpty()){
                System.out.println("stack "+stack.pop());
            }else{
                break;
            }
        }

    }
    public static void stackTest(){
        Stack<String> stringStack = new Stack<String>();
        for (int i = 0;i<3;i++){
            stringStack.push("aa"+i);
        }

        /**
         * 这种做法不安全，遍历的时候在做出栈操作
         */
       /* for(int i  = 0; i<stringStack.size();i++){
              System.out.println("stack "+i+" : "+ stringStack.pop());
        }*/

        //这种方式可以遍历完
        while (true){
            if(!stringStack.isEmpty()){
                System.out.println("stack "+stringStack.pop());
            }else{
                break;
            }
        }
    }

}

