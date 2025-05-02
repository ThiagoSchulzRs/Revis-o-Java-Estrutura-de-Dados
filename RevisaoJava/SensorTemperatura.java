public class SensorTemperatura extends Dispositivo {

    public SensorTemperatura(int id, String nome) {
        super(id, nome);
    }

    @Override
    public void executarAcao() {
        if (ligado) {
            int temperatura = 20 + (int)(Math.random() * 10);
            System.out.println("Sensor medindo temperatura: " + temperatura + "°C");
        } else {
            System.out.println("Sensor desligado. Ligue para medir temperatura.");
        }
    }

    @Override
    public void conectar() {
        System.out.println(nome + " conectado à rede de sensores.");
    }

    @Override
    public void desconectar() {
        System.out.println(nome + " desconectado da rede de sensores.");
    }
}
