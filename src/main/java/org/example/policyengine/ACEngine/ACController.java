package org.example.policyengine.ACEngine;

import jakarta.xml.bind.JAXBException;
import org.example.policyengine.ACEngine.models.JSONPolicyRecord;
import org.example.policyengine.ACEngine.models.XACMLPolicyRecord;
import org.example.policyengine.ACEngine.models.PolicyEffectRequest;
import org.example.policyengine.ACEngine.models.PolicyEffectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ACController {

    @Autowired
    private ACEngineService acEngineService;

    @Autowired
    private ACPolicyService acPolicyService;

    @RequestMapping("/policy")
    public List<XACMLPolicyRecord> getAllPolicies() {
        return acEngineService.getAllPolicies();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/request")
    public PolicyEffectResponse getEffect(@RequestBody PolicyEffectRequest policyRequest) {
        return acEngineService.getEffect(policyRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/requestOne")
    public PolicyEffectResponse getEffectOne(@RequestBody PolicyEffectRequest policyRequest) {
        return acEngineService.getEffectOne(policyRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addPolicy(@RequestBody JSONPolicyRecord policyRecord) throws JAXBException {
        acPolicyService.addPolicy(policyRecord);
    }
}
