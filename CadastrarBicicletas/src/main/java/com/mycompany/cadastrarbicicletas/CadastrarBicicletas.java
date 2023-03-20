package com.mycompany.cadastrarbicicletas;

/**
 *
 * @author Vinicius
 */
public class CadastrarBicicletas {

    public static void main(String[] args) {
        Bicicleta bike1 = new Bicicleta("Honda", "Modelo Top", "China");
        bike1.setMarchaeAro(6, 20);
        bike1.corEpreco("Preta", 1.999);

        Bicicleta bike2 = new Bicicleta("Honda", "Modelo Top", "China");
        bike2.setMarchaeAro(6, 20);
        bike2.corEpreco("Preta", 1.999);

        Bicicleta bike3 = new Bicicleta("Honda", "Modelo Top", "China");
        bike3.setMarchaeAro(6, 20);
        bike3.corEpreco("Preta", 1.999);

        Bicicleta bike4 = new Bicicleta("Honda", "Modelo Top", "China");
        bike4.setMarchaeAro(6, 20);
        bike4.corEpreco("Preta", 1.999);

        System.out.println(bike1.info());
        System.out.println(bike2.info());
        System.out.println(bike3.info());
        System.out.println(bike4.info());
    }

}
