package control;

import java.util.ArrayList;


import dao.SetorDAO;
import model.Setor;

public class SetorMB {
	
	private Setor setor;
	private ArrayList<Setor> setores;
	private SetorDAO setorDAO;
	
	
	public SetorMB(){
		setor = new Setor();
		setores = new ArrayList<Setor>();
		setorDAO = new SetorDAO();
		
	}
	
	public Setor getSetor() {
		return setor;
	}
	
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	
	public ArrayList<Setor> getSetores() {
		return setores;
	}
	
	public void setSetores(ArrayList<Setor> setores) {
		this.setores = setores;
	}
	
	public String salvar(){
			setorDAO.adicionar(setor);
		return "salvar";
	}
	
	public String voltar(){
		return "voltar";
	}
	
	public String cadastrar(){
		return "cadastrarSetor";
	}
	
	public String pesquisar(){
		return "pesquisarSetor";
	}
	
	public String alterar(){
		return "alterarSetor";
	}
	
	public  String alterar2(){
		
		for (Setor s: setores)
	    {
			setor = s;
			setorDAO.atualizar(setor);	
					
		}
		
		return "alterar2";
	}
	
	public  String remover(){
		
		for (Setor s: setores)
	    {
			setor = s;
			setorDAO.remover(setor);	
					
		}
		return "remover";
	}
	
	public SetorDAO getSetorDAO() {
		return setorDAO;
	}

	public void setSetorDAO(SetorDAO setorDAO) {
		this.setorDAO = setorDAO;
	}


}
