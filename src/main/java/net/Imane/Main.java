package net.Imane;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       Context context= new Context();
        Scanner scanner = new Scanner(System.in);
 while(true){
     System.out.println("quelle stratégy ??");
     String str = scanner.nextLine();
     IStrategy strategy = (IStrategy) Class.forName("net.Imane.StrategyImpl"+str).getConstructor( ).newInstance();//newInstance: c'est un constructeur par defaut
     context.setStrategy(strategy);
     context.effectuerOperation();
 }

    }
}