package br.com.desafio.iti.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SenhaStatusDTO {

    private boolean senhaValida;

}
