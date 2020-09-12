package com.henryzhang.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_tags")
public class Tag{
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@ManyToMany(mappedBy = "tags")
	private List<Blog> blogs = new ArrayList<>();
	
	public Tag(){
		
	}
}