package br.com.dadrix.shopping;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.dadrix.dao.DaoGeneric;
import br.com.dadrix.entidades.Pessoa;

@ViewScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean {

	private Pessoa pessoa = new Pessoa();
	private DaoGeneric<Pessoa> daoPessoa = new DaoGeneric<Pessoa>();
	
	public String salvar() {
		pessoa = daoPessoa.merge(pessoa);
		
		return "";
	}
	
	public String novo() {
		pessoa = new Pessoa();
		
		return "";
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

}
