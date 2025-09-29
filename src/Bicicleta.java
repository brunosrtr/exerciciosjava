public class Bicicleta {

    private String marca;
    private String modelo;
    private String tamanho;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void showBicicleta () {
        System.out.printf(
                "\n\nMarca: " + this.marca +
                        "\nModelo: " + this.modelo +
                        "\ntamanho: " + this.tamanho
        );
    }
}
