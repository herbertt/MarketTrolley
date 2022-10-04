package com.markettrolley.application.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ItemPedido {
	
	private Double precoUnitario;
	private Integer qtd;
	private Double precoTotal;
    private List<Produto> idProduto;
    private List<Pedido> idPedidos;
    
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
	public List<Produto> getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(List<Produto> idProduto) {
		this.idProduto = idProduto;
	}
	public List<Pedido> getIdPedidos() {
		return idPedidos;
	}
	public void setIdPedidos(List<Pedido> idPedidos) {
		this.idPedidos = idPedidos;
	}
	
    
    

}
