/**
 * Created by admin on 2017/12/1.
 */
public class EnumTest {

    public enum  ConstValue{

        RED(1),YELLOW(2),GREEN(3);
        private int ava ;
        private ConstValue(int ava){
          this.ava = ava;
        }
        public int getAva(){
            return this.ava;
        }
    }

    public static void main(String[] args){
         for ( ConstValue value : ConstValue.values()){
             getSomeValue(value);
         }

    }

    public static void getSomeValue(ConstValue constValue){
        switch (constValue){
            case RED:
                 System.out.println("value: "+constValue+"---- value int :"+constValue.getAva());
                break;
            case GREEN:
                System.out.println("value: "+constValue+"---- value int :"+constValue.getAva());
                break;
            case YELLOW:
                System.out.println("value: "+constValue+"---- value int :"+constValue.getAva());
                break;

        }
    }
}
