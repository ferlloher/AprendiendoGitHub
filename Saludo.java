import java.util.Scanner;
public class Saludo {
public void saludar() {
Scanner scan = new Scanner(System.in);
System.out.print("Dime tu nombre: ");
String nombre = scan.nextLine();
System.out.println("Hola " + nombre);
}
}