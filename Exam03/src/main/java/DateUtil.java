import java.util.Scanner;

public class DateUtil {

 public boolean test(int year){
     if(year%4==0 && year%100!=0){
         return true;
     }else
     if(year%400==0){
         return true;
     }else
         return false;
 }
    public static void main(String[] args) {
     DateUtil d=new DateUtil();
        int [] months={31,28,31,30,31,30,31,31,30,31,30,31};
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入日期：");
            String date = sc.next();
            String[] dates = date.split("-");
            int year = Integer.parseInt(dates[0]);
            int month = Integer.parseInt(dates[1]);
            int dd = Integer.parseInt(dates[2]);
            for (int i = 0; i < months.length; i++) {
                if (month == i + 1) {

                    if (month == 2) {
                        if (!d.test(year)) {
                            if (dd > 28) {
                                System.out.println("输入日期格式不对");
                            } else if (dd == 28) {
                                System.out.println(year + "-" + "03" + "-01");
                            } else {
                                System.out.println(year + "-" + "02" + "-" + (dd + 1));
                            }

                        } else if (d.test(year)) {
                            if (dd > 29) {
                                System.out.println("输入日期格式不对");
                            } else if (dd == 29) {
                                System.out.println(year + "-" + "03" + "-01");
                            } else {
                                System.out.println(year + "-" + "02" + "-" + (dd + 1));
                            }
                        }
                    } else if (month == 12) {
                        if (dd > months[i]) {
                            System.out.println("输入日期格式不对");
                        } else if (dd == months[i]) {
                            System.out.println((year + 1) + "-" + "01" + "-" + "01");
                        } else {
                            System.out.println(year + "-" + (month) + "-" + (dd + 1));
                        }
                    } else {
                        if (dd > months[i]) {
                            System.out.println("输入日期格式不对");
                        } else if (dd == months[i]) {
                            System.out.println(year + "-" + (month + 1) + "-" + (dd + 1));
                        } else {
                            System.out.println(year + "-" + (month) + "-" + (dd + 1));
                        }
                    }
                }

            }
        }
    }
}
