public class Computador extends Eletronico{

    String marca;
    String processador;
    String memoriaRam;




    public Computador (String marca, String processador, String memoriaRam) {
        this.marca = marca;
        this.processador = processador;
        this.memoriaRam = memoriaRam;

    }

    public void showComputador () {
        System.out.printf(
                "\n\nMarca: " + this.marca +
                "\nProcessador: " + this.processador +
                "\nMemória Ram: " + this.memoriaRam
        );
    }

    @Override
    public void ligar() {
        System.out.printf("Computador ");
        super.ligar();
    }

}
