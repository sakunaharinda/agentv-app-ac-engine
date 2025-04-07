package org.example.policyengine.ACEngine;

import jakarta.xml.bind.JAXBException;
import org.example.policyengine.ACEngine.models.JSONPolicyRecord;
import org.example.policyengine.ACEngine.models.Policy;
import org.example.policyengine.ACEngine.models.XACMLPolicyRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ACPolicyService {

    @Autowired
    private ACEngineRepository acEngineRepository;

    private ACPolicyGenerator acPolicyGenerator;

    public ACPolicyService() {
        acPolicyGenerator = new ACPolicyGenerator();
    }

    public void addPolicy(JSONPolicyRecord jsonPolicyRecord) throws JAXBException {

        XACMLPolicyRecord policy = acPolicyGenerator.getXACMLPolicy(jsonPolicyRecord);
        acEngineRepository.save(policy);

    }

    public void addPolicyXACML(XACMLPolicyRecord xacmlPolicyRecord) throws JAXBException {
        acEngineRepository.save(xacmlPolicyRecord);
    }

    public void addPolicyAll(List<JSONPolicyRecord> jsonPolicyRecords) throws JAXBException {

        List<XACMLPolicyRecord> xacmlPolicyRecords = new ArrayList<>();

        for (JSONPolicyRecord jsonPolicyRecord : jsonPolicyRecords) {
            XACMLPolicyRecord policy = acPolicyGenerator.getXACMLPolicy(jsonPolicyRecord);
            xacmlPolicyRecords.add(policy);
        }
        acEngineRepository.saveAll(xacmlPolicyRecords);

    }

    public void deletePolicy(String id) {
        acEngineRepository.deleteById(id);
    }

}
