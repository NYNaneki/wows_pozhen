import javax.swing.*;
import java.util.Scanner;

//7*7棋盘
//迭代 先做点状船算了;
class warship {
    int[] loc=new int[2];       //0是x坐标 1是y坐标
    int ishorizontal; //
    int hp=3;
    void set(){
        loc[0]=3;
        loc[1]=3;
        ishorizontal=0;
        System.out.println("settled!");
    }
    void move(){            //机制：先确定方向再前后
        int num=(int) (Math.random()*2);
        int xy=(int)(Math.random()*2); //0 x    1 y
        if(loc[xy]+1>6){
            loc[xy]--;
            num=0;
            return;
        }
        if(loc[xy]-1<0){
            loc[xy]++;
            num=1;
            return;
        }

        switch (num){
            case 1:
        loc[xy]++;
        break;
            case 0:
        loc[xy]--;
        break;}
        String a="null";
        switch (xy) {
            case 0:
                if(num==0)
                    a="X-";
                else a="X+";
                break;
            case 1:
                if(num==0)
                    a="Y-";
                else a="Y+";
                break;
        }
        System.out.print(a+"\t");
        System.out.println("moved!");
    }
    void getloc(){
        System.out.println(loc[0]+" "+loc[1]);
    }
    /*void turn(){
        if(ishorizontal==1)
            ishorizontal=0;
        if(ishorizontal==0)
            ishorizontal=1;
        System.out.println("turned!");
    }*/

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
    while(w.hp>0){
        int x= Integer.parseInt(scanner.next());
        int y=Integer.parseInt(scanner.next());
        int d=Math.abs(x-w.loc[0])+Math.abs(y-w.loc[1]);
        if(d==0){
            System.out.println("hit!");
            w.hp--;
        }
        else System.out.println(d);
        w.move();
    }
    System.out.println("you win win!");
    }
}