public class Impressora {
    String modelo;
    String tipo;
    String status = null;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Impressora(String modelo, String tipo) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.setStatus("Repouso");
    }
    public void imprimir(){
        System.out.println("Imprimindo...");
        this.setStatus("Imprimindo");
    }

    public void cancelarImpressao(){
        System.out.println("Impressão cancelada");
        this.setStatus("Impressão Cancelada");
    }

    public void status(){
        System.out.println("Impressora "+this.getModelo()+"Ultimo Status:"+this.getStatus());
    }
}
