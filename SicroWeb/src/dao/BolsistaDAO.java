package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Bolsista;


public class BolsistaDAO extends AbstractDAO<Bolsista> {
	
	private List<Bolsista> lista = new ArrayList<Bolsista>();
	
	public BolsistaDAO(){
		super();
		lista = new ArrayList<Bolsista>();
	}

	@Override
	public List<Bolsista> getLista(Bolsista bolsista) {
		try {
			PreparedStatement ptmt = conn.prepareStatement("select * from bolsista where matricula = ?");
			ptmt.setInt(1, + bolsista.getMatricula() );
			ResultSet rs = ptmt.executeQuery();
			lista.clear();
			while (rs.next()) {
				bolsista = new Bolsista();
				bolsista.setMatricula(rs.getInt(1));
				bolsista.setNome(rs.getString(2));
				bolsista.setHorInicio(rs.getString(3));
				bolsista.setHorFim(rs.getString(4));
				bolsista.setTurno(rs.getString(5));
				lista.add(bolsista);
			}
			rs.close();
			ptmt.close();
		} catch (SQLException e) {
		throw new RuntimeException(e);
	}
		return lista;
	}

	@Override
	public List<Bolsista> getLista() {
		try {
			PreparedStatement ptmt = conn.prepareStatement("select * from bolsista");
			ResultSet rs = ptmt.executeQuery();
			lista.clear();
			while (rs.next()){
				Bolsista bolsista = new Bolsista();
				bolsista.setMatricula(rs.getInt(1));
				bolsista.setNome(rs.getString(2));
				bolsista.setHorInicio(rs.getString(3));
				bolsista.setHorFim(rs.getString(4));
				bolsista.setTurno(rs.getString(5));
				lista.add(bolsista);
			}
			rs.close();
			ptmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
			return lista;
	}
	

	@Override
	public void adicionar(Bolsista bolsista) {
		try {
			PreparedStatement ptmt = conn.prepareStatement("insert into bolsista(matricula, nome , hInicio, hFim, turno) values (?, ?,?,?,?)");
			ptmt.setInt(1, bolsista.getMatricula());		
			ptmt.setString(2, bolsista.getNome());	
			ptmt.setString(3, bolsista.getHorInicio());
			ptmt.setString(4, bolsista.getHorFim());
			ptmt.setString(5, bolsista.getTurno());
			ptmt.executeUpdate();
			ptmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		lista.add(bolsista);
		
	}
	
	public void remover (Bolsista bolsista){
		try {
			PreparedStatement ptmt = conn.prepareStatement("delete from bolsista where matricula = ?");
			ptmt.setInt(1, bolsista.getMatricula());					
			ptmt.executeUpdate();
			ptmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void atualizar(Bolsista bolsista){
		try {
			PreparedStatement ptmt = conn.prepareStatement("UPDATE bolsista set nome = ?, hinicio = ?, hfim = ? ,turno = ? where matricula = ?");								
			
			ptmt.setString(1, bolsista.getNome());		
			ptmt.setString(2, bolsista.getHorInicio());
			ptmt.setString(3, bolsista.getHorFim());
			ptmt.setString(4, bolsista.getTurno());
			ptmt.setInt(5, bolsista.getMatricula());
						
			ptmt.executeUpdate();
			ptmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);			
		}
	}
	

	public void setLista(List<Bolsista> lista) 
	{
		this.lista = lista;
	}

}
