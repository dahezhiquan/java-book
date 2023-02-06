package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * java 日期类
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        // Date
        // 获取当前系统时间
        Date date = new Date();
        // 默认输出日期格式为国外格式
        System.out.println(date);
        // 日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String formatDate = sdf.format(date);
        System.out.println(formatDate);
        // 通过毫秒数转换时间
        Date date1 = new Date(92345678);
        System.out.println(sdf.format(date1));
        // 字符串转化为date
        String stringDate = "2022年07月19日 11:23:25";
        Date date2 = sdf.parse(stringDate);
        System.out.println(sdf.format(date2));

        // Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        // 月份从0开始
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR));
        // 24小时制
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));

        // 第三代日期
        // 获取当前时间
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getYear());
        // 获取月份的英文表示
        System.out.println(ldt.getMonth());
        // 获取月份的数字表示
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());
        // 只获取年月日
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        // 只获取时分秒
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        // 第三代日期的格式化
        DateTimeFormatter bestDateFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String formatter = bestDateFormatter.format(ldt);
        System.out.println(formatter);

        // 时间戳
        // 获取当前时间戳
        Instant now = Instant.now();
        System.out.println(now);
        // 时间戳 --> Date
        Date date3 = Date.from(now);
        System.out.println(date3);
        // Date --> 时间戳
        Instant instant = date3.toInstant();
        System.out.println(instant);

        // 日期运算
        // 521天后的日期
        LocalDateTime localDateTime = ldt.plusDays(521);
        System.out.println(bestDateFormatter.format(localDateTime));
        // 3456分钟前的时间
        LocalDateTime localDateTime1 = ldt.minusMinutes(3456);
        System.out.println(bestDateFormatter.format(localDateTime1));
    }
}
