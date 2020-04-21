package com.company;

import java.util.*;

class Cards {
    int value;
    String suit;
    String [] suits = new String []{"Spades", "Diamond", "Hearts", "Clubs"};

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    //Write your code here.



    int getSuitPriority(String suitString) {
        int count = 0;
        switch (suitString){
            case "Spades":
                count = 1;
                break;
            case "Diamond":
                 count = 2;
                break;
            case "Hearts":
                count = 3;
                break;
            case "Clubs":
                count = 4;
                break;
        }
        return count;

        //Write your code here.

    }


}

class ClassicGame extends Cards{
    int points1 = 0;
    int points2 = 0;

    public void game(Cards c1, Cards c2) {

        if(c1.value > c2.value){
            this.points1 ++;
        }
        if(c1.value == c2.value){
            int res = getSuitPriority(c1.suit);
            int res2 = getSuitPriority(c2.suit);
            if(res > res2){
                this.points1 ++;
            }else{
                this.points2++;
            }
        }
        if(c2.value > c1.value){
            this.points2 ++;
        }

        System.out.println("points of player 1 :" + " " + points1);
        System.out.println("points of player 2 :" + " " + points2);
    }

}

 class Source {

    public static void main(String[] args) {
        //Two objects (cards) of class Cards
        Cards c1 = new Cards();
        Cards c2 = new Cards();
        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        System.out.println("please enter the suit and\nthe number");
        String s1 = in.nextLine();
        c1.setCards(s1, in.nextInt());
        in.nextLine();
        //Enter the suit of card 2
        String s2 = in.nextLine();
        c2.setCards(s2, in.nextInt());
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);
    }
}
