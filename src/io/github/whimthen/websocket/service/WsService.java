package io.github.whimthen.websocket.service;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.ui.content.Content;

public interface WsService {

	static WsService getInstance() {
		return ServiceManager.getService(WsService.class);
	}

	Content initWindow(Project project);

	void createTab(Project project);

	Content newContent(Project project);

}
