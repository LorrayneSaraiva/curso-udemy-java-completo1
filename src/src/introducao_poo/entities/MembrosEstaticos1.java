package src.introducao_poo.entities;

public class MembrosEstaticos1 {
    public static final double IOF = 0.06;

    public static double reaisPagar(double cotacao,double dolares){

        return cotacao * dolares * (1.0 + IOF);
    }

}
