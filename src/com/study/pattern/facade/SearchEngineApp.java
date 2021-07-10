/**
 * 
 */
package com.study.pattern.facade;

import com.study.pattern.facade.model.SearchEngineFacade;

/**
 * @author 
 *
 */
public class SearchEngineApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SearchEngineFacade searchEngine=new SearchEngineFacade();
		searchEngine.action("chrome", "mail");
		searchEngine.action("chrome", "search");
		searchEngine.action("edge", "mail");
		searchEngine.action("edge", "search");

	}

}
