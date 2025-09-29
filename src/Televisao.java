public class Televisao {

    String marca;
    String tamanho;
    String resolucao;


    public Televisao (String marca, String tamanho, String resolucao) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.resolucao = resolucao;
    }

    public void showTelevisao () {
        System.out.printf(
                "\n\nMarca: " + this.marca +
                        "\nTamanho: " + this.tamanho +
                        "\nResolução: " + this.resolucao
        );
    }

}
