package com.barkalov.jerseyIDP.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MyCustomExceptionMapper implements ExceptionMapper<MyCustomException> {

    @Override
    public Response toResponse(MyCustomException e) {
        String errorMessage = "Not Acceptable Id";
        return Response.status(Response.Status.NOT_ACCEPTABLE)
                .type(MediaType.TEXT_HTML)
                .entity(errorMessage)
                .build();
    }
}
