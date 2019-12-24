package tech.raj.university.bean;

import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.raj.university.model.University;

@Getter
@Setter
@NoArgsConstructor
public class UniversityBean extends BaseBean {

	private String id;

	@NotNull
	@Size(max = 100)
	private String name;

	private String city;

	public UniversityBean(University university) {
		super(university.getCreatedDate(), university.getUpdateDate());
		this.id = university.getId();
		this.name = university.getName();
		this.city = university.getCity();
	}
}
