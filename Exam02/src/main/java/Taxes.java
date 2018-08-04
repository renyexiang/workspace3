import java.util.Scanner;

public class Taxes {
    public void test(){
        System.out.println("请输入工资：");
        double salary=0.0;
        Scanner sc=new Scanner(System.in);
        salary=sc.nextDouble();
        salary=salary-3500;
        if(salary<=0){
            System.out.println("所交税款为0元");
        }else if(salary<=1500){
            System.out.println("所交税款为"+salary*0.03+"元");
        }else if(salary>1500&&salary<=4500){
            System.out.println("所交税款为"+salary*0.1+"元");
        }

        else if(salary>4500&&salary<=9000){
            System.out.println("所交税款为"+salary*0.2+"元");
        }else if(salary>9000&&salary<=35000){
            System.out.println("所交税款为"+salary*0.25+"元");
        }else if(salary>35000&&salary<=55000){
            System.out.println("所交税款为"+salary*0.3+"元");
        }else if(salary>55000&&salary<=80000){
            System.out.println("所交税款为"+salary*0.35+"元");
        }else{
            System.out.println("所交税款为"+salary*0.4+"元");
        }
    }
    public static void main(String[] args) {
    Taxes t=new Taxes();

    while(true){
        t.test();
    }


    }
}
