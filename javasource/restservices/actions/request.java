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

public class request extends CustomJavaAction<IMendixObject>
{
	private restservices.proxies.HttpMethod method;
	private String url;
	private IMendixObject optRequestData;
	private IMendixObject optResponseData;
	private Boolean sendWithFormEncoding;

	public request(IContext context, String method, String url, IMendixObject optRequestData, IMendixObject optResponseData, Boolean sendWithFormEncoding)
	{
		super(context);
		this.method = method == null ? null : restservices.proxies.HttpMethod.valueOf(method);
		this.url = url;
		this.optRequestData = optRequestData;
		this.optResponseData = optResponseData;
		this.sendWithFormEncoding = sendWithFormEncoding;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		return RestConsumer.request(getContext(), method == null ? HttpMethod.GET : method, url, optRequestData, optResponseData, sendWithFormEncoding).getMendixObject();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "request";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
