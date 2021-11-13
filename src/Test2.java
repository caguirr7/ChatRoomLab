import java.time.*;

public class Test2 {

    public static void main(String[] args){

       //MyBean test = new MyBean();

       MyBean.process();
       System.out.println(LocalDateTime.now());
       System.out.println(LocalDateTime.ofEpochSecond(1,1, ZoneOffset.ofHours(3)));
    }

}

class MyBean{
    private Clock clock; //dependency inject

   public static void process()
   {
       System.out.println(LocalDate.now());
   }
}
