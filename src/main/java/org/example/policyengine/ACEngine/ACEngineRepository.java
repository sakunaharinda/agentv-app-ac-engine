package org.example.policyengine.ACEngine;

import org.example.policyengine.ACEngine.models.XACMLPolicyRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ACEngineRepository extends MongoRepository<XACMLPolicyRecord, String> {

}
