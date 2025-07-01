package org.example.policyengine.ACEngine;

import jakarta.xml.bind.JAXBException;
import org.example.policyengine.ACEngine.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ACController {

    @Autowired
    private ACEngineService acEngineService;

    @Autowired
    private ACPolicyService acPolicyService;

    @Autowired
    private ACWrittenPolicyService acWrittenPolicyService;

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

    @RequestMapping(method = RequestMethod.POST, value = "/policy/add/json")
    public void addPDPPolicy(@RequestBody PDPPolicyRecord policyRecord) throws JAXBException {
        acPolicyService.addPDPPolicy(policyRecord);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/policy/written/add/json")
    public void addWrittenPolicy(@RequestBody WrittenPolicyRecord policyRecord) {
        acWrittenPolicyService.addWrittenPolicy(policyRecord);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/policy/addAll")
    public void addPolicyAll(@RequestBody List<JSONPolicyRecord> policyRecords) throws JAXBException {
        acPolicyService.addPolicyAll(policyRecords);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/policy/addAll/json")
    public void addPDPPolicyAll(@RequestBody List<PDPPolicyRecord> policyRecords) throws JAXBException {
        acPolicyService.addPDPPolicyAll(policyRecords);
    }

    @RequestMapping(method = RequestMethod.POST, value = "policy/written/addAll/json")
    public void addWrittenPolicyAll(@RequestBody List<WrittenPolicyRecord> policyRecords) {
        acWrittenPolicyService.addWrittenPolicyAll(policyRecords);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/policy/add/xacml")
    public void addPolicyXACML(@RequestBody XACMLPolicyRecord policyRecord) throws JAXBException {
        acPolicyService.addPolicyXACML(policyRecord);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/policy/{id}")
    public void deletePolicy(@PathVariable String id) {
        acPolicyService.deletePolicy(id);
    }

    @RequestMapping("/policy/published")
    public List<PDPPolicyRecord> getPublishedPolicy() {
        return acPolicyService.getPublishedPolicies();
    }

    @RequestMapping("/policy/json")
    public List<PDPPolicyRecord> getAllPDPPolicies() {
        return acPolicyService.getAllPDPPolicies();
    }

    @RequestMapping("/policy/written/json")
    public List<WrittenPolicyRecord> getAllWrittenPolicies() {
        return acWrittenPolicyService.getAllWrittenPolicies();
    }
}
