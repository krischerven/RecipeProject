package co.gc.recipes.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	private String username;
	private String email;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL, orphanRemoval=true)
	List<RecipeDbEntry> recipes = new ArrayList<>();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String email, List<RecipeDbEntry> recipes) {
		super();
		this.username = username;
		this.email = email;
		this.recipes = recipes;
	}

	public User(Integer id, String username, String email, List<RecipeDbEntry> recipes) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.recipes = recipes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<RecipeDbEntry> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<RecipeDbEntry> recipes) {
		this.recipes = recipes;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", recipes=" + recipes + "]";
	}
	
	
	
}
