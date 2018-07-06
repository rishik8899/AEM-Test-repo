package com.test.core.services.impl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;

@ObjectClassDefinition(name = "Annotation Demo Service - OSGi")
public @interface Configuration {
    @AttributeDefinition(
        name = "Boolean Property",
        description = "Sample boolean value",
        type = AttributeType.BOOLEAN
    )
    boolean servicename_propertyname_boolean() default true;
    
    @AttributeDefinition(
        name = "String Property",
        description = "Sample String property",
        type = AttributeType.STRING
    )
    String servicename_propertyname_string() default "foo";
    
    }