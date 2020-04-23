package com.udemy.compras;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contato {

    private Boolean principal;
    private String endereco;
    private String telefone;
}
