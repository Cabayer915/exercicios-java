public class Caminhao  extends Carro{
    private Integer numeroEixos;
    private Integer capacidadeCarga;
    private Double alturaMaxima;
    private Double comprimento;
    private String tipoCarga;

    public Caminhao(Integer numeracao, String modelo, String cor, Integer capacidadeTanque, String placa, String marca, Integer numeroEixos, Integer capacidadeCarga, Double alturaMaxima, Double comprimento, String tipoCarga) {
        super(numeracao, modelo, cor, capacidadeTanque, placa, marca);
        this.numeroEixos = numeroEixos;
        this.capacidadeCarga = capacidadeCarga;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
        this.tipoCarga = tipoCarga;
    }

    public Caminhao(Integer numeracao, String modelo, String cor, Integer capacidadeTanque, String placa, String marca) {
        super(numeracao, modelo, cor, capacidadeTanque, placa, marca);
    }

    public Integer getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(Integer numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public Integer getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(Integer capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public Double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(Double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    @Override
    public String toString() {
        return "Caminhao\n" +
                "    Numeração = " + getNumeracao() + ",\n" +
                "    Modelo = " + getModelo() + ",\n" +
                "    Cor = " + getCor() + ",\n" +
                "    Capacidade do Tanque = " + getCapacidadeTanque() + ",\n" +
                "    Placa = " + getPlaca() + ",\n" +
                "    Marca = " + getMarca() + ",\n" +
                "    Número de Eixos = " + numeroEixos + ",\n" +
                "    Capacidade de Carga = " + capacidadeCarga + ",\n" +
                "    Altura Máxima = " + alturaMaxima + ",\n" +
                "    Comprimento = " + comprimento + ",\n" +
                "    Tipo de Carga = " + tipoCarga + "\n";
    }
}
