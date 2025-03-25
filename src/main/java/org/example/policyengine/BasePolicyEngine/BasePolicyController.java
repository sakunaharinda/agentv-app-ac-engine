package org.example.policyengine.BasePolicyEngine;

import org.example.policyengine.BasePolicyEngine.models.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BasePolicyController {

    @Autowired
    private BasePolicyService basePolicyService;

    @RequestMapping("/basePolicy")
    public List<Policy> getPolicies(){
        return basePolicyService.getAllPolicies();
    }

    @RequestMapping("/basePolicy/{id}")
    public Policy getPolicyById(@PathVariable String id){
        return basePolicyService.getPolicyById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/basePolicy")
    public Policy addPolicy(@RequestBody Policy policy){
        return basePolicyService.addPolicy(policy);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/basePolicy/{id}")
    public Policy updatePolicy(@PathVariable String id, @RequestBody Policy policy){
        return basePolicyService.updatePolicy(policy);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/basePolicy/{id}")
    public void deletePolicyById(@PathVariable String id){
        basePolicyService.deletePolicy(id);
    }
}
