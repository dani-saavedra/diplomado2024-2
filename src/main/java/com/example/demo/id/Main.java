package com.example.demo.id;

import com.example.demo.id.alto.Factura;
import com.example.demo.id.alto.ReteICA;
import com.example.demo.id.bajo.NotificacionInfoBI;

public class Main {
    public static void main(String[] args) {

        Factura factura = new Factura(new NotificacionInfoBI(), new ReteICA());

        factura.facturar("Katerine", 100);
        factura.facturar("Daniel", 200);
        factura.facturar("Hector", 300);
    }
}
