package model;

public class Bolsista {
	
	private String nome;
	private String turno;
	private int matricula;
	private String horInicio;
	private String horFim;
	
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTurno() {
		return turno;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
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

}

