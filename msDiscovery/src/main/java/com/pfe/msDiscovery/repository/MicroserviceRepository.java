package com.pfe.msDiscovery.repository;

import com.pfe.msDiscovery.entity.Microservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MicroserviceRepository extends JpaRepository<Microservice, Integer> {

    Microservice findByKeysContaining(String keys);
    Microservice findByKeysContainingAndVersion(String keys, float version);
}
