package cl.banchile.apo_rest_api.service.controller;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class RestServiceController implements RestServiceInterface {
	
	private final static Logger LOGGER = org.slf4j.LoggerFactory.getLogger(RestServiceController.class);
	
	public RestServiceController(){}

	@Override
	public String dummyService(String requestBody) {
		LOGGER.info("Request body:"+requestBody);
		return "OK";
	}
}
