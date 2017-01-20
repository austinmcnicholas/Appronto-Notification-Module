// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.consume.RestConsumer;
import restservices.proxies.HttpMethod;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class getWithParams extends CustomJavaAction<IMendixObject>
{
	private String resourceUrl;
	private IMendixObject requestData;
	private IMendixObject targetObject;

	public getWithParams(IContext context, String resourceUrl, IMendixObject requestData, IMendixObject targetObject)
	{
		super(context);
		this.resourceUrl = resourceUrl;
		this.requestData = requestData;
		this.targetObject = targetObject;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		return RestConsumer.request(getContext(), HttpMethod.GET, resourceUrl, requestData, targetObject, false).getMendixObject();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "getWithParams";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
