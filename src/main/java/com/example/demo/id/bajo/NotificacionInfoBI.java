package com.example.demo.id.bajo;

import com.example.demo.id.alto.Notificacion;

public class NotificacionInfoBI implements Notificacion {

    public void notificar(String cliente) {
        System.out.println("Notificando al cliente " + cliente+" a través de infoBI");
        System.out.println("SOCKET");
    }
}
