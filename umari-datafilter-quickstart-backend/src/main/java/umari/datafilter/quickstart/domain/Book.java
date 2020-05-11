package umari.datafilter.quickstart.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import umari.datafilter.quickstart.domain.enums.Genre;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Book {

	@Id
	private Long id;

	@Column
	private String name;
	
	@Column
	private Integer releaseYear;
	
    @ManyToOne
	private Author author;

	@Column
	@Enumerated(EnumType.STRING)
	private Genre genre;

}
