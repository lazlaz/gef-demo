package com.laz.gef.usecase.plugin.demo.editpart;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.laz.gef.usecase.plugin.demo.figure.RootFigure;

/**
 * 根控制器
 * @author lz
 *
 */
public class RootEditPart extends AbstractGraphicalEditPart{

	@Override
	protected IFigure createFigure() {
		RootFigure figure = new RootFigure();
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		
	}

}
