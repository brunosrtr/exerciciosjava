public class Caneta {

    private String cor;
    private String marca;
    private String ponta;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPonta() {
        return ponta;
    }

    public void setPonta(String ponta) {
        this.ponta = ponta;
    }

    public void showCaneta () {
        System.out.printf(
                        "\n\nCor: " + this.cor +
                        "\nMarca: " + this.marca +
                        "\nPonta: " + this.ponta
        );
    }
}
