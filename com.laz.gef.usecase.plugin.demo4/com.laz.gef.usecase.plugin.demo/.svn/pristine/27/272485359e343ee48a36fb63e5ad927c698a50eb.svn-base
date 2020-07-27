package com.sunsheen.jfids.gef.usecase.plugin.demo.policy;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.sunsheen.jfids.gef.usecase.plugin.demo.model.AbstractEntityModel;
import com.sunsheen.jfids.gef.usecase.plugin.demo.model.RootModel;

/**
 * 布局策略
 * @author lz
 *
 */
public class RootEditPolicy extends XYLayoutEditPolicy {

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		CreateCommand command = new CreateCommand();
		Rectangle constraint = (Rectangle) getConstraintFor(request);
		AbstractEntityModel model = (AbstractEntityModel) request
				.getNewObject();
		model.setConstraint(constraint);
		//设置父模型
		command.setRootModel(getHost().getModel());
		command.setModel(model);
		return command;
	}

	private class CreateCommand extends Command {

		private RootModel root;
		private AbstractEntityModel model;

		public void execute() {
			root.addChild(model);
		}

		public void setRootModel(Object root) {
			this.root = (RootModel) root;
		}

		public void setModel(Object model) {
			this.model = (AbstractEntityModel) model;
		}

		public void undo() {
			root.removeChild(model);
		}
	}

}
