package com.sunsheen.jfids.gef.usecase.plugin.demo.model;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;


/**
 * 用例模型
 * @author lz
 *
 */
public class UsecaseModel  extends AbstractEntityModel{
	private String name;
	private static final Dimension MINIMUM_SIZE = new Dimension(100,40);
	
	public UsecaseModel() {
		super();
		setName("用例");
	}

	public void setConstraint(Rectangle constraint) {
		Dimension size = constraint.getSize();
		if (MINIMUM_SIZE.contains(size)) {
			constraint.setSize(MINIMUM_SIZE);
		}
		super.setConstraint(constraint);
	}
	
	public void setName(String name) {
		String old = this.name;
		this.name = name;
		firePropertyChange(P_ENTITY_NAME, old, name);
	}
	
	public String getName() {
		return name;
	}
	
}
