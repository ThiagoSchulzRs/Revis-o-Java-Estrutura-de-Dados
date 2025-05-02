public class Main {
    public static void main(String[] args) {
        Dispositivo lampada = new Lampada(1, "lâmpada da sala");
        Dispositivo sensor = new SensorTemperatura(2, "sensor do quarto");
        
        DispositivoService service = new DispositivoService();

        System.out.println("\t Lâmpada:");
        lampada.conectar();
        service.ligarDispositivo(lampada);
        service.executarAcaoDispositivo(lampada);
        service.desligarDispositivo(lampada);
        lampada.desconectar();

        System.out.println("\t Sensor de Temperatura:");
        sensor.conectar();
        service.ligarDispositivo(sensor);
        service.executarAcaoDispositivo(sensor);
        service.desligarDispositivo(sensor);
        sensor.desconectar();
    }
}
