package api.emir.dog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogService {

	@Autowired
	private DogRepository dogRepo;
	
	public List<Dog> getAllDogs(){
		
		List<Dog> dogs = new ArrayList<>();
		
		dogRepo.findAll().forEach(dogs::add);
		
		return dogs;
		
	}
	
	public Dog getDogById(int id) {
		
		return dogRepo.findById(id).orElse(null);
		
	}
	
	public void addDog(Dog dog) {
		dogRepo.save(dog);
	}
	
	public void updateDog(Dog dog, int id) {
		dogRepo.save(dog);
	}
	
	public void deleteDog(int id) {
		dogRepo.deleteById(id);
	}
	
	
}
