package cool.cade.ioc.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cade
 * @date 2021/12/6 - 15:47
 */
public class DefaultSingletonBeanRegistry  implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
