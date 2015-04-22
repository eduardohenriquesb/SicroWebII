package model;

import java.util.ArrayList;

public class Escala {
	private String data;
	private String horInicio;
	private String horFim;
	private String turno;
	private ArrayList<ArrayList<Esc_Bol_Set>> atividades;
	
	public Escala(){
		atividades = new ArrayList<ArrayList<Esc_Bol_Set>>();
	}
	
	public void addAtividade(ArrayList<Esc_Bol_Set> a){
		atividades.add(a);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorInicio() {
		return horInicio;
	}

	public void setHorInicio(String horInicio) {
		this.horInicio = horInicio;
	}

	public String getHorFim() {
		return horFim;
	}

	public void setHorFim(String horFim) {
		this.horFim = horFim;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public ArrayList<ArrayList<Esc_Bol_Set>> getAtividades() {
		return atividades;
	}

	public void setAtividades(ArrayList<ArrayList<Esc_Bol_Set>> atividades) {
		this.atividades = atividades;
	}		
}
