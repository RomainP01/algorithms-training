package com.example.RomainP01.algorithmstraining.codingame.easy;

import java.util.Scanner;

public class EncryptionDecryptionOfEnigmaMachine {

    public static int getRankOfLetter(String s){
        char c = s.charAt(0);
        return c-65;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String operation = in.nextLine();
        int pseudoRandomNumber = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String[] rotors = new String[3];
        for (int i = 0; i < 3; i++) {
            String rotor = in.nextLine();
            rotors[i] = rotor;
        }
        String message = in.nextLine();
        String finalM = "";
        if(operation.equals("ENCODE")){
            String mess1 = "";
            for (int i = 0; i <message.length() ; i++) {
                char c = message.charAt(i);
                c = (char) ((c - 'A' + pseudoRandomNumber+i) % 26 + 'A');
                mess1+=c;
            }
            String mess2 = mess1;
            for (String rotor:rotors){
                String oldMess = mess2;
                String newMess = "";
                for (String s : oldMess.split("")) {
                    int pos = getRankOfLetter(s);
                    newMess += rotor.split("")[pos];
                }
                mess2=newMess;
            }
            finalM = mess2;
        }
        else{
            String mess2 = message;
            for (int i = rotors.length-1; i >=0 ; i--) {
                String oldMess = mess2;
                String newMess = "";
                for (String s : oldMess.split("")) {
                    int pos = rotors[i].indexOf(s);
                    newMess += (char) (pos + 65);
                }
                mess2=newMess;
            }
            String mess1 = mess2;
            for (int i = message.length()-1; i >=0 ; i--) {
                char c = mess1.charAt(i);
                c = (char) ((c + 'A' - pseudoRandomNumber-i) % 26 + 'A');
                finalM = c+finalM;
            }
        }

        System.out.println(finalM);
    }
}
