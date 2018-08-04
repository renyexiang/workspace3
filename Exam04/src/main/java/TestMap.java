import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Random rd=new Random();
        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int i=0;i<50;i++){
            list.add(rd.nextInt(100));
        }
        System.out.println("随机生成的50个数为：");
        for(int i=0;i<50;i++){
            System.out.print(list.get(i)+",");
        }

       HashMap<Integer,ArrayList<Integer>> map=new HashMap<Integer, ArrayList<Integer>>();
        ArrayList<Integer> a0=new ArrayList<Integer>();
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        ArrayList<Integer> a3=new ArrayList<Integer>();
        ArrayList<Integer> a4=new ArrayList<Integer>();
        ArrayList<Integer> a5=new ArrayList<Integer>();
        ArrayList<Integer> a6=new ArrayList<Integer>();
        ArrayList<Integer> a7=new ArrayList<Integer>();
        ArrayList<Integer> a8=new ArrayList<Integer>();
        ArrayList<Integer> a9=new ArrayList<Integer>();
        for(int i=0;i<50;i++){

           if(list.get(i)/10==0){
               a0.add(list.get(i));
           }else if(list.get(i)/10==1){
               a1.add(list.get(i));
           }
           else if(list.get(i)/10==2){
               a2.add(list.get(i));
           }
           else if(list.get(i)/10==3){
               a3.add(list.get(i));
           }
           else if(list.get(i)/10==4){
               a4.add(list.get(i));
           }
           else if(list.get(i)/10==5){
               a5.add(list.get(i));
           }
           else if(list.get(i)/10==6){
               a6.add(list.get(i));
           }
           else if(list.get(i)/10==7){
               a7.add(list.get(i));
           }
           else if(list.get(i)/10==8){
               a8.add(list.get(i));
           }
           else if(list.get(i)/10==9){
               a9.add(list.get(i));
           }
            }

            if(a0.size()>0){
            map.put(0,a0);
            }
        if(a0.size()>0){
            map.put(0,a0);
        }
        if(a1.size()>0){
            map.put(1,a1);
        }
        if(a2.size()>0){
            map.put(2,a2);
        }
        if(a3.size()>3){
            map.put(3,a3);
        }
        if(a4.size()>0){
            map.put(4,a4);
        }
        if(a5.size()>0){
            map.put(5,a5);
        }
        if(a6.size()>0){
            map.put(6,a6);
        }
        if(a7.size()>0){
            map.put(7,a7);
        }
        if(a8.size()>0){
            map.put(8,a8);
        }
        if(a9.size()>0){
            map.put(9,a9);
        }

        System.out.println("map中数据为：");
        for(Integer key:map.keySet()){
            System.out.print(key+">[");
           ArrayList<Integer> aa=map.get(key);
           for(int i=0;i<aa.size();i++){
               System.out.print(aa.get(i)+",");
           }
            System.out.print("],");
        }
        System.out.println();

        System.out.println("排序后map中数据为：");
        for(Integer key:map.keySet()){
            System.out.print(key+">[");
            ArrayList<Integer> aa=map.get(key);
            Collections.sort(aa);
            for(int i=0;i<aa.size();i++){
                System.out.print(aa.get(i)+",");
            }
            System.out.print("],");
        }
        }
}
