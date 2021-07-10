package com.study.pattern.facade.model;

/**
 * @author
 *
 */
public class SearchEngineFacade {
	public void action(String engine, String task) {
		switch (engine) {
		case "edge":
			switch (task) {
			case "mail":
				Edge.openGmail();
				break;
			default:
				Edge.showSearch();
			}
			break;
		case "chrome":
			switch (task) {
			case "mail":
				Chrome.openGmail();
				break;
			default:
				Chrome.showSearch();
			}
			break;
		}

	}
}
