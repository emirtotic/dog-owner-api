package api.emir.dog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {

	@Autowired
	private DogService dogService;

	@RequestMapping(method = RequestMethod.GET, value = "/dogs")
	public List<Dog> getAllDogs() {
		return dogService.getAllDogs();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/dogs/{id}")
	public Dog getDog(@PathVariable int id) {
		return dogService.getDogById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/dogs")
	public void addDog(@RequestBody Dog dog) {
		
		dogService.addDog(dog);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/dogs/{id}")
	public void deleteDog(@PathVariable int id) {
		dogService.deleteDog(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/dogs/{id}")
	public void updateDog(@RequestBody Dog dog, @PathVariable int id) {
		dogService.updateDog(dog, id);
	}
	
	

}
