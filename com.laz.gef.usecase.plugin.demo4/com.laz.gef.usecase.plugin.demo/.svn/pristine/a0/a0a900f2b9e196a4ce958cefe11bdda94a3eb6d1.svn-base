package com.sunsheen.jfids.gef.usecase.plugin.demo.factory;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.sunsheen.jfids.gef.usecase.plugin.demo.editpart.RootEditPart;
import com.sunsheen.jfids.gef.usecase.plugin.demo.editpart.UsecaseActorEditPart;
import com.sunsheen.jfids.gef.usecase.plugin.demo.editpart.UsecaseEditPart;
import com.sunsheen.jfids.gef.usecase.plugin.demo.model.RootModel;
import com.sunsheen.jfids.gef.usecase.plugin.demo.model.UsecaseActorModel;
import com.sunsheen.jfids.gef.usecase.plugin.demo.model.UsecaseModel;

public class MyEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part = null;
		if (model instanceof RootModel) {
			part = new RootEditPart();
		}
		if (model instanceof UsecaseModel) {
			part = new UsecaseEditPart();
		}
		if (model instanceof UsecaseActorModel) {
			part = new UsecaseActorEditPart();
		}
		// 设控制器模型
		part.setModel(model);
		return part;
	}

}
