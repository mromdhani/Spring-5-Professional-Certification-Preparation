package be.businesstraining.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before(value = "execution(* be.businesstraining.services.Calcul.*(int,int))")
    public void adviceOne(JoinPoint point) {
        String methodName = point.getSignature().getName();
        System.out.println(">>>>> LOG : A l'entrée de la méthode: "+
                            methodName);
    }
    @AfterReturning (value = "execution(* be.businesstraining.services.Calcul.*(int,int))",
                     returning = "resultat")
    public void adviceTwo(JoinPoint point, Object resultat) {
        String methodName = point.getSignature().getName();
        System.out.println(">>>>> LOG : Sortie la méthode: "+
                methodName +" >>>> Résultat : "+(Integer)resultat);
    }
}
