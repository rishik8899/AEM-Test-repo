package com.test.core.services.impl;

import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;

import com.day.cq.mailer.MessageGateway;
import com.day.cq.mailer.MessageGatewayService;
import com.day.cq.mcm.emailprovider.EmailService;
import com.day.cq.mcm.emailprovider.types.Email;
import com.test.core.services.SampleOsgiService;

@Component(
	    immediate = true,
	    service = SampleOsgiService.class,
	    configurationPid = "com.test.core.services.impl.SampleOsgiServiceImpl"
	)
	@Designate(
	    ocd = Configuration.class
	)
public class SampleOsgiServiceImpl implements SampleOsgiService {

    @Reference
    private ResourceResolverFactory resolverFactory;

@Reference
private MessageGatewayService messageGatewayService;

    boolean booleanProp;
    String stringProp;
 
    @Override
    public String getSettings() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sample OSGi Service:\n");
        sb.append("booleanProp: " + booleanProp + "\n");
        sb.append("stringProp: " + stringProp + "\n");
    

        return sb.toString();
    }

    @Activate
    @Modified
    protected final void activate(Configuration config) {
        booleanProp = config.servicename_propertyname_boolean();
        stringProp = config.servicename_propertyname_string();
      
    }

    @Deactivate
    protected void deactivate() {
    }
    
    
    try {
      
                                          
        // Declare a MessageGateway service
        MessageGateway<Email> messageGateway;
        Email email = new
        
        messageGateway.send(email);
  
    }
    catch (Exception e) {
        log.error("Email Sending Error: ", e);
    }
}