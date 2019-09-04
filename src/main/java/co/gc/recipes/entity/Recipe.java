package co.gc.recipes.entity;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {
	String label;
	String image;
	Double calories;
	public Recipe() {
		super();
	}
	@Override
	public String toString() {
		return "Recipe [label=" + label + ", image=" + image + ", calories=" + calories + ", heathLabels="
				+ Arrays.toString(heathLabels) + "]";
	}
	String[] heathLabels;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Double getCalories() {
		return calories;
	}
	public void setCalories(Double calories) {
		this.calories = calories;
	}
	public String[] getHeathLabels() {
		return heathLabels;
	}
	public void setHeathLabels(String[] heathLabels) {
		this.heathLabels = heathLabels;
	}
}
