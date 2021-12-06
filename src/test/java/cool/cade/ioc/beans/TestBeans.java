package cool.cade.ioc.beans;

import cool.cade.ioc.beans.factory.BeanFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author Cade
 * @date 2021/12/6 - 13:06
 */
@Slf4j
class MyObject{
    public void printInfo(){
        log.info("myobject");
    }
}

public class TestBeans {
    @Test
    public void testBeanFactory() {
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new MyObject());
        beanFactory.registerBeanDefinition("myobj", beanDefinition);

        // 3.获取 bean
        MyObject userService = (MyObject) beanFactory.getBean("myobj");
        userService.printInfo();
    }

}