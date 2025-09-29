public class Restaurante {

    String nome;
    String endereco;
    String tipoCulinaria;

    public Restaurante (String nome, String endereco, String tipoCulinaria) {
        this.nome = nome;
        this.endereco = endereco;
        this.tipoCulinaria = tipoCulinaria;
    }

    public void showRestaurante () {
        System.out.printf(
                "\n\nNome: " + this.nome +
                        "\nEndereço: " + this.endereco +
                        "\nTipo de Culinária: " + this.tipoCulinaria
        );
    }
}
