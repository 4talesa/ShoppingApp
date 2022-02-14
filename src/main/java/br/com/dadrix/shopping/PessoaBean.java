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
		daoPessoa.salvar(pessoa);
		
		return "";
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

}
