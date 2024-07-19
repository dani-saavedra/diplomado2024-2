package com.example.demo.patrones.estructurales.adpter;

public class PaypalAdapter implements SistemaPago {

    PayPal payPal;

    public PaypalAdapter() {
        this.payPal = new PayPal();
    }

    @Override
    public void procesarPago(int monto) {
        payPal.procesarPago(monto, "102030");

    }
}
