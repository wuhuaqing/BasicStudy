package frametool;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by admin on 2018/4/10.
 */
public class TimeTestDemo {

    public  void toolUse(){
        Calendar calendar = Calendar.getInstance();
        String dateTime =  "2018-12-15 10:20:31";
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        try {
            Date date = simpleDateFormat.parse(dateTime);
            calendar.setTime(date);
            int dayofmonth = calendar.get(Calendar.DAY_OF_MONTH);
            int monthinit = calendar.get(Calendar.MONTH);
            calendar.add(Calendar.MONTH, 1);
            int month = calendar.get(Calendar.MONTH);
            int year = calendar.get(Calendar.YEAR);
            System.out.println(" day: " + dayofmonth);
            System.out.println(" monthinit: " + monthinit);
            System.out.println(" month: " + month);
            System.out.println(" year: " + year);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        TimeTestDemo timeTestDemo = new TimeTestDemo();
        try {
            timeTestDemo.timeUtilTool("2017-02-12 14:33:20","2018-06-22 14:33:20");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void timeUtilTool(String endDate ,String startDate) throws ParseException {
      /**
       *  当日完成停车：显示时分；10:00
          跨日完成停车：显示月日时分；8月1日10:00
          款年完成停车：显示年月日时分;2018年8月1日10:00
        */

        Calendar calendarend = Calendar.getInstance();
        Calendar calendarstart = Calendar.getInstance();
        //标准时间格式
        String pattern =  "yyyy-MM-dd HH:mm:ss";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        Date enddate  = simpleDateFormat.parse(endDate);
        Date StartDate  = simpleDateFormat.parse(startDate);


        calendarend.setTime(enddate);
        calendarstart.setTime(StartDate);

        System.out.println(" endYear: "+calendarend.get(Calendar.YEAR));
        System.out.println(" endMonth: "+calendarend.get(Calendar.MONTH));
        System.out.println(" endDay: "+calendarend.get(Calendar.DAY_OF_MONTH));

        System.out.println(" startYear: "+calendarstart.get(Calendar.YEAR));
        System.out.println(" startMonth: "+calendarstart.get(Calendar.MONTH));
        System.out.println(" startDay: "+calendarstart.get(Calendar.DAY_OF_MONTH));

    }
}
