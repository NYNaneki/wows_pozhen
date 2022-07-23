import javax.swing.*;
import java.util.Scanner;

//7*7棋盘
class warship {
    int[] loc=new int[2];       //0是x坐标 1是y坐标
    Integer ishorizontal;   //是否竖着，与前进后退方向
    void set(){
        loc[0]=3;
        loc[1]=3;
        ishorizontal=0;
        System.out.println("settled!");
    }
    void move(){
        if(loc[ishorizontal]+1==6){
            loc[ishorizontal]--;
            return;
        }
        if(loc[ishorizontal]-1==0){
            loc[ishorizontal]++;
            return;
        }
        int num=(int) (Math.random()*2);
        System.out.println(num);
        switch (num){
            case 1:
        loc[ishorizontal]++;
        break;
            case 0:
        loc[ishorizontal]--;
        break;}
        System.out.println("moved!");
    }
    void getloc(){
        System.out.println(loc[0]+" "+loc[1]);
    }
    void turn(){
        if(ishorizontal==1)
            ishorizontal=0;
        if(ishorizontal==0)
            ishorizontal=1;
        System.out.println("turned!");
    }

}
class map{
    void draw(){for(int i=0;i<7;i++){
        for(int j=0;j<7;j++){
            System.out.print("□");

        }
        System.out.println();
    }}
}
public class Main {

    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    //Integer a= scanner.nextInt();
//System.out.println(a);
       // map Map=new map();
        //Map.draw();
    warship w=new warship();
    w.set();

    }
}