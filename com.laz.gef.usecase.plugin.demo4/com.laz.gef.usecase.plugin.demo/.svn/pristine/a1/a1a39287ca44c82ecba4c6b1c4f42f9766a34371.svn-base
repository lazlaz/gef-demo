package com.sunsheen.jfids.gef.usecase.plugin.demo.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;

import com.sunsheen.jfids.gef.usecase.plugin.demo.UserCaseChartPlugin;
import com.sunsheen.jfids.gef.usecase.plugin.demo.model.AbstractUMLModel;
import com.sunsheen.jfids.gef.usecase.plugin.demo.model.UsecaseActorModel;

/**
 * 用例角色视图
 * @author lz
 *
 */
public class UsecaseActorFigure extends Figure{
	private Label name;

	private Label image;

	public UsecaseActorFigure(UsecaseActorModel model) {
		//设置工具条布局,纵向依次排列
		ToolbarLayout layout = new ToolbarLayout();
		layout.setStretchMinorAxis(false);
		layout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
		setLayoutManager(layout);
		setOpaque(false);

		name = new Label();
		name.setOpaque(true);

		image = new Label();
		image.setIcon(UserCaseChartPlugin.getImageDescriptor("icons/actor.gif")
					.createImage());
		image.setOpaque(true);
		add(image);
		add(getLabel());
	}

	public void updatePresentation(AbstractUMLModel model) {
		setBackgroundColor(ColorConstants.white);
		name.setBackgroundColor(ColorConstants.white);
	}

	public Label getLabel() {
		return name;
	}

	public Rectangle getCellEditorRectangle() {
		return name.getBounds().getCopy();
	}
}
