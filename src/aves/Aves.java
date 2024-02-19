package aves;


 
public class Aves {

    public static void main(String[] args) {
        Ave pato = new Pato();
        Ave pavao = new Pavao();
        Cantar pavaoAdapter = new PavaoAdapter((Pavao) pavao);

        // Testando Pato
        System.out.println("Pato:");
        pato.voar();
        pato.emitirSom();

        // Testando Pavao
        System.out.println("\nPavao:");
        pavao.voar();
        pavao.emitirSom();

        // Testando Pavao com Adapter
        System.out.println("\nPavao com Adapter:");
        pavaoAdapter.cantar();
    }
}
