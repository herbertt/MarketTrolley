package com.markettrolley.application.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.markettrolley.application.domain.Produto;



public class Util {

	public Util() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Produto>pesistenceTrolleyConverter(List<Produto> list){
		List<Produto> listCache = new ArrayList<Produto>();
	//	Set<Unidade> listUn;
	//	Set<Caracteristica> listCarac; 
		Produto prod;
	/*	for (Produto p : list) {
			listUn = new HashSet<Unidade>();
			listCarac = new HashSet<Caracteristica>();
			for (Caracteristica c : p.getCaracteristicas()) {
				listCarac.add(c);
			}
			for (Unidade u : p.getUnidades()) {
				listUn.add(u);
			}
			prod = new Produto(p.getId(), p.getCodigo(), p.getNome(), p.getDescricao(), p.getImagem(), p.getCodigo_barras(), listCarac, listUn);
			listCache.add(prod);
		}
		*/
		return listCache;
		
	}

}
