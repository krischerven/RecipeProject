package co.gc.recipes.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class RecipeDbEntry {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String url;
	
	@OneToMany(mappedBy="recipe", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<RecipeDetails> details = new ArrayList<>(); 
	
	@ManyToOne
	@JoinColumn(name="recipeid_fk", insertable=false, updatable=false)
	private User user;

	public RecipeDbEntry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecipeDbEntry(String url, List<RecipeDetails> details, User user) {
		super();
		this.url = url;
		this.details = details;
		this.user = user;
	}

	public RecipeDbEntry(Integer id, String url, List<RecipeDetails> details, User user) {
		super();
		this.id = id;
		this.url = url;
		this.details = details;
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<RecipeDetails> getDetails() {
		return details;
	}

	public void setDetails(List<RecipeDetails> details) {
		this.details = details;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "RecipeDbEntry [id=" + id + ", url=" + url + ", details=" + details + ", user=" + user + "]";
	}
	
	
}
