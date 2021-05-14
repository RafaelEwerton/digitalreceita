package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Farmacia;
import repository.FarmaciaRepository;

@Service
public class FarmaciaService {
	
	@Autowired
	private FarmaciaRepository farmaciaRepository;
	
	
	public Optional<Farmacia> farmaciaById(Long id){
		return farmaciaRepository.findById(id);
	}
	
	public List<Farmacia> farmaciaListAll(){
		return farmaciaRepository.findAll();
	}
	
	public Farmacia saveFarmacia(Farmacia farmacia) {
		return farmaciaRepository.save(farmacia);
	}
	
	public Farmacia updateFarmacia(Farmacia farmacia) {
		return farmaciaRepository.save(farmacia);
	}
	
	public void deleteFarmacia(Long id) {
		farmaciaRepository.deleteById(id);
	}
	
	
	
	

}
