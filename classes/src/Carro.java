public class Carro {
    private Integer numeracao;
    private String modelo;
    private String cor;
    private Integer capacidadeTanque;
    private String placa;
    private String marca;

    public Carro(Integer numeracao, String modelo, String cor, Integer capacidadeTanque, String placa, String marca) {
        this.numeracao = numeracao;
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
        this.placa = placa;
        this.marca = marca;
    }

    public Carro() {
    }

    public Integer getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(Integer numeracao) {
        this.numeracao = numeracao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Integer capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro\n" +
                "    Numeração = " + numeracao + ",\n" +
                "    Modelo = " + modelo + ",\n" +
                "    Cor = " + cor + ",\n" +
                "    Capacidade do Tanque = " + capacidadeTanque + ",\n" +
                "    Placa = " + placa + ",\n" +
                "    Marca = " + marca + "\n";
    }

    public Integer calculaCapacidadeTanque(Integer valor) {
        return capacidadeTanque * valor;
    }
}
