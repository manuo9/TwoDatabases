package com.twodb.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.twodb.app.mong.Entity.MongEntity;
import com.twodb.app.mong.repo.MongRepository;
import com.twodb.app.post.Entity.PostEntity;
import com.twodb.app.post.repo.PostRepository;
@ComponentScan(basePackages = {"com.twodb.app.mong.repo"})
@SpringBootApplication
@RestController
public class TwodbApplication {
	@Autowired
	MongRepository mongrepo;
	
	@Autowired
	PostRepository postrepo;
	
	
	 @GetMapping("/fetchall")
	    public List<PostEntity> fetchAllEntities() {
	        return postrepo.findAll(); // As repository extends JpaRepository
	    }
	 
	 @GetMapping("/fetchallmongo")
	    public List<MongEntity> fetchAllFromMongoDB() {
	        return mongrepo.findAll();
	    }
	
	  @PutMapping("/update/{id}")
	    public PostEntity updateEntity(@RequestBody PostEntity updatedEntity, @PathVariable Long id) {
	        // Fetch existing entity from the database
	        PostEntity existingEntity = postrepo.findById(id).orElse(null);

	        if (existingEntity != null) {
	            // Update the existing entity with the new data
	            existingEntity.setFirstName(updatedEntity.getFirstName());
	            existingEntity.setLastName(updatedEntity.getLastName());
	            existingEntity.setEmail(updatedEntity.getEmail());

	            // Save the updated entity
	            return postrepo.save(existingEntity);
	        }

	        return null; // Handle error if the entity doesn't exist
	    }

	  
	  @PutMapping("/update/mong/{id}")
	    public MongEntity updateEntity(@RequestBody MongEntity updatedEntity, @PathVariable Long id) {
	        // Fetch the existing entity from the database
	        MongEntity existingEntity = mongrepo.findById(id).orElse(null);

	        if (existingEntity != null) {
	            // Update the existing entity with the new data
	            existingEntity.setDepartmentname(updatedEntity.getDepartmentname());

	            // Save the updated entity
	            return mongrepo.save(existingEntity);
	        }

	        return null; // Handle error if the entity doesn't exist
	    }
	  
	  @DeleteMapping("/delete/post/{id}")
	    public void deletePostEntity(@PathVariable Long id) {
	        postrepo.deleteById(id);
	    }
	  
	  
	  @DeleteMapping("/delete/mong/{id}")
	    public void deleteMongEntity(@PathVariable Long id) {
	        mongrepo.deleteById(id);
	    }
	public static void main(String[] args) {
		SpringApplication.run(TwodbApplication.class, args);
	}

}
