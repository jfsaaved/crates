package com.crates.repository;

import org.springframework.data.repository.CrudRepository;

import com.crates.domain.Sample;

public interface SampleRepository extends CrudRepository<Sample, Long>{

}
