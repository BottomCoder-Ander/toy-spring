package cool.cade.ioc.beans.factory;

import cool.cade.ioc.beans.BeanDefinition;
import cool.cade.ioc.beans.exceptions.BeanException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Cade
 * @date 2021/12/6 - 13:01
 */
public interface BeanFactory {
    public Object getBean(String name) throws BeanException;
}