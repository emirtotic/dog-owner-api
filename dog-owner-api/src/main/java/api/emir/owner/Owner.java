package api.emir.owner;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import api.emir.dog.Dog;

@Entity
@Table(name = "owner")
public class Owner {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String surname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Dog dog;


	public Owner() {

	}

	public Owner(int id, String name, String surname, int dog_id, String dog_name, String dog_breed) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.dog = new Dog(0, dog_name, dog_breed);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	
	

	
	

}
