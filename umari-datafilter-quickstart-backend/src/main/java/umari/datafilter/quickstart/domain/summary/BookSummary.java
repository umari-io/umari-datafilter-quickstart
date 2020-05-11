package umari.datafilter.quickstart.domain.summary;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import umari.datafilter.quickstart.domain.enums.Genre;

@Entity
@Immutable
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Subselect("SELECT " + 
		"    B.ID AS ID, " + 
		"    B.NAME AS NAME, " + 
		"    B.RELEASE_YEAR AS RELEASE_YEAR, " + 
		"    B.GENRE AS GENRE, " + 
		"    A.ID AS AUTHOR_ID, " + 
		"    A.NAME AS AUTHOR_NAME, " + 
		"    A.BIRTH_DATE AS AUTHOR_BIRTH_DATE, " + 
		"    A.ALIVE AS AUTHOR_ALIVE " + 
		"FROM BOOK B " + 
		"LEFT JOIN AUTHOR A ON (B.AUTHOR_ID = A.ID) ")
public class BookSummary {

	@Id
	private Long id;

	@Column
	private String name;
	
	@Column
	private Integer releaseYear;
	
	@Column
	@Enumerated(EnumType.STRING)
	private Genre genre;
	
	@Column
	private Long authorId;

	@Column
	private String authorName;
	
	@Column
	private LocalDate authorBirthDate;
	
	@Column
	private Boolean authorAlive;

}
