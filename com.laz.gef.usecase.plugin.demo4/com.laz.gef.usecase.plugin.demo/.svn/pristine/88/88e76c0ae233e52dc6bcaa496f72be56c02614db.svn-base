package com.sunsheen.jfids.gef.usecase.plugin.demo.editpart;

import org.eclipse.draw2d.IFigure;

import com.sunsheen.jfids.gef.usecase.plugin.demo.figure.UsecaseActorFigure;
import com.sunsheen.jfids.gef.usecase.plugin.demo.figure.UsecaseFigure;
import com.sunsheen.jfids.gef.usecase.plugin.demo.model.UsecaseActorModel;

/**
 * 用例角色控制器
 * @author lz
 *
 */
public class UsecaseActorEditPart extends AbstractEntityEditPart{

	@Override
	protected IFigure createFigure() {
		UsecaseActorModel model = (UsecaseActorModel) getModel();
		UsecaseActorFigure figure = new UsecaseActorFigure(model);
		figure.getLabel().setText(model.getName());
		return figure;
	}

}
