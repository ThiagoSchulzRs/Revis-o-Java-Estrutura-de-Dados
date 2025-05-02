public class Lampada extends Dispositivo {

    public Lampada(int id, String nome) {
        super(id, nome);
    }

    @Override
    public void executarAcao() {
        if (ligado) {
            System.out.println("A lâmpada está acesa.");
        } else {
            System.out.println("A lâmpada está apagada. Ligue o interruptor primeiro.");
        }
    }

    @Override
    public void conectar() {
        System.out.println(nome + " conectada à rede elétrica.");
    }

    @Override
    public void desconectar() {
        System.out.println(nome + " desconectada da rede elétrica.");
    }
}
