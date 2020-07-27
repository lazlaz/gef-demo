package com.sunsheen.jfids.gef.usecase.plugin.demo.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.RGB;

/**
 * 所有实体模型的抽象类（包括角色、用例）
 * 
 * @author lz
 *
 */
public abstract class AbstractEntityModel extends AbstractUMLModel {
	/**
	 * 视图约束信息（坐标位置及长度、高度）
	 */
	private Rectangle constraint;

	/**
	 * 子模型集合
	 */
	private List<AbstractUMLModel> children = new ArrayList<AbstractUMLModel>();
	public static final String P_CONSTRAINT = "_constraint";
	public static final String P_CHILDREN = "_children";
	public static final String P_ENTITY_NAME = "_entityName";


	public Rectangle getConstraint() {
		return constraint;
	}

	public void addChild(AbstractUMLModel model) {
		children.add(model);
		model.setParent(this);
		//触发添加孩子事件
		firePropertyChange(P_CHILDREN, null, model);
	}

	public void removeChild(AbstractUMLModel model) {
		children.remove(model);
		model.setParent(this);
		firePropertyChange(P_CHILDREN, null, model);
	}

	public List<AbstractUMLModel> getChildren() {
		return this.children;
	}

	/**
	 * 设置约束信息
	 * 
	 * @param constraint
	 */
	public void setConstraint(Rectangle constraint) {
		if (constraint.x < 0) {
			constraint.x = 0;
		}
		if (constraint.y < 0) {
			constraint.y = 0;
		}
		this.constraint = constraint;
		firePropertyChange(P_CONSTRAINT, null, constraint);
	}
}
