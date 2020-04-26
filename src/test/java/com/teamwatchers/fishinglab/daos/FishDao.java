package com.teamwatchers.fishinglab.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teamwatchers.fishinglab.models.Fish;

@Repository
public interface FishDao extends CrudRepository<Fish, Long> {}
