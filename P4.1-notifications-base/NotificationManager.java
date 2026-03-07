// NotificationManager.java - Código a refactorizar
public class NotificationManager{
    // TODO: Separar en clases diferentes: EmailService, SMSService, PushService
    // TODO: Aplicar patrón Strategy para los tipos de notificación
    // TODO: Añadir sistema de logs
    
    public void send(NotificationService service, String message, String recipient) {
        service.send(message, recipient);

    }
    
    // TODO: Añadir método para enviar a múltiples destinatarios
    // TODO: Añadir sistema de reintentos
    // TODO: Añadir validación de parámetros
}


