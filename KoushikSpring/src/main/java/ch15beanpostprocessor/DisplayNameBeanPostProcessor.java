package ch15beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName)throws BeansException {
		System.out.println("postProcessAfterInitialization bean name: "+beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)throws BeansException {
		System.out.println("postProcessBeforeInitialization bean name: "+beanName);
		return bean;
	}

}
