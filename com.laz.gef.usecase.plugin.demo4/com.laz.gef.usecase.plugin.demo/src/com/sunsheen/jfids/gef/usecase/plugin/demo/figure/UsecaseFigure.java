package com.sunsheen.jfids.gef.usecase.plugin.demo.figure;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Label;
import org.eclipse.swt.graphics.Color;

import com.sunsheen.jfids.gef.usecase.plugin.demo.model.UsecaseModel;

/**
 * 用例图、用例图为椭圆形状，在此我们集成Ellipse类
 * @author lz
 *
 */
public class UsecaseFigure extends Ellipse{
	private Label name;

	public UsecaseFigure(UsecaseModel model) {
		name = new Label();
		setBackgroundColor(new Color(null,255, 255, 206));
		setLayoutManager(new BorderLayout());
		add(name, BorderLayout.CENTER);
	}

	public Label getLabel() {
		return name;
	}

}
