package co.gc.recipes.entity;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeResult {
	
	private List<RecipeHolder> hits;
	private String q;

	public List<RecipeHolder> getHits() {
		return hits;
	}

	public void setHits(List<RecipeHolder> hits) {
		this.hits = hits;
	}

	public RecipeResult() {
		super();
	}

	
	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
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
