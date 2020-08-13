package api.emir.owner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OwnerController {

	@Autowired
	private OwnerService ownerService;

	@RequestMapping(method = RequestMethod.GET, value = "/owners")
	public List<Owner> getAllOwners() {
		return ownerService.getAllOwners();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/owners/{id}")
	public Owner getOwner(@PathVariable int id) {
		return ownerService.getOwnerById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/owners")
	public void addOwner(@RequestBody Owner owner) {	
		ownerService.addOwner(owner);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/owners/{id}")
	public void deleteOwner(@PathVariable int id) {
		ownerService.deleteOwner(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/owners/{id}")
	public void updateOwner(@RequestBody Owner owner, @PathVariable int id) {
		ownerService.updateOwner(owner, id);
	}
	
	

}
