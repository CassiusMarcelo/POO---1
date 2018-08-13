package br.pucrs.poo;

public class Ponto {
    private double cX;
    private double cY;

    public Ponto (double x, double y){
        cX = x;
        cY = y;

    }

    public double getcX() {
        return cX;
    }

    public double getcY() {
        return cY;
    }


  //  double boolean lalala (double x1, double x2, double y1, double y2){
   //      double a;
   // return
   // }


    public String toString (){
        return "("+getcX()+","+getcY()+")";
    }
}
