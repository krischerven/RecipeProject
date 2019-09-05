package co.gc.recipes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RecipeDetails {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	
	String text;
	
	@ManyToOne
	@JoinColumn(name="recipeid_fk", insertable=false, updatable=false)
	private RecipeDbEntry recipe;

	public RecipeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecipeDetails(String text, RecipeDbEntry recipe) {
		super();
		this.text = text;
		this.recipe = recipe;
	}

	public RecipeDetails(Integer id, String text, RecipeDbEntry recipe) {
		super();
		this.id = id;
		this.text = text;
		this.recipe = recipe;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public RecipeDbEntry getRecipe() {
		return recipe;
	}

	public void setRecipe(RecipeDbEntry recipe) {
		this.recipe = recipe;
	}

	@Override
	public String toString() {
		return "RecipeDetails [id=" + id + ", text=" + text + ", recipe=" + recipe + "]";
	}
	
	
}
