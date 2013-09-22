/**
 * 
 */
package org.carcv.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * @author oskopek
 * 
 */
@Entity
//@Table(name = "entry")
public class Entry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6502456443004564945L;

	private long id;

	private CarData data;

	private MediaObject preview;

	/**
	 * For EJB
	 */
	public Entry() {
		// Hibernate stub
	}

	/**
	 * @param data
	 * @param preview
	 */
	public Entry(CarData data, MediaObject preview) {
		this.data = data;
		this.preview = preview;
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	@NotNull
	//@Column(name = "id")
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the data
	 */
	@OneToOne
	@NotNull
	//@Column(name="data")
	public CarData getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(CarData data) {
		this.data = data;
	}

	/**
	 * @return the preview
	 */
	@OneToOne
	@NotNull
	//@Column(name="preview")
	public MediaObject getPreview() {
		return preview;
	}

	/**
	 * @param preview
	 *            the preview to set
	 */
	public void setPreview(MediaObject preview) {
		this.preview = preview;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Entry [id=" + id + ", data=" + data + ", preview=" + preview
				+ "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(data).append(preview).toHashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Entry)) {
			return false;
		}
		Entry other = (Entry) obj;
		return new EqualsBuilder().append(data, other.data)
				.append(preview, other.preview).isEquals();
	}

}
