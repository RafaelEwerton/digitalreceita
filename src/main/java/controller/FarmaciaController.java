package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Farmacia;
import service.FarmaciaService;

@RestController
@RequestMapping("/farmacia")
public class FarmaciaController {
	
	@Autowired
	private FarmaciaService farmaciaService;
	
	@GetMapping()
	public ResponseEntity<List<Farmacia>>farmaciaAll(){
		return ResponseEntity.ok().body(farmaciaService.farmaciaListAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Farmacia>> farmaciaById(@PathVariable Long id){
		return ResponseEntity.ok().body(farmaciaService.farmaciaById(id));
	}
	
	@PostMapping()
	public ResponseEntity<Farmacia> saveFarmacia(@RequestBody Farmacia farmacia){
		return ResponseEntity.ok().body(farmaciaService.saveFarmacia(farmacia));
	}
	

	@PostMapping("/{id}")
	public ResponseEntity<Farmacia> updateFarmacia(@RequestBody Farmacia farmacia){
		return ResponseEntity.ok().body(farmaciaService.updateFarmacia(farmacia));
	}

	@DeleteMapping("/{id}")
	public void deleteFarmacia(@PathVariable Long id){
		farmaciaService.deleteFarmacia(id);
	}
	
	
	
	

}
