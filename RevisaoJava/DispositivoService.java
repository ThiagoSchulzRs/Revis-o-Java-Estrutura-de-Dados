public class DispositivoService {

    public void ligarDispositivo(Dispositivo dispositivo) {
        dispositivo.ligar();
    }

    public void desligarDispositivo(Dispositivo dispositivo) {
        dispositivo.desligar();
    }

    public void executarAcaoDispositivo(Dispositivo dispositivo) {
        dispositivo.executarAcao();
    }
}
