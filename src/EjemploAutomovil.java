import javax.swing.*;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil corola = new Automovil();
        corola.setFabricante("Frank");
        corola.setcolor("Rojo");
        corola.setmodelo("Corola");
        corola.setcilindrage(2.5);

        System.out.println("Fabricante = " + corola.getFabricante());
        System.out.println("Color = " + corola.getcolor());
        System.out.println("Modelo = " + corola.getmodelo());
        System.out.println("Cilindo = " + corola.getcilindrage());


    }
}
