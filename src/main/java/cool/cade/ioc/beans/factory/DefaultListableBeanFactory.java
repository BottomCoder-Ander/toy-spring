package cool.cade.ioc.beans.factory;

import cool.cade.ioc.beans.BeanDefinition;
import cool.cade.ioc.beans.exceptions.BeanException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cade
 * @date 2021/12/6 - 16:11
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeanException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeanException("No bean named '" + beanName + "' is defined");
        return beanDefinition;
    }

}

