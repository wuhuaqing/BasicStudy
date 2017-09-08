package listdemo.stack;

/**
 * Created by admin on 2017/8/4.
 * 栈的实现方式（基于列表）
 *  后进先出
 */
public class Stack<T>{

    Node first;
    int N;

    //入栈操作
    public void push(String string){
        Node oldFirst = first;
        first = new Node();
        first.aa =  string;
        first.Next  =  oldFirst;
        N++;
    }

    //出栈操作
    public String pop(){
        String str  =  first.aa;
        first   = first.Next;
        N--;
        return str;
    }

    public int size(){
        return N;
    }

    public boolean isEmpty(){
        if(N<=0){
            return true;
        }else{
            return false;
        }
    }
}
