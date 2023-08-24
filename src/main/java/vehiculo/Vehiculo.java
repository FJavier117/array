package vehiculo;

import java.util.ArrayList;

public class Vehiculo {
    private final String tipo;
    private final String combustible;

    public Vehiculo(String tipo, String combustible) {
        this.tipo = tipo;
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return tipo + " " + combustible ;
    }
}
