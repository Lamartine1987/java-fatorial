package br.com.fatorial;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner scan_fat = new Scanner(System.in);

        int num_fat;
        int mult = 1;

        System.out.println("Digite o fatorial: ");
        num_fat = scan_fat.nextInt();

        for(int i = num_fat; i >= 1; i--){
            mult = mult * i;
        }
        System.out.println("\n resultado do fatorial de " + num_fat + "! = " + mult);
    }
}
