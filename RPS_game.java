package javalearning;

import java.util.Random;
import java.util.Scanner;

public class RPS_game {
    public static void main(String[] args) {
        System.out.println("Welcome to RPS Game");
        Scanner sc = new Scanner(System.in);
        System.out.print("rock paper scissors shoot!! :- ");
        String RPS = sc.nextLine();
        Random r = new Random();
        int out = r.nextInt(3);
        System.out.print("Bot chooses:- ");
        String op;
        if(out == 0){
            op = "rock";
        }
        else if(out == 1){
            op = "paper";
        }
        else {
            op = "scissors";
        }
        System.out.println(op);
        switch (op) {
            case "rock": if(RPS.equals(op)){
                             System.out.println("oops TIE");}
                         else if(RPS.equals("paper")){
                             System.out.println("You won!!!");}
                         else if(RPS.equals("scissors")){
                             System.out.println("oops Bot won");}
                         break;
            case "paper": if(RPS.equals(op)){
                             System.out.println("oops TIE");}
                          else if(RPS.equals("scissors")){
                              System.out.println("You won!!!");}
                          else if(RPS.equals("rock")){
                              System.out.println("oops Bot won!!!");}
                          break;
            case "scissors": if(RPS.equals(op)){
                             System.out.println("oops TIE");}
                             else if(RPS.equals("paper")){
                                 System.out.println("oops Bot won!!!");}
                             else if(RPS.equals("rock")){
                                 System.out.println("You won!!!");}
                             break;

            }
            sc.close();



            }
        }





