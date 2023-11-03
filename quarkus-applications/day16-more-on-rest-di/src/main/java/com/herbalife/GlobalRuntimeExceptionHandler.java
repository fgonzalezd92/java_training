package com.herbalife;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;

public class GlobalRuntimeExceptionHandler implements ExceptionMapper<RuntimeException> {
    @Override
    public Response toResponse(RuntimeException exception) {
        String message = "Error:" + exception.getMessage();
        return Response
                .status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(message)
                .build();
    }
}
