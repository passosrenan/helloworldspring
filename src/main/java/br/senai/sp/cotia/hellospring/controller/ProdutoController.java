package br.senai.sp.cotia.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.sp.cotia.hellospring.dao.DaoProduto;
import br.senai.sp.cotia.hellospring.model.Produto;
import br.senai.sp.cotia.hellospring.model.TipoProduto;

@Controller
public class ProdutoController {
	@RequestMapping("formProduto")	
	public String form(Model model) {
		//vetor de tipo de produtos injetando na model os valores da enumeração
		model.addAttribute("tipos", TipoProduto.values());
		return "formProduto";
	}
@RequestMapping("salvarProduto")
public String salvarProduto(Produto produto) {
	System.out.println(produto.getNome());
	System.out.println(produto.getPreco());
	System.out.println(produto.getEstoque());
	System.out.println(produto.getDataValidade());
	System.out.println(produto.getTipoProduto());
	
	DaoProduto dao = new DaoProduto();
	dao.inserir(produto);
	return "redirect:formProduto";
	
}
	

}
