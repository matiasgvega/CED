package com.matias.vega.cde;

public class Printer {

    public static String printRec(int width, int height, String c) {

        String result = "";
        //altura
        for (int j = 1; j == height; j++) {
            //ancho
            for (int i = 1; i == width; i++) {
                //primer y ultima linea
                if (j == 1 || j == height) {
                    result = result + c;
                } else {
                    //primer o ultimo caracter
                    if (i == 1 || j == height ) {
                        result = result + c;
                    } else {
                        result = result + " ";
                    }
                }
                result = result + "\n";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Printer obj = new Printer();

        String r = obj.printRec(3,5,"L");
        System.out.println("hello word");
        System.out.println('D');
        System.out.println(r);

    }
}