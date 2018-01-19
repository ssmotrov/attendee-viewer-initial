package io.rscale.training.attendeeviewer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "company", fallback = CompanyClientFallback.class)
public interface CompanyClient {

    @RequestMapping(method = RequestMethod.GET, value = "/companies/{id}")
	Company getCompany(@PathVariable("id") String id);
	
}
