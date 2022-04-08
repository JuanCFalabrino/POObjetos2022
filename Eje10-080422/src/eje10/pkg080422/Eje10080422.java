
package eje10.pkg080422;


public class Eje10080422 {

    public static void main(String[] args) {
        
        Perro animal = new Perro();
        animal.ladrar();
        System.out.println("Nombre del perro antes de la adopción   " + animal.getNombre());
        System.out.println("Raza antes de la adopción   " + animal.getRaza());
        System.out.println("Edad antes de la adopción   " + animal.getedad());
        
        
        
        System.out.println("===================================================");
        System.out.println("============= Tarjeta de Adopción =================");
        System.out.println("===================================================");
        animal.setNombre("Simon");
        animal.setRaza("Callejero");
        animal.setedad(20);
        System.out.println("=====Nombre: " + animal.getNombre());
        System.out.println("=====Raza: " + animal.getRaza());
        System.out.println("=====Edad: " + animal.getedad());
        System.out.println("===================================================");
        System.out.println("===================================================");
        
      
        
        
    }
    
}
