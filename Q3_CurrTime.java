public class Q3_CurrTime {
    public static void main(String[] args)
    {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000;
        long currSeconds = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currHours= totalHours%24 + 8;       

        System.out.printf("Current time is %d:%d:%d GMT",currHours,currMinutes,currSeconds);
    }
}
