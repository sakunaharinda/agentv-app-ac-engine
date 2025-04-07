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

    @RequestMapping("/policy/{id}")
    public XACMLPolicyRecord getPolicy(@PathVariable String id) {
        return acEngineService.getPolicy(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/policy/effectAll")
    public PolicyEffectResponse getEffect(@RequestBody PolicyEffectRequest policyRequest) {
        return acEngineService.getEffect(policyRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/policy/effect")
    public PolicyEffectResponse getEffectOne(@RequestBody PolicyEffectRequest policyRequest) {
        return acEngineService.getEffectOne(policyRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/policy/add")
    public void addPolicy(@RequestBody JSONPolicyRecord policyRecord) throws JAXBException {
        acPolicyService.addPolicy(policyRecord);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/policy/addAll")
    public void addPolicyAll(@RequestBody List<JSONPolicyRecord> policyRecords) throws JAXBException {
        acPolicyService.addPolicyAll(policyRecords);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/policy/add/xacml")
    public void addPolicyXACML(@RequestBody XACMLPolicyRecord policyRecord) throws JAXBException {
        acPolicyService.addPolicyXACML(policyRecord);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/policy/{id}")
    public void deletePolicy(@PathVariable String id) {
        acPolicyService.deletePolicy(id);
    }
}
