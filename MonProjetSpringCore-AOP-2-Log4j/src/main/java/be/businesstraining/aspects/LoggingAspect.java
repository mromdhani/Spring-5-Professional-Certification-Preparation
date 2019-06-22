package be.businesstraining.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger  logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before(value = "execution(* be.businesstraining.services.Calcul.*(int,int))")
    public void adviceOne(JoinPoint point) {
        String methodName = point.getSignature().getName();
        logger.info(">>>>> LOG : A l'entrée de la méthode: "+
                            methodName);
    }
    @AfterReturning(value = "execution(* be.businesstraining.services.Calcul.*(int,int))",
                     returning = "resultat")
    public void adviceTwo(JoinPoint point, Object resultat) {
        String methodName = point.getSignature().getName();
        logger.info(">>>>> LOG : Sortie la méthode: "+
                methodName +" >>>> Résultat : "+(Integer)resultat);
    }
}
