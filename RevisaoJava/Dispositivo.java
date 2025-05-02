public abstract class Dispositivo implements Conectavel {
    protected int id;
    protected String nome;
    protected boolean ligado;
    
    public Dispositivo(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Interruptor da(o) " + nome + " ligada(o).");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Interruptor da(o) " + nome + " desligada(o).");
    }

    public abstract void executarAcao();
}
