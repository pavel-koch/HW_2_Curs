public class ServiceStation {
    public void check(Transport transport) {
        System.out.println("Сейчас обслуживается: " + transport.getModelName());
        transport.service();
        System.out.println();
    }
}