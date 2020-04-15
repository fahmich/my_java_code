package com.example.classe.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class Rappel {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	 private int id;
//	@NotNull
	    private String titre;
//	 @NotNull
	    private String desc;
//	 @NotNull
	    private String datfer;
	 

}
