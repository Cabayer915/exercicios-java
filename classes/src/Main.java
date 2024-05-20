public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(1,"Renault", "Preto", 35, "ADK8-09SF", "Renault");
        Carro carro2 = new Carro(2,"Renault", "Branco", 35, "ADK8-09SF", "Renault");

        System.out.println(
                "O valor do tanque do carro é de: R$" + carro.calculaCapacidadeTanque(5)
        );
        System.out.println(carro);
        System.out.println(carro2);
    }
}