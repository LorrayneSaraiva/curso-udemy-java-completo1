package src.introducao_poo.entities;

public class Exercicio1Rectangle {
    public double height;
    public double width;
    //area: height * width
    //perimetro: 2(width + height)
    //diagonal: diagonal ao quadrado = height * height + width + width

    public double area(){
        double a = height * width;
        return a;
    }
    public double perimeter(){
        double per = 2 * (width + height);
        return per;
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height,2));
    }

}