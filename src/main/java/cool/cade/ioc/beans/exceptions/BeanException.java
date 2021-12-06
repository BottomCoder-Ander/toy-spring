package cool.cade.ioc.beans.exceptions;

/**
 * @author Cade
 * @date 2021/12/6 - 15:53
 */
public class BeanException extends Exception {
    public BeanException(String message) {
        super(message);
    }
    public BeanException(String message, Exception e) {
        super(message, e);
    }

}
