package umari.datafilter.quickstart.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Author {

	@Id
	private Long id;

	@Column
	private String name;
	
	@Column
	private LocalDate birthDate;
	
	@Column
	private Boolean alive;

}
