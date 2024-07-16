package com.example.demo.patrones.creacionales;

public class DecoracionModerna implements AbsFactory {
    @Override
    public Silla crearSilla() {
        SillaModerna sillaModerna = new SillaModerna();
        sillaModerna.verEstiloSilla();
        return sillaModerna;
    }

    @Override
    public Sofa crearSofa() {
        SofaModerno sofaModerno = new SofaModerno();
        sofaModerno.verEstiloSofa();
        return sofaModerno;
    }
}
