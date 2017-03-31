package app;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Produit {
	
	@Id
	@Column(name="pdt_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Basic
	@Column(name="pdt_reference")
	private String reference;
	

	@Basic
	@Column(name="pdt_designation")
	private String designation;
	
	@Basic
	@Column(name="pdt_puHT")
	private float puHT;
	
	@Basic
	@Column(name="pdt_qteStock")
	private int stock;
	
	@ManyToOne
	@JoinColumn(name="pdt_idCat")
	private Categorie categorie;
	

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public float getPuHT() {
		return puHT;
	}

	public void setPuHT(float puHT) {
		this.puHT = puHT;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}

/* c'est parti*/