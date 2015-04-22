package control;
import java.util.ArrayList;
import java.util.List;
import dao.BolsistaDAO;
import model.Bolsista;


public class BolsistaMB {
	
	private Bolsista bolsista;
	private List<Bolsista> bolsistas;
	private BolsistaDAO bolsistaDAO;
	
	
	
	public BolsistaMB(){
		bolsista = new Bolsista();
		bolsistas = new ArrayList<Bolsista>();
		bolsistaDAO = new BolsistaDAO();
		
	
	}
	
	public Bolsista getBolsista() {
		return bolsista;
	}
	
	public void setBolsista(Bolsista bolsista) {
		this.bolsista = bolsista;
	}
	
	public List<Bolsista> getBolsistas() {
		return bolsistas;
	}
	
	public void setBolsistas(ArrayList<Bolsista> bolsistas) {
		this.bolsistas = bolsistas;
	}
	
	
	
	public String salvar(){
		
		bolsistaDAO.adicionar(bolsista);
		return "salvar";
	}
	
	public String voltar(){
		return "voltar";
	}
	
	
	public String cadastrar(){
		return "cadastrarBolsista";
	}
	
	public String pesquisar(){
		bolsistas = bolsistaDAO.getLista(bolsista);
		return "pesquisarBolsista";
	}
	
	
	public String alterar(){
		return "alterarBolsista";
	}
	
	public  String alterar2(){
		
		for (Bolsista b: bolsistas)
	    {
			bolsista = b;
			bolsistaDAO.atualizar(bolsista);	
					
		}
		
		return "alterar2";
	}
	
	public  String remover(){
		
		for (Bolsista b: bolsistas)
	    {
			bolsista = b;
			bolsistaDAO.remover(bolsista);	
					
		}
		return "remover";
	}

	public BolsistaDAO getBolsistaDAO() {
		return bolsistaDAO;
	}

	public void setBolsistaDAO(BolsistaDAO bolsistaDAO) {
		this.bolsistaDAO = bolsistaDAO;
	}

}

