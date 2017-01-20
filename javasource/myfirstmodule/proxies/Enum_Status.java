// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum Enum_Status
{
	OK(new String[][] { new String[] { "en_US", "OK" }, new String[] { "nl_NL", "OK" } }),
	Blocked(new String[][] { new String[] { "en_US", "Blocked" }, new String[] { "nl_NL", "Blocked" } }),
	Suspect(new String[][] { new String[] { "en_US", "Suspect" }, new String[] { "nl_NL", "Suspect" } });

	private java.util.Map<String,String> captions;

	private Enum_Status(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}
