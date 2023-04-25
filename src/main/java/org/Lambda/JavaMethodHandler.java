package org.Lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class JavaMethodHandler implements RequestHandler<LambdaRequest, LambdaResponse> {


    @Override
    public LambdaResponse handleRequest(LambdaRequest request, Context context) {
        LambdaResponse response = new LambdaResponse();

        if (request.getOpcion().equals("1")){
            response.setNombre("Andres");
            response.setApellido("Bellota");
        }else{
            response.setNombre("Carlos");
            response.setApellido("Regosa");
        }


        return response;
    }
}