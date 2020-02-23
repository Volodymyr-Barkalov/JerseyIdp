package com.barkalov.jerseyIDP.config;

import com.barkalov.jerseyIDP.controller.SimpleResource;
import com.barkalov.jerseyIDP.exception.MyCustomException;
import com.barkalov.jerseyIDP.exception.MyCustomExceptionMapper;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig()
    {
        register(SimpleResource.class);
        register(MyCustomException.class);
        register(MyCustomExceptionMapper.class);
    }
}
