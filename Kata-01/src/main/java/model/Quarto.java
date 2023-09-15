package model;

import enums.TipoQuarto;
import lombok.Builder;

@Builder
public class Quarto {

    private int numero;
    private TipoQuarto tipoQuarto;
    private boolean isOcupado;
}
