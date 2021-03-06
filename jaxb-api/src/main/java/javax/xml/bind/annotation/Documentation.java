package javax.xml.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation class is used to support the XSD 'documentation' element in
 * XML Schema files generated by JAXB RI.
 * 
 * @author Waldemar Hummer (hummer@infosys.tuwien.ac.at)
 * @since JAXB-Facets version 0.4
 */
@Target(value = { ElementType.FIELD, ElementType.METHOD, ElementType.TYPE,
        ElementType.PACKAGE })
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface Documentation {

    String source() default "";

    String lang() default "";

    String value();

}