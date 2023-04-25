package org.Lambda;

public class Main {
    public static void main(String[] args) {
        JavaMethodHandler lm = new JavaMethodHandler();
        LambdaRequest request = new LambdaRequest();
        LambdaResponse response = new LambdaResponse();

        request.setOpcion("1");
        response = lm.handleRequest(request,null);
        System.out.println("Nombre: " + response.getNombre());
        System.out.println("Apellido: " + response.getApellido());
    }
}
