package org.myspringframework.core;

/**
 * @author 鹏
 * @version 1.0
 * @description: TODO
 * @date 2024/1/9 12:42
 */
public interface ApplicationContext {
    /**
     * 根据bean的id获取bean实例。
     * @param beanId bean的id
     * @return bean实例
     */
    Object getBean(String beanId);
}
