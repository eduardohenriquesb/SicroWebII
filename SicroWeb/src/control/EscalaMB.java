package control;
import java.util.*;
import model.Escala;
import java.util.List;

public class EscalaMB {
	
	private Escala escala;
	private ArrayList<Escala> escalas;
	private Esc_Bol_SetMB objeto;
	
	public EscalaMB(){
		escala = new Escala();
		escalas = new ArrayList<Escala>();
		objeto = new Esc_Bol_SetMB();
		
		
	}
	
	public Escala getEscala() {
		return escala;
	}
	
	public void setEscala(Escala escala) {
		this.escala = escala;
	}
	
	public List<Escala> getEscalas() {
		return escalas;
	}
	
	public void setEscalas(ArrayList<Escala> escalas) {
		this.escalas = escalas;
	}
	
	public String gerar(){
		objeto.separarTurno();
		escala = new Escala();
		for(int i= 1; i<=4;i++){
			escala.addAtividade(objeto.gerarAtividade());
		}
		escalas.add(escala);
		return "Escala";
		
	}
	

}
