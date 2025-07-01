package org.example.policyengine.ACEngine;

import org.example.policyengine.ACEngine.models.WrittenPolicyRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ACWrittenPolicyService {

    @Autowired
    private ACEngineWrittenPolicyRepository writtenPolicyRepository;

    public void addWrittenPolicy (WrittenPolicyRecord writtenPolicyRecord) {
        writtenPolicyRepository.save(writtenPolicyRecord);
    }

    public void addWrittenPolicyAll (List<WrittenPolicyRecord> writtenPolicyRecords) {
        writtenPolicyRepository.saveAll(writtenPolicyRecords);
    }

    public List<WrittenPolicyRecord> getAllWrittenPolicies () {
        return writtenPolicyRepository.findAll();
    }

}
