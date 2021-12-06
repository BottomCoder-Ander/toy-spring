package cool.cade.ioc.beans.factory;

import cool.cade.ioc.beans.BeanDefinition;
import cool.cade.ioc.beans.exceptions.BeanException;

/**
 * @author Cade
 * @date 2021/12/6 - 16:12
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeanException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeanException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

}
