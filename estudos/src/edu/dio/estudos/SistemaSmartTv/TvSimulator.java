package edu.dio.estudos.SistemaSmartTv;

public class TvSimulator {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        this.ligada = true;
    }
    public void desligar(){
        this.ligada = false;
    }
    public void aumentaVolume (){
        this.volume+=1;
    }

    public void diminuirVolume (){
        this.volume-=1;
    }
    public void aumentaCanal(){
        this.canal+=1;
    }
    public void diminuirCanal(){
        this.canal-=1;
    }
    public int mudarCanal(int novoCanal){
        this.canal = novoCanal;
        return this.canal;
    }
}
