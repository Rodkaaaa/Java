package com.generation.firstproject.models;

public class Celular {
    private int tamanio;
    private String procesador;
    private String camara;
    private String marca;
    private int ram;
    private float pantalla;
    
    String llamar(String tipoLlamar){
        if(tipoLlamar == "llamando"){
            return "contesta";
        }
        return "no contesta :c";
    }

    void navegar(){
        System.out.println("abriendo juego");
    }

    void fotografiar(){
        System.out.println("Sonido de camara xdxd");
    }


}
