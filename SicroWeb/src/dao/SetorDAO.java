package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Setor;

public class SetorDAO extends AbstractDAO<Setor> {
	
	private List<Setor> lista = new ArrayList<Setor>();
	
	public SetorDAO(){
		super();
		lista = new ArrayList<Setor>();
	}

	
	public List<Setor> getLista(Setor setor) {
		return null;
	}

	
	public List<Setor> getLista() {
		
		return null;
	}

	
	public void adicionar(Setor setor) {
		try {
			PreparedStatement ptmt = conn.prepareStatement("insert into setor(nome) values (?)");
			ptmt.setString(1, setor.getNome());		
			ptmt.executeUpdate();
			ptmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		lista.add(setor);
		
	}
	
	public void remover (Setor setor){
		try {
			PreparedStatement ptmt = conn.prepareStatement("delete from setor where idSetor = ?");
			ptmt.setInt(1, setor.getCodigo());					
			ptmt.executeUpdate();
			ptmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void atualizar(Setor setor){
		try {
			PreparedStatement ptmt = conn.prepareStatement("UPDATE setor set idSetor = ?, nome = ?");								
			
			ptmt.setInt(1, setor.getCodigo());		
			ptmt.setString(2, setor.getNome());		
						
			ptmt.executeUpdate();
			ptmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);			
		}
	}
	
	public void setLista(List<Setor> lista) 
	{
		this.lista = lista;
	}
	

}

