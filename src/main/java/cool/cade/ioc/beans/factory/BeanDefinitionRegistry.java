package cool.cade.ioc.beans.factory;

import cool.cade.ioc.beans.BeanDefinition;

/**
 * @author Cade
 * @date 2021/12/6 - 16:23
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
