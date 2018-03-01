/**
 * Created by admin on 2018/3/1.
 */
public class IfelseifTestDemo {


    public static  void main(String[] args){
/*

        int u = 8;
        if(u<9){
            System.out.println("hs:小于9" );
        }
        else if(u<10){
            System.out.println("hs:小于10" );
        }
        else  if(u==8){
            System.out.println("hs:等于8" );
        }
        else{
            System.out.println("hs:" );
        }
*/

        String plateId= "10" ,plateNo= "20",plateColor = "30";
        int hashcode  = 0;
        if ( plateId != null) {
            hashcode =  plateId.hashCode() * 31;
        }
        if ( plateNo != null) {
            hashcode = hashcode +  plateNo.hashCode() * 31;
        }

        if ( plateColor != null) {
            hashcode = hashcode +  plateColor.hashCode() * 31;
        }

        System.out.println(hashcode);
    }
}
