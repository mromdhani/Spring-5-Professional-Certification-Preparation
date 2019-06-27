package be.businesstraining.configuration.initilalizer;

import be.businesstraining.configuration.SpringWebConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

   @Override
   protected Class<?>[] getRootConfigClasses() {

       return new Class[] { SpringWebConfiguration.class };
   }
 
   @Override
   protected Class<?>[] getServletConfigClasses() {

       return null;
   }
 
   @Override
   protected String[] getServletMappings() {

       return new String[] { "/" };
   }

}