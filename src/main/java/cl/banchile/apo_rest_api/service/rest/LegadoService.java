package cl.banchile.apo_rest_api.service.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cl.banchile.apo_rest_api.service.controller.RestServiceController;

@RestController
public class LegadoService {	
	
	public LegadoService() {}
	
	@Autowired
	private ObjectMapper mapper;
	
	@Autowired
	private RestServiceController service;

	@RequestMapping(value = "apoderados/dummy",
			       produces = {MediaType.APPLICATION_JSON_UTF8_VALUE },
			       consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE },
			       method = { RequestMethod.POST })
	public String ingresoOperacion(@RequestBody String request) throws JsonProcessingException {
		return mapper.writeValueAsString(service.dummyService(request));
	}

}
