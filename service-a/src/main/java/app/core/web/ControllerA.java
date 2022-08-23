package app.core.web;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerA {

	@Autowired
	private RestTemplate template;

	// @Autowired
	// private DiscoveryClient discoveryClient;
	// @Autowired
	// private LoadBalancerClient lbClient;

	@GetMapping("/service/a")
	public String handleA() {
//		String serviceId = "service-b";
//		URI baseUri = getInstaceBaseUriLB(serviceId);
		String url = "http://service-b/service/b";
		String res = template.getForObject(url, String.class);
		return "Service A calling B - " + res;
	}

//	private URI getInstaceBaseUriLB(String serviceId) {
//		ServiceInstance serviceInstance = lbClient.choose(serviceId);
//		return serviceInstance.getUri();
//	}

	// NO LB
//	private URI getInstaceBaseUri(String serviceId) {
//		List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
//		for (ServiceInstance serviceInstance : instances) {
//			System.out.println(serviceInstance);
//		}
//		return instances.get(0).getUri();
//	}

}
