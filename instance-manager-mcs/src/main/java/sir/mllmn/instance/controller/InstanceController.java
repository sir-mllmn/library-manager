package sir.mllmn.instance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("instance")
public class InstanceController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping
    public Object getInstances() {
        return discoveryClient.getServices();
    }
}
