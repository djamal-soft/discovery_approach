package com.pfe.msDiscovery.repository;

import com.pfe.msDiscovery.entity.Microservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MicroserviceRepository extends JpaRepository<Microservice, Integer> {

    Microservice findById(int id);
    Microservice findByMkeysContaining(String mkeys);
    Microservice findByMkeysContainingAndVersion(String mkeys, float version);
}
