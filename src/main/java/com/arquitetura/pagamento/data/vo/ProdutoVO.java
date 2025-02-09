package com.arquitetura.pagamento.data.vo;

import java.io.Serializable;

import org.modelmapper.ModelMapper;
import org.springframework.hateoas.RepresentationModel;

import com.arquitetura.pagamento.entity.Produto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonPropertyOrder({"id","estoque"})
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ProdutoVO extends RepresentationModel<ProdutoVO> implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 8287901653228139999L;
	
	@JsonProperty("id")
	private Long id;
	@JsonProperty("estoque")
	private Integer estoque;
	
	public static ProdutoVO create (Produto produto) {
		return new ModelMapper().map(produto, ProdutoVO.class);
	}
	
}
