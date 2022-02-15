package br.com.dadrix.shopping;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.dadrix.dao.DaoGeneric;
import br.com.dadrix.entidades.Pessoa;

@ViewScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean {

	private Pessoa pessoa = new Pessoa();
	private DaoGeneric<Pessoa> daoPessoa = new DaoGeneric<Pessoa>();
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public String salvar() {
		pessoa = daoPessoa.merge(pessoa);
		carregarPessoas();
		
		return "";
	}
	
	public String novo() {
		pessoa = new Pessoa();
		
		return "";
	}
	
	public String remove() {
		daoPessoa.deletePorId(pessoa);
		pessoa = new Pessoa();
		carregarPessoas();
		
		return "";
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	@PostConstruct
	public void carregarPessoas() {
		pessoas = daoPessoa.getListEntity(Pessoa.class);
	}
	
	public List<Pessoa> getPessoas(){
		return pessoas;
	}

}
