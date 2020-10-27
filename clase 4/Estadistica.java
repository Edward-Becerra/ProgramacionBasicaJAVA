import java.util.Scanner;//importa objeto Scanner
    public class Estadistica{
        public static void main(String[]args){

            Scanner leer = new Scanner(System.in);// crear instancia Scanner

            System.out.println("Cuantos datos tienes?");
            System.out.println("---------------------");
            int total = leer.nextInt();//leer dato(total), pidiendo la cantidad de datos¿?
            double suma = 0;// guardar datos que me den
            double valores[] = new double [total];//guardar datos en un array vacio(ARRAY CON EL VALOR TOTAL DE DATOS)

            for(int i = 0; i < total ; i++){
                System.out.println("Dar el valor: " + (i+1)); //pide valor
                double  aux = leer.nextDouble();//dato guardado en la variable auxiliar
                valores[i] = aux; //guardar aux en posicion de array actual
                suma += aux;//sumar aux a la variable suma
            }//hasta aca, este es el resultado de la MEDIA

            double media = suma/total; // MEDIA
            double sumaDesviacion = 0;//Iniciar la variable de desviacion

            for(int i = 0; i < valores.length; i++){
                sumaDesviacion = Math.pow(valores[i]-media, 2);//Funcion potencia Math.pow(base, exponente);

            }//ciclo que realiza la desviacion

            double desviacion = Math.sqrt(sumaDesviacion/total);// funcion raiz cuadrada Math.sqrt();

            System.out.println("La media es: " + media);
            
            System.out.println("La desviacion estandar es: " + desviacion);

        }
    }