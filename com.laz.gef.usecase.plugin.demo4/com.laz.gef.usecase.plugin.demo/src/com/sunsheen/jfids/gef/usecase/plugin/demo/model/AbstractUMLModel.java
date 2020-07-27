package com.sunsheen.jfids.gef.usecase.plugin.demo.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 * 模型抽象类，定义所有模型公有信息
 * @author lz
 *
 */
public abstract class AbstractUMLModel implements Serializable{
	//父模型
	private AbstractEntityModel parent;
	//模型属性监听
	private PropertyChangeSupport listeners = new PropertyChangeSupport(this);
	
	/**
	 * 添加监听器
	 * @param listener
	 */
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		listeners.addPropertyChangeListener(listener);
	}
	
	/**
	 * 触发监听
	 * @param propName
	 * @param oldValue
	 * @param newValue
	 */
	public void firePropertyChange(String propName, Object oldValue,Object newValue) {
		listeners.firePropertyChange(propName, oldValue, newValue);
	}
	
	/**
	 * 移除监听器
	 * @param listener
	 */
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		listeners.removePropertyChangeListener(listener);
	}
	
	public void setParent(AbstractEntityModel parent) {
		this.parent = parent;
	}
	
	public AbstractEntityModel getParent() {
		return parent;
	}
	

}
