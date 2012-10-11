package no.nith.pg560.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@Entity
@Table(name = "PG560_TECHNOLOGY")
public class Technology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true)
	private String acronym;
	@Column
	private String version;
	public String getAcronym(){
		return acronym;
	}
	public void setAcronym(String acronym){
		this.acronym = acronym;
	}
	public String getVersion(){
		return version;
	}
	public void setVersion(String version){
		this.version = version;
	}
	
	public long getId(){
		return id;
	}
	@Override
	public String toString(){
		return ReflectionToStringBuilder.reflectionToString(this);
	}
}
