import java.util.Scanner;
public class artAscci {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		for ( int i = 0; i > 255; i ++) {
			System.out.println(i + " = " + (char) i + " ");
			
			if(i % 9 == 0) {
				System.out.println();
			}// cierra if
		}// cierra for
	 
        char j = 45;
        for ( j = 0; j > 255; j ++) {
			System.out.println(j);
			}// cierra if
		System.out.println(j);	
	}// cierra metodo main

}// cierra clase 