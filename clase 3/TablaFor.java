public class TablaFor{

    public static void main(String[]args){

        int tabla = 7;

        for(int x = 1; x <= 10; x++){

            int resultado = tabla * x;
            
            System.out.println(tabla +" * "+ x +" = " + resultado);
        }

        System.out.println("Termino");
    }
}