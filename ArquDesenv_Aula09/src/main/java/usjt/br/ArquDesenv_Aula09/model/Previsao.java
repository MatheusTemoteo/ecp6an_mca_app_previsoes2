package usjt.br.ArquDesenv_Aula09.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Previsao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String diaDaSemana;
	private Double tempMinima, tempMaxima;
	private Double umidade;
	private String descricao;
	private Double data,hora;
	private Double latitude;
	private Double longitude;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getId() {
		return id;
	}
	public String getDiaDaSemana() {
		return diaDaSemana;
	}
	public Double getTempMinima() {
		return tempMinima;
	}
	public Double getTempMaxima() {
		return tempMaxima;
	}
	public Double getUmidade() {
		return umidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public Double getData() {
		return data;
	}
	public Double getHora() {
		return hora;
	}
	public Double getlatitude() {
		return latitude;
	}
	public Double longitude() {
		return longitude;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}
	public void setTempMinima(Double tempMinima) {
		this.tempMinima = tempMinima;
	}
	public void setTempMaxima(Double tempMaxima) {
		this.tempMaxima = tempMaxima;
	}
	public void setUmidade(Double umidade) {
		this.umidade = umidade;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setData(Double data) {
		this.data = data;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public void setHora(Double hora) {
		this.hora = hora;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	
}
