package com.crates.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.crates.domain.Beat;

public interface BeatRepository extends CrudRepository<Beat, Long>{
	
	

}