package org.example.policyengine.ACEngine;

import org.example.policyengine.ACEngine.models.Policy;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ACEngineRepository extends MongoRepository<Policy, String> {

}
