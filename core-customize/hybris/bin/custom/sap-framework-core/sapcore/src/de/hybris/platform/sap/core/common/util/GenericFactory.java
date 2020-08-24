/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.core.common.util;

import java.lang.annotation.Annotation;




/**
 * Factory object in order to create spring bean instances.
 */
public interface GenericFactory
{

	/**
	 * Return an instance for the class with the given alias. <br>
	 * 
	 * @param <T>
	 *           type of the bean
	 * @param name
	 *           logical name used in the configuration file.
	 * @return instance of the class.
	 */
	public <T> T getBean(String name);

	/**
	 * Return an instance for the class to the given type. <br>
	 * 
	 * @param <T>
	 *           type of the bean
	 * @param type
	 *           interface type.
	 * @return instance of the class.
	 */
	public <T> T getBean(final Class<T> type);

	/**
	 * Return an instance for the class with the given alias and constructor arguments. <br>
	 * 
	 * @param name
	 *           logical name used in the configuration file.
	 * @param args
	 *           Constructor arguments
	 * @return instance of the class.
	 */
	public Object getBean(final String name, final Object... args);

	/**
	 * Removes bean from current scope.
	 * 
	 * @param beanName
	 *           id or alias of the bean
	 */
	public void removeBean(String beanName);

	/**
	 * Return the names of beans matching the given type (including subclasses), judging from either bean definitions or
	 * the value of getObjectType in the case of FactoryBeans.
	 * 
	 * @param type
	 *           type of the requested beans
	 * @return the names of beans (or objects created by FactoryBeans) matching the given object type (including
	 *         subclasses), or an empty array if none
	 */
	public String[] getBeanNamesForType(Class<?> type);


	/**
	 * Find a Annotation of annotationType on the specified bean, traversing its interfaces and super classes if no
	 * annotation can be found on the given class itself.
	 * 
	 * @param <A>
	 *           annotation
	 * @param beanName
	 *           id or alias of the bean
	 * @param annotationType
	 *           requested annotation type
	 * @return the annotation of the given type found, or null
	 */
	public <A extends Annotation> A findAnnotationOnBean(String beanName, Class<A> annotationType);
}
