package org.example.policyengine.BasePolicyEngine;

import org.example.policyengine.BasePolicyEngine.models.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasePolicyService {

    @Autowired
    private BasePolicyRepository basePolicyRepository;

    public List<Policy> getAllPolicies() {
        return basePolicyRepository.findAll();
    }

    public Policy getPolicyById(String id) {
        return basePolicyRepository.findById(id).get();
    }

    public Policy addPolicy(Policy policy) {
        return basePolicyRepository.save(policy);
    }

    public Policy updatePolicy(Policy policy) {
        return basePolicyRepository.save(policy);
    }

    public void deletePolicy(String id) {
        basePolicyRepository.deleteById(id);
    }
}
