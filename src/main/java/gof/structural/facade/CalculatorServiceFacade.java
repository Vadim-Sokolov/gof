package gof.structural.facade;

import org.springframework.http.*;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

import java.util.Collections;

public class CalculatorServiceFacade {

    private static final String SERVICE_URL = "http://tempuri.org/";

    public String add(int intA, int intB) {
        // Create a RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Add MappingJackson2XmlHttpMessageConverter for XML support
        restTemplate.getMessageConverters().add(new MappingJackson2XmlHttpMessageConverter());

        // Set up the request headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_XML);
        headers.put("SoapAction", Collections.singletonList("http://tempuri.org/Add"));

        // Create the SOAP request body
        MathOperationParametersDto sumDto = new MathOperationParametersDto(intA, intB);

        // Create the URI with the service URL and endpoint
        DefaultUriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory(SERVICE_URL);
        uriBuilderFactory.setEncodingMode(DefaultUriBuilderFactory.EncodingMode.NONE);
        String endpoint = "/Add"; // Assuming the endpoint is /Add based on the service documentation

        // Build the request entity
        HttpEntity<MathOperationParametersDto> requestEntity = new HttpEntity<>(sumDto, headers);

        // Make the HTTP POST request
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                uriBuilderFactory.uriString(endpoint).build(),
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        // Get the response from the server
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("Response Code: " + statusCode);

        return "Request sent successfully";
    }

    public static void main(String[] args) {
        CalculatorServiceFacade calculatorFacade = new CalculatorServiceFacade();
        String result = calculatorFacade.add(1, 2);
        System.out.println(result);
    }
}
