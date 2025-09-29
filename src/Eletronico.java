public class Eletronico {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void ligar() {
        System.out.printf("ligado!");
    }
}
