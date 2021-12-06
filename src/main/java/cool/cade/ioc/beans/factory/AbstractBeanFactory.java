package cool.cade.ioc.beans.factory;

import cool.cade.ioc.beans.BeanDefinition;
import cool.cade.ioc.beans.exceptions.BeanException;

/**
 * @author Cade
 * @date 2021/12/6 - 15:49
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeanException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeanException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeanException;

}
