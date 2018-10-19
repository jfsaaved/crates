package com.crates.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.crates.domain.Flip;

public interface FlipRepository extends CrudRepository<Flip, Long>{

}
