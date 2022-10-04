package com.markettrolley.application.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemPedido implements Serializable {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private Double precoUnitario;
	private Integer qtd;
	private Double precoTotal;

    
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JsonBackReference
	private Produto produto;
    
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JsonBackReference
    private Pedido pedidos;
    
	public Double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	public Double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public Pedido getIdPedidos() {
		return pedidos;
	}
	public void setIdPedidos(Pedido pedidos) {
		this.pedidos = pedidos;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Pedido getPedidos() {
		return pedidos;
	}
	public void setPedidos(Pedido pedidos) {
		this.pedidos = pedidos;
	}

	
    
    

}
