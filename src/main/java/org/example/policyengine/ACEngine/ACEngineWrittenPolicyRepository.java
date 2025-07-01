package org.example.policyengine.ACEngine;

import org.example.policyengine.ACEngine.models.WrittenPolicyRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ACEngineWrittenPolicyRepository extends MongoRepository<WrittenPolicyRecord, String> {
}
