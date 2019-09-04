package co.gc.recipes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.gc.recipes.entity.Recipe;
import co.gc.recipes.entity.RecipeResult;

@Controller
public class RecipeController {

	RestTemplate rt = new RestTemplate();
	/*
	 * The @Value annotation allows us to pull values from aplication.properties
	 * Remember to add application.properties to the .gitignore
	 */
	@Value("${edamam.appKey}")
	String key;

	@Value("${edamam.appId}")
	String id;

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}

	@RequestMapping("/test")
	public ModelAndView testResponse() {

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", key);
		headers.add("ID", id);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);

		try {
			HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
			ResponseEntity<RecipeResult> response = rt.exchange(
					"https://api.edamam.com/search?q=pasta&app_id=" + id + "&app_key=" + key,
					HttpMethod.GET, entity, RecipeResult.class);
			return new ModelAndView("index", "response", response.getBody());
			// also can use RestClientException - might be better
		} catch (HttpClientErrorException e) {
			return new ModelAndView("index", "response", e);
		} catch (RestClientException e) {
			return new ModelAndView("index", "response", e);
		}

	}

	@RequestMapping("/search-results")
	public ModelAndView searchResults(@RequestParam("searchWord") String word) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", key);
		headers.add("ID", id);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);

		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity<RecipeResult> response = rt.exchange(
				"https://api.edamam.com/search?q=" + word + "&app_id=" + id + "&app_key=" + key,
				HttpMethod.GET, entity, RecipeResult.class);

		return new ModelAndView("result", "response", response.getBody());


	}
	
	@RequestMapping("show-recipe")
	public ModelAndView showRecipe(@RequestParam("id") int recId, @RequestParam("query") String query) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", key);
		headers.add("ID", id);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity<RecipeResult> response = rt.exchange(
				"https://api.edamam.com/search?q=" + query + "&app_id=" + id + "&app_key=" + key,
				HttpMethod.GET, entity, RecipeResult.class);
		
		RecipeResult result = response.getBody();
		
		Recipe recipe = result.getHits().get(recId).getRecipe();
		return new ModelAndView("show-recipe", "recipe", recipe);
	}

}
