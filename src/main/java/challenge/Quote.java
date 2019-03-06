package challenge;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name ="scripts")
public class Quote implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="detail")
	private String quote;
	private String actor;
	private Integer episode;
	@Column(name="episode_name")
	private String episodeName;
	private String segment;
	private String type;
	private String character;
	@Column(name="record_date")
	private Date recordDate;
	private String series;
	@Column(name="transmission_date")
	private Date transmissionDate;
	
	public Integer getEpisode() {
		return episode;
	}

	public void setEpisode(Integer episode) {
		this.episode = episode;
	}

	public String getEpisodeName() {
		return episodeName;
	}

	public void setEpisodeName(String episodeName) {
		this.episodeName = episodeName;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Date getTransmissionDate() {
		return transmissionDate;
	}

	public void setTransmissionDate(Date transmissionDate) {
		this.transmissionDate = transmissionDate;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id=id;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
			this.actor=actor;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote=quote;
	}

}
