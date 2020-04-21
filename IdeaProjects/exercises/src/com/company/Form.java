package com.company;

public class Form {
    private int height, weight, depth;
/*
    public Form(int h, int w, int d){
        h = height;
        w = weight;
        d = depth;
    }
*/

    public int getFormHeight(){
        return height;
    }
    public int getFormWeight(){
        return weight;
    }
    public int getFormDepth(){
        return depth;
    }
    public void setForm(int h, int w, int d){
        this.height = h;
        this.weight = w;
        this.depth = d;
    }



    public static void main(String [] args){
        Form form = new Form();
        form.setForm(34,5, 6);
        System.out.println("My attributes are: \n" +
                "Height: " + form.getFormHeight() + "\nWeight: " + form.getFormWeight() +
                "\nDepth: " + form.getFormDepth());
    }
}
