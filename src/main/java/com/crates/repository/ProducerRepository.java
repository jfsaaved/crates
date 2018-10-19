package com.crates.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.crates.domain.Producer;

public interface ProducerRepository extends CrudRepository<Producer, Long> {

}
