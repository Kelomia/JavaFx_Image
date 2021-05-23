package sample;

import javafx.application.Application;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please choose print which:\n\t1.Flags\n\t2.Tic-tac-toe");
        int chosen=scan.nextInt();
        if(chosen==1) {
            System.out.println("This is the Flags:");
            Application.launch(Flags.class);
        }else if(chosen==2) {
            System.out.println("This is the Tic-tac-toe:");
            Application.launch(Tictactoe.class);
        }
    }
}
