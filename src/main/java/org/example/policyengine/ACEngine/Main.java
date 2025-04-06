package org.example.policyengine.ACEngine;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.example.policyengine.ACEngine.models.ACR;
import org.example.policyengine.ACEngine.models.Expression;
import org.example.policyengine.ACEngine.models.JSONPolicyRecord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Expression expression = new Expression("age", "=", "20");
        ACR acr = new ACR(
                "allow", "lhcp", "treat", "patient", null, "none"
        );
        List<ACR> acrs = new ArrayList<ACR>(List.of(acr));

        JSONPolicyRecord policyRecord = new JSONPolicyRecord(
                "p1",
                "test",
                acrs
        );

        ObjectMapper objectMapper = new ObjectMapper();

        HashMap<String, ?> acrmap = objectMapper.convertValue(policyRecord.getPolicy().get(0), HashMap.class);

        System.out.println(objectMapper.convertValue(policyRecord.getPolicy().get(0), HashMap.class));

        for (Map.Entry<String, ?> entry: acrmap.entrySet()){
            if (entry.getKey().equals("condition") && entry.getValue() != null){
                HashMap<String, String> condition = (HashMap<String, String>) entry.getValue();
                System.out.println(condition.get("left"));
            }
        }
    }
}
