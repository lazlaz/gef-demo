package com.laz.gef.usecase.plugin.demo.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.MarqueeToolEntry;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PanningSelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.requests.SimpleFactory;

import com.laz.gef.usecase.plugin.demo.UserCaseChartPlugin;

public class PaletteUtil {

	public static PaletteRoot createPalette() {
		PaletteRoot logicPalette = new PaletteRoot();
		//在画板跟元素中添加画板分组与元素信息
		logicPalette.addAll(createCategories(logicPalette));
		return logicPalette;
	}

	private static List createCategories(PaletteRoot root) {
		List<PaletteContainer> categories = new ArrayList<PaletteContainer>();
		// 创建选择分组工具(一般有GEF自带单选与多选工具)
		categories.add(createControlGroup(root));
		// 创建自定义分组工具(一般在此分组下放置自定义图形工具、可以用多个分组管理图形)在我们创建用例图的图形元素角色与用例
		categories.add(createEntityGroup(root));
		return categories;
	}

	private static PaletteContainer createEntityGroup(PaletteRoot root) {
		PaletteDrawer entities = new PaletteDrawer("元素");
		entities.add(createEntityEntry("角色", "用例角色", Object.class,
				"icons/actor16.gif", "icons/actor16.gif"));
		entities.add(createEntityEntry("用例", "用例描述", Object.class,
				"icons/usecase.gif", "icons/usecase.gif"));
		return entities;
	}

	private static PaletteEntry createEntityEntry(String name, String tip,
			Class<?> clazz, String icon, String bigIcon) {
		// 创建自定义画板工具（参数含义分别为显示名称、提示信息：如果提示信息与显示名称一样将不显示提示、创建工厂（一般采用SimpleFactory,并创建对应的模型类）、显示小图标、显示大图标）
		CreationToolEntry entry = new CreationToolEntry(name, tip,
				new SimpleFactory(clazz),
				UserCaseChartPlugin.getImageDescriptor(icon),
				UserCaseChartPlugin.getImageDescriptor(bigIcon));
		return entry;
	}

	private static PaletteContainer createControlGroup(PaletteRoot root) {
		PaletteGroup controlGroup = new PaletteGroup("画板");
		List<ToolEntry> entries = new ArrayList<ToolEntry>();
		ToolEntry tool = select();
		entries.add(tool);
		root.setDefaultEntry(tool);
		// 多选画板工具
		entries.add(new MarqueeToolEntry("多选", "选择多个图形"));
		controlGroup.addAll(entries);
		return controlGroup;
	}

	public static ToolEntry select() {
		// 单选画板工具
		ToolEntry tool = new PanningSelectionToolEntry("单选", "选择图形");
		return tool;
	}

}
