public class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private Double cilindrage;

    public Automovil(){

    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public String getFabricante(){
        return this.fabricante;
    }

    public void setmodelo(String modelo){
        this.modelo = modelo;
    }
    public String getmodelo(){
        return this.modelo;
    }

    public void setcolor(String color){
        this.color = color;
    }
    public String getcolor(){
        return this.color;
    }

    public void setcilindrage(Double cilindrage){
        this.cilindrage = cilindrage;
    }
    public Double getcilindrage(){
        return this.cilindrage;
    }

}
