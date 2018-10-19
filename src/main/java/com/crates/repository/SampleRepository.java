package com.crates.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.crates.domain.Sample;

public interface SampleRepository extends CrudRepository<Sample, Long>{
	
	List<Sample> findAllByOrderByTitleAsc();

}
