package com.example.demo.patrones.estructurales.adpter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Compra compra = new Compra(new PaypalAdapter());
        compra.confirmarCompra("Daniel", 20, new ArrayList<>());
    }
}
