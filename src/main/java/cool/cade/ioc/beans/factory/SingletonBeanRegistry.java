package cool.cade.ioc.beans.factory;

/**
 * @author Cade
 * @date 2021/12/6 - 15:47
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
