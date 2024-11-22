import java.util.Scanner;

public void saludarConEdad(){
Scanner scan = new Scanner(System.in);
System.out.print("Dime tu nombre: ");
String nombre = scan.nextLine();
System.out.print("¿Cuántos años tienes?: ");
int edad = scan.nextInt();
scan.nextLine();
if (edad<18){
System.out.println("Hola " + nombre + " eres bastante joven.");
}else{
System.out.println("Hola " + nombre + " Viejo.");

}

  System.out.println("Esto es una prueba de sincronizacion")
}

