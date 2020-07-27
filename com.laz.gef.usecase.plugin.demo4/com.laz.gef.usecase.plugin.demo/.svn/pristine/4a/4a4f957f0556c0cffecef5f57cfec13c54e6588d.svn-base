package com.sunsheen.jfids.gef.usecase.plugin.demo.editpart;

import java.beans.PropertyChangeListener;

import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.sunsheen.jfids.gef.usecase.plugin.demo.model.AbstractUMLModel;

/**
 * 控制类公有信息
 * @author lz
 *
 */
public abstract class AbstractEditPart extends AbstractGraphicalEditPart implements PropertyChangeListener{
	
	/**
	 * 激活控制器是注册模型监听器
	 */
	public void activate() {
		super.activate();
		((AbstractUMLModel) getModel()).addPropertyChangeListener(this);
	}
	
	/**
	 * 控制器无效时移除模型监听器
	 */
	public void deactivate() {
		super.deactivate();
		((AbstractUMLModel) getModel()).removePropertyChangeListener(this);
	}
}
