package com.laz.gef.usecase.plugin.demo.factory;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.laz.gef.usecase.plugin.demo.editpart.RootEditPart;
import com.laz.gef.usecase.plugin.demo.model.RootModel;

public class MyEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part = null;
		if (model instanceof RootModel) {
			part = new RootEditPart();
		}
		// 设控制器模型
		part.setModel(model);
		return part;
	}

}
