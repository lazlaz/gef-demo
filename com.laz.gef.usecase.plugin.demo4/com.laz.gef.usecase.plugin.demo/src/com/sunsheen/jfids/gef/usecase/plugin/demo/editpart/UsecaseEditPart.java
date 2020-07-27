package com.sunsheen.jfids.gef.usecase.plugin.demo.editpart;

import org.eclipse.draw2d.IFigure;

import com.sunsheen.jfids.gef.usecase.plugin.demo.figure.UsecaseFigure;
import com.sunsheen.jfids.gef.usecase.plugin.demo.model.UsecaseModel;

public class UsecaseEditPart extends AbstractEntityEditPart{

	@Override
	protected IFigure createFigure() {
		UsecaseModel model = (UsecaseModel) getModel();
		UsecaseFigure figure = new UsecaseFigure(model);
		figure.getLabel().setText(model.getName());
		return figure;
	}

}
