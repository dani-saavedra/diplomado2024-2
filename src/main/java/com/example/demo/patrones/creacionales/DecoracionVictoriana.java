package com.example.demo.patrones.creacionales;

public class DecoracionVictoriana implements AbsFactory {
    @Override
    public Silla crearSilla() {
        return new SillaVictoriana();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaVictoriano();
    }
}
