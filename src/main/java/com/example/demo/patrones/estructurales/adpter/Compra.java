package com.example.demo.patrones.estructurales.adpter;

import java.util.List;

public class Compra {

    SistemaPago sistemaPago;

    public Compra(SistemaPago sistemaPago) {
        this.sistemaPago = sistemaPago;
    }

    public void confirmarCompra(String cliente, int monto, List<String> productos) {

        //LOGICA PARA CONFIRMAR LA COMPRA
        sistemaPago.procesarPago(monto);
    }
}
