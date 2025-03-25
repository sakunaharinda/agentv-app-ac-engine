package org.example.policyengine.ACEngine;

import org.example.policyengine.ACEngine.models.Policy;
import org.example.policyengine.ACEngine.models.PolicyRequest;
import org.example.policyengine.ACEngine.models.PolicyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
