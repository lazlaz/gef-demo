package com.sunsheen.jfids.gef.usecase.plugin.demo.editpart;

import java.beans.PropertyChangeEvent;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;

import com.sunsheen.jfids.gef.usecase.plugin.demo.figure.RootFigure;
import com.sunsheen.jfids.gef.usecase.plugin.demo.model.RootModel;
import com.sunsheen.jfids.gef.usecase.plugin.demo.policy.RootEditPolicy;

/**
 * 根控制器
 * @author lz
 *
 */
public class RootEditPart extends AbstractEditPart{

	@Override
	protected IFigure createFigure() {
		RootFigure figure = new RootFigure();
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new RootEditPolicy());
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		/**
		 * 如果模型触发RootModel.P_CHILDREN 事件/刷新孩子信息视图
		 */
		if (evt.getPropertyName().equals(RootModel.P_CHILDREN)) {
			refreshChildren();
		}
	}
	
	/**
	 * 返回子模型
	 */
	@Override
	protected List getModelChildren() {
		return ((RootModel)getModel()).getChildren();
	}
}
