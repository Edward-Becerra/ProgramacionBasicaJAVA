public class Areas {
    public static void main(String[]args) {

        //area del cuadrado
        double lado = 5;
        double resultado = lado * lado;

        // area del restangulo
        double ladoRec = 10;
        double ladoRec2 = 8;

        double resultadoRec = ladoRec * ladoRec2;

        // area del triangulo 
        double base = 12;
        double altura = 10; 

        double resultadoTri = (base * altura) / 2;

        // imprimir resultados

        System.out.println("El area del Cuadrado es: " + resultado);
        System.out.println("El rea del Rectangulo es: " + resultadoRec);
        System.out.println("El area del Triangulo es: " + resultadoTri); 
        
    }    
}