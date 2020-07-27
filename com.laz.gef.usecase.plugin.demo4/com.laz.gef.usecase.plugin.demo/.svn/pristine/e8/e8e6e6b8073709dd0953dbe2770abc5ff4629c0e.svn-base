package com.sunsheen.jfids.gef.usecase.plugin.demo.figure;


import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;

import com.sunsheen.jfids.gef.usecase.plugin.demo.UserCaseChartPlugin;

/**
 * 主画布图形
 * @author lz
 *
 */
public class RootFigure extends Layer{
	public RootFigure() {
		Image image = UserCaseChartPlugin.getImageDescriptor("/icons/help.png").createImage();
		Label help = new Label(image);
		help.setToolTip(showHelp());
		//XY布局 必须制定子图形大小与位置才能显示
		setLayoutManager(new XYLayout());
		//制定提示图形位置 大小（-1，-1）代表大小有内容决定
		add(help);
		setConstraint(help, new Rectangle(new Point(10,10), new Dimension(-1,-1)));
	}

	private IFigure showHelp() {
		Label tip = new Label();
		ToolbarLayout layout = new ToolbarLayout();
		tip.setLayoutManager(layout);
		tip.setText("通过右侧画板工具选择\n并点击点击编辑器来生成图形");
		return tip;
	}
}
