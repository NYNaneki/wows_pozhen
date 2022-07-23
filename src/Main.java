import javax.swing.*;
import java.util.Scanner;

//7*7棋盘
/*class warship {
    int[] loc;
    Integer ishorizontal=0;
    void set{
        loc[0]=(int)(Math.random()*7);
        loc[1]=(int)(Math.random()*7);
    }
    void move{
    for(Integer i=0;i<=1;i++) {
        if(loc[ishorizontal]+1<=7&&loc[ishorizontal]-1>=0){

        }
    }
    }
    void turn{

        }


}*/
class map{
    void draw(){for(Integer i=0;i<7;i++){
        for(Integer j=0;j<7;j++){
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

    }
}