import java.util.Scanner;
public class Despedida {
public void despedir(){
Scanner scan = new Scanner(System.in);
System.out.print("Dime tu nombre: ");
String nombre = scan.nextLine();
System.out.println("Nos vemos " + nombre);
System.out.println("Hasta luego" + nombre + " .Espero verte más a menudo.");
}
}