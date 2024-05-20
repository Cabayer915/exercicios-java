public class Moto extends Carro{
    private Integer cilindrada;
    private String tipo;
    private Integer peso;
    private Integer quantidadeMarchas;
    private String tipoFreio;

    public Moto(Integer numeracao, String modelo, String cor, Integer capacidadeTanque, String placa, String marca, Integer cilindrada, String tipo, Integer peso, Integer quantidadeMarchas, String tipoFreio) {
        super(numeracao, modelo, cor, capacidadeTanque, placa, marca);
        this.cilindrada = cilindrada;
        this.tipo = tipo;
        this.peso = peso;
        this.quantidadeMarchas = quantidadeMarchas;
        this.tipoFreio = tipoFreio;
    }

    public Moto(Integer numeracao, String modelo, String cor, Integer capacidadeTanque, String placa, String marca) {
        super(numeracao, modelo, cor, capacidadeTanque, placa, marca);
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getQuantidadeMarchas() {
        return quantidadeMarchas;
    }

    public void setQuantidadeMarchas(Integer quantidadeMarchas) {
        this.quantidadeMarchas = quantidadeMarchas;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    @Override
    public String toString() {
        return "Moto\n" +
                "    Numeração = " + getNumeracao() + ",\n" +
                "    Modelo = " + getModelo() + ",\n" +
                "    Cor = " + getCor() + ",\n" +
                "    Capacidade do Tanque = " + getCapacidadeTanque() + ",\n" +
                "    Placa = " + getPlaca() + ",\n" +
                "    Marca = " + getMarca() + ",\n" +
                "    Cilindrada = " + cilindrada + ",\n" +
                "    Tipo = " + tipo + ",\n" +
                "    Peso = " + peso + ",\n" +
                "    Quantidade de Marchas = " + quantidadeMarchas + ",\n" +
                "    Tipo de Freio = " + tipoFreio + "\n";
    }
}
