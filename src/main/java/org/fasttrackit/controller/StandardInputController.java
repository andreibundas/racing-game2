package org.fasttrackit.controller;

import java.util.Scanner;

public class StandardInputController {

    private int getPlayerCountFromUser() {
        System.out.println("Please enter number of players");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
//        redundand -> transrorma in " return scanner.nextInt(); "
//        int numberEnteredByUser = scanner.nextInt();
//        return numberEnteredByUser;


////        for ( int 1 =0; i < tracks.length; i++ ) {
//        if (tracks[i] != null) {
//
//
////            // 1. Street Citcuit: 300 km
////            System.out.println(i+1 + " . " + tracks[i].getName() + ": " + tracks[i].get.Length() + "km"" );
////        }
}
