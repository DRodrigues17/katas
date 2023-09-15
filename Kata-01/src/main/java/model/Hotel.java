package model;

import lombok.Builder;

import java.util.List;

@Builder
public class Hotel {

    private long id;
    private String nome;

    private List<Quarto>;
}
