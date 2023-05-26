package it.codingspace.calculatorws.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class CalculatorwsConfig {

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet (ApplicationContext context) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(context);
		servlet.setTransformSchemaLocations(true);
		
		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/ws/*" );
	}
	
	@Bean(name = "calculatorws")
	public DefaultWsdl11Definition defaultWsdl11Definition (XsdSchema schema) {
		DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
		wsdl.setPortTypeName("Calculatorws");
		wsdl.setLocationUri("/ws");
		wsdl.setTargetNamespace("http://www.codingspace.it/calculatorws");
		wsdl.setSchema(schema);
		return wsdl;
	}
	
	@Bean
	public XsdSchema xsdSchema () {
		return new SimpleXsdSchema(new ClassPathResource("calculatorws.xsd"));
	}
}
