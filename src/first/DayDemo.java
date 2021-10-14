package first;

interface Day
{
    String MON = "월요일", TUE = "화요일", WED = "수요일", THU = "목요일", FRI = "금요일", SAT = "토요일", SUN = "일요일";
}


public class DayDemo {
    public static void main(String[] args) {
        System.out.println(Day.MON);
    }
}
