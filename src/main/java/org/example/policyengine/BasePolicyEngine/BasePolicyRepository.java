package org.example.policyengine.BasePolicyEngine;

import org.example.policyengine.BasePolicyEngine.models.Policy;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasePolicyRepository extends MongoRepository<Policy, String> {


}
