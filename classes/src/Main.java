public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(1,"Renault", "Preto", 35, "ADK8-09SF", "Renault");
        Carro carro2 = new Carro(2,"Renault", "Branco", 35, "ADK8-09SF", "Renault");
        Moto moto = new Moto(3, "Honda CB500", "Vermelho", 17, "XYZ-1234", "Honda",
                500, "Esportiva", 195, 6, "Disco");
        Caminhao caminhao = new Caminhao(4, "Volvo FH", "Branco", 600, "ABC-5678", "Volvo",
                3, 20, 4.2, 12.0, "Carga Seca");

        System.out.println(
                "O valor do tanque do carro é de: R$" + carro.calculaCapacidadeTanque(5)
        );
        System.out.println(carro);
        System.out.println(carro2);
        System.out.println(moto);
        System.out.println(caminhao);
    }
}