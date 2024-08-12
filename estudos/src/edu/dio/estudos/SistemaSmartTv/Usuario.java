package edu.dio.estudos.SistemaSmartTv;

public class Usuario {
    public static void main(String[] args) {
        TvSimulator tv = new TvSimulator();
        tv.ligar();
        tv.diminuirVolume();
        System.out.println("Canal:" + tv.canal);
        System.out.println("volume:" + tv.volume);
        System.out.println("Canal:" + tv.ligada);

    }
}
