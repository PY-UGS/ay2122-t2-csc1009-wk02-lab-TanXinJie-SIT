public class EpochTime
{
    public static void main(String[] args)
    {
        System.out.println(System.currentTimeMillis());
        long totalSecond =  System.currentTimeMillis() / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinute = totalSecond / 60;
        long currentMinute = totalMinute % 60;
        long totalHours = totalMinute / 60;
        long currentHour = totalHours % 24;
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
