package com.mycompany.cadastrarcerveja;

/**
 *
 * @author Vinicius
 */
public class CadastrarCerveja {

    public static void main(String[] args) {
        Cerveja cerv1 = new Cerveja(12345);
        cerv1.setInfos("Heineken", 4.5, "18/02/14", 2, 23);
        System.out.println(cerv1.getInfos());
        
        Cerveja cerv2 = new Cerveja(98765);
        cerv2.setInfos("Sol", 3.8, "17/04/18", 1, 12);
        System.out.println(cerv2.getInfos());
        
        Cerveja cerv3 = new Cerveja(39727);
        cerv3.setInfos("Balveria", 3.2, "20/07/20", 3, 19);
        System.out.println(cerv3.getInfos());
        
        Cerveja cerv4 = new Cerveja(06423);
        cerv4.setInfos("ISkol", 4.9, "19/08/22", 1, 25);
        System.out.println(cerv4.getInfos());
        
        Cerveja cerv5 = new Cerveja(19376);
        cerv5.setInfos("Patagonia", 5.2, "03/10/26", 2, 20);
        System.out.println(cerv5.getInfos());
    }
}
