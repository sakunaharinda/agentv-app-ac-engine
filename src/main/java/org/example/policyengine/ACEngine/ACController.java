package org.example.policyengine.ACEngine;

import org.example.policyengine.ACEngine.models.Policy;
import org.example.policyengine.ACEngine.models.PolicyRequest;
import org.example.policyengine.ACEngine.models.PolicyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ACController {

    @Autowired
    private ACEngineService acEngineService;

    @RequestMapping("/policy")
    public List<Policy> getAllPolicies() {
        return acEngineService.getAllPolicies();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/request")
    public PolicyResponse getEffect(@RequestBody PolicyRequest policyRequest) {
        return acEngineService.getEffect(policyRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/requestOne")
    public PolicyResponse getEffectOne(@RequestBody PolicyRequest policyRequest) {
        return acEngineService.getEffectOne(policyRequest);
    }
}
