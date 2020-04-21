package com.company;

import java.util.*;

class SavingAmount {
    //write your code here
    int saving;

    void setInitialSaving(int mySaving) {
        this.saving = mySaving;
    }

    int getCurrentSaving() {
        return this.saving;
    }

    int decrementSaving(int amount) {
        this.saving -= amount;
        return this.saving;

    }

    int incrementSaving(int amountSum) {
        this.saving += amountSum;
        return this.saving;
    }

    void checkSaving() {
        if (this.saving >= 1000) {
            System.out.println("Congratulations! You have saved a good amount");
        }
        if (this.saving > 0 && this.saving < 1000) {
            System.out.println("Insufficient saving!");
        }
        if (this.saving < 0) {
            System.out.println("You are in debt");
        }
    }


    public static void main(String[] args) {

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving(100);
        System.out.println(obj.getCurrentSaving());

        obj.incrementSaving(1000);
        System.out.println(obj.getCurrentSaving());
        obj.checkSaving();
        System.out.println("Your current savings are Rs" + obj.getCurrentSaving());
    }

}