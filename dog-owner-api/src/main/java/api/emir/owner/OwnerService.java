package api.emir.owner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

	@Autowired
	private OwnerRepository ownerRepo;
	
	public List<Owner> getAllOwners(){
		
		List <Owner> owners = new ArrayList<>();
		
		ownerRepo.findAll().forEach(owners::add);
		
		return owners;
		
	}
	
	public Owner getOwnerById(int id) {
		
		return ownerRepo.findById(id).orElse(null);
		
	}
	
	public void addOwner(Owner owner) {
		ownerRepo.save(owner);
	}
	
	public void updateOwner(Owner owner, int id) {
		ownerRepo.save(owner);
	}
	
	public void deleteOwner(int id) {
		ownerRepo.deleteById(id);
	}
	
	
}
