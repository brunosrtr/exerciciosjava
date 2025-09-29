public class Carro extends Veiculo{
    @Override
    public void mover() {
        System.out.printf("CARRO SE MOVENDO A: " + getVelocidade() + "km/h");
    }
}
