package control;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.Esc_Bol_Set;
import model.Bolsista;
import model.Setor;




public class Esc_Bol_SetMB {
	private Esc_Bol_Set objeto;
	private ArrayList<Esc_Bol_Set> atividadesHora;
	private List<Bolsista> bolsistas;
	private List<Bolsista> bolsistasManha;
	private List<Setor> setores;

	public Esc_Bol_SetMB(){
		objeto = new Esc_Bol_Set();
		atividadesHora = new ArrayList<Esc_Bol_Set>();

	}

	public Esc_Bol_Set getObjeto() {
		return objeto;
	}

	public void setObjeto(Esc_Bol_Set objeto) {
		this.objeto = objeto;
	}

	public List<Esc_Bol_Set> getObjetos() {
		return atividadesHora;
	}

	public void setObjetos(ArrayList<Esc_Bol_Set> atividadesManha1) {
		this.atividadesHora = atividadesManha1;
	}

	public void separarTurno(){
		for (Bolsista b: bolsistas){

			String turnoBolsista = b.getTurno();
			

			if(turnoBolsista == "Matutino")
			{
				bolsistasManha.add(b);
			}
			else if(turnoBolsista == "Vespertino"){
				
				
			}
			else{
				
			}
		}
	}


	public int sorteioBolsista(){

		if (atividadesHora.size() == 0){
			
			Random r = new Random();
			int f = bolsistasManha.size();
			int posicao = r.nextInt(f);
			
			 int[] posicoesSorteadas = new int[10];
			 
			 for(int p: posicoesSorteadas){
				 
				 if(p == posicao){
					 
					 sorteioBolsista();
				 }
				 else{
					 return posicao;
				 }
			 }
			
		}
		return -1;

	}
	
	public int sorteioSetor(){
		
		Random r = new Random();
		int f = setores.size();
		int posicao = r.nextInt(f);
		
		 int[] posicoesSorteadas = new int[10];
		 
		 for(int p: posicoesSorteadas){
			 
			 if(p == posicao){
				 
				 sorteioSetor();
			 }
			 else{
				 return(posicao);
			 }
		 }
		return -1;
		
	}
	
	
	public ArrayList<Esc_Bol_Set> gerarAtividade(){
	
		
		for (int i = 0; i <= setores.size(); i++){
			
				int posicao = sorteioBolsista();
			
				if (posicao != -1){	
					objeto.setCodigoBolsista(bolsistasManha.get(posicao).getMatricula());
					objeto.setCodigoSetor(setores.get(i).getCodigo());
					atividadesHora.add(objeto);					
				}
		}
		return atividadesHora;	
	}
}


