package cool.cade.ioc.beans;

import lombok.Data;

/**
 * @author Cade
 * @date 2021/12/6 - 12:55
 */
@Data
public class BeanDefinition {
    private Class<?> beanClass;

    public BeanDefinition(Class<?> bean) {
        this.beanClass = bean;
    }

}
