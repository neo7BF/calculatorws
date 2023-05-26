package it.codingspace.calculatorws.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import it.codingspace.calculatorws.infra.Add;
import it.codingspace.calculatorws.infra.AddResponse;

@Endpoint
public class CalculatorwsEndpoint {

	private static final String NAME_SPACE = "http://www.example.org/calculatorws";

	@PayloadRoot(namespace = NAME_SPACE, localPart = "Add")
	@ResponsePayload
	public AddResponse addAction(@RequestPayload Add request) {
		AddResponse resp = new AddResponse();
		
		resp.setAddResult(request.getIntA()+request.getIntB());
		return resp;
	}
}
