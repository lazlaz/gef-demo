package com.sunsheen.jfids.gef.usecase.plugin.demo.editpart;

import java.beans.PropertyChangeEvent;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;

import com.sunsheen.jfids.gef.usecase.plugin.demo.model.AbstractEntityModel;

/**
 * 抽象视图控制器
 * @author lz
 *
 */
public abstract class AbstractEntityEditPart extends AbstractEditPart{
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		
	}

	protected void refreshVisuals() {
		super.refreshVisuals();
		Object model = getModel();
		if (model instanceof AbstractEntityModel) {
			Rectangle constraint = ((AbstractEntityModel) model)
					.getConstraint();
			((GraphicalEditPart) getParent()).setLayoutConstraint(this,
					getFigure(), constraint);
		}
	}
}
