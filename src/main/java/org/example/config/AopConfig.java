package org.example.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AopConfig {

    // Definimos un Pointcut que se aplica a todos los métodos del paquete "service"
    @Pointcut("execution(* org.example.service.*.*(..))")
    public void serviceLayer() {}

    // Antes de cualquier método en el paquete service
    @Before("serviceLayer()")
    public void logBeforeServiceMethod() {
        System.out.println("Ejecutando método en Service Layer...");
    }

    // Después de ejecutar correctamente cualquier método en el paquete service
    @AfterReturning("serviceLayer()")
    public void logAfterSuccessfulServiceMethod() {
        System.out.println("Método ejecutado exitosamente en Service Layer.");
    }

    // Después de que cualquier método en el paquete service lanza una excepción
    @AfterThrowing("serviceLayer()")
    public void logAfterFailedServiceMethod() {
        System.out.println("Se produjo un error en el Service Layer.");
    }
}
