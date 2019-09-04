package co.gc.recipes.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeHolder {
	private Recipe recipe;

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public RecipeHolder() {
		super();
	}

	@Override
	public String toString() {
		return recipe.toString();
	}
}
