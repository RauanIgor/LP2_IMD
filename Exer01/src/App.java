public class App {
    public static void main(String[] args) throws Exception {
        Animal a1 = new Animal();
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();
        
        a1.emitirSom();
        gato.emitirSom();
        cachorro.emitirSom();

    }
}
