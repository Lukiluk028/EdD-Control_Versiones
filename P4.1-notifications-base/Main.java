// Main.java - Programa principal
public class Main {
    public static void main(String[] args) {
        NotificationManager manager = new NotificationManager();
        
        // Uso de la Factory para obtener el servicio
        NotificationService email = NotificationFactory.getService("email");
        manager.send(email, "Bienvenido al sistema", "usuario@email.com");
    }
}