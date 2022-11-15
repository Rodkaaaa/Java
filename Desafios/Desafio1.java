package Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        /*
         * P1. Escriba un programa que pida al usuario una medida (que asumimos entera y
         * positiva) y calcule la razón entre
         * el área de un triángulo equilátero y un círculo, cuyas medidas principales
         * (es decir, lado y radio) corresponden al
         * mismo valor leído desde el teclado. Recuerde que el área de un triángulo
         * equilátero de lado � se calcula como
         * �! 3/4 y el área de un círculo de radio � viene dado por ��!.
         * Listo
         */

        /*
         * 5. Un histograma para una colección de datos es una secuencia de pares (d,f),
         * donde d es un dato y f su
         * frecuencia (es decir, cuántas veces aparece en la colección). Por ejemplo,
         * suponga que a 20 personas se les
         * pide calificar con las letras a, b, c, d y e qué tanto les gustó una película
         * que acaban de ver en el cine,
         * obteniendo el siguiente conjunto de respuestas: c b c a b c d e e a b b d c a
         * c c b d a. Luego, el histograma
         * para esta colección de datos se puede representar como:
         */
        
        int a = contarA("aaaaa");
        System.out.print("hay esta cantidad de a: " + a + "\t");
        System.out.print("a:");
        for(int i = 0; i<a ; i++){
            System.out.print("* ");
        }
        System.out.println("");
        int b = contarB("bbbb");
        System.out.print("hay esta cantidad de b: " + b + "\t");
        System.out.print("b:");
        for(int i = 0; i<b ; i++){
            System.out.print("* ");
        }
        System.out.println("");
        int c = contarC("ccccccc");
        System.out.print("hay esta cantidad de c: " + c + "\t");
        System.out.print("c:");
        for(int i = 0; i<c ; i++){
            System.out.print("* ");
        }
        System.out.println("");
        int d = contarD("dddddddd");
        System.out.print("hay esta cantidad de d: " + d + "\t");
        System.out.print("d:");
        for(int i = 0; i<d ; i++){
            System.out.print("* ");
        }


    }

    public static double triangulo(double tri) {
        double triangulo = Math.pow(tri, 2) * Math.sqrt(3 / 4);
        return triangulo;
    }

    public static double circulo(double cir) {
        double circulo = Math.PI * Math.pow(cir, 2);
        return circulo;
    }

    public static int contarA(String a, char b){ //
        int contar = 0;
        for (char l : a.toCharArray()) {
            if(l == b){
                contar++;
            }
        }
        return contar;
    }
    public static int contarB(String b){
        int contar = 0;
        for (char l : b.toCharArray()) {
            if(l == 'b'){
                contar++;
            }
        }
        return contar;
    }
    public static int contarC(String c){
        int contar = 0;
        for (char l : c.toCharArray()) {
            if(l == 'c'){
                contar++;
            }
        }
        return contar;
    }
    public static int contarD(String d){
        int contar = 0;
        for (char l : d.toCharArray()) {
            if(l == 'd'){
                contar++;
            }
        }
        return contar;
    }
}
