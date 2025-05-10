package org.example.policyengine.ACEngine;

import org.example.policyengine.ACEngine.models.PDPPolicyRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ACEnginePDPRepository extends MongoRepository<PDPPolicyRecord, String> {

    List<PDPPolicyRecord> findByPublishedTrue();

}
