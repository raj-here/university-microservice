package tech.raj.university.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.raj.university.bean.UniversityBean;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "universities")
public class University extends BaseModel {

	@Column(name = "university_name")
	@NotNull
	@Size(max = 100)
	private String name;

	@Column(name = "city")
	private String city;

	public University(UniversityBean universityBean) {
		super();
		this.id = universityBean.getId();

		this.name = universityBean.getName();
		this.city = universityBean.getCity();
	}
}
