

/**
 * Created by admin on 2017/12/1.
 */
public class ExtendClassTest {

    public static void main(String[] args){

      /*  PerSon perSon = new Man();
        perSon.setAge(33);*/
        // man = (Man) perSonQ;

        PerSon perSonQ = new PerSon();
        perSonQ.setName("aa");

        Man man = new Man();
        man.setAge(3);

      //  man.getMan();
    }
}

  class  PerSon{

      static String name;
      public static void setName(String name){
             System.out.println(name);
      }
      public void setAge(int age){
           System.out.println(this.getClass().getSimpleName()+"...."+age);
      }
   }

   class  Man extends PerSon{

    /*
     子类不能重载父类静态方法
     @Override
       public static void setName(String name){
           super.setAge(name);
           System.out.println(name);
       }*/

       @Override
       public void setAge(int age) {
           super.setAge(age);
           System.out.println(age);
       }
       public void getMan(){
           System.out.println(getClass().getSimpleName());
       }
   }