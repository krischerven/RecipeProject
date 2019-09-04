package co.gc.recipes.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeResult {
	
	private List<RecipeHolder> hits;

	public List<RecipeHolder> getHits() {
		return hits;
	}

	public void setHits(List<RecipeHolder> hits) {
		this.hits = hits;
	}

	public RecipeResult() {
		super();
	}

	@Override
	public String toString() {
		String ret = "RecipeResult []\n ";
		for (RecipeHolder rr : hits) {
			ret += rr;
			ret += "\n";
		}
		return ret;
	}

}
