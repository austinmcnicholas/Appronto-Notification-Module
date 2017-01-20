// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package restservices.proxies;

public class ChangeItem
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject changeItemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RestServices.ChangeItem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Key("Key"),
		SequenceNr("SequenceNr"),
		Etag("Etag"),
		Json("Json"),
		IsDeleted("IsDeleted"),
		_IsDirty("_IsDirty"),
		ChangeItem_ChangeLog("RestServices.ChangeItem_ChangeLog");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ChangeItem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "RestServices.ChangeItem"));
	}

	protected ChangeItem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject changeItemMendixObject)
	{
		if (changeItemMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("RestServices.ChangeItem", changeItemMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a RestServices.ChangeItem");

		this.changeItemMendixObject = changeItemMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ChangeItem.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static restservices.proxies.ChangeItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return restservices.proxies.ChangeItem.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static restservices.proxies.ChangeItem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new restservices.proxies.ChangeItem(context, mendixObject);
	}

	public static restservices.proxies.ChangeItem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return restservices.proxies.ChangeItem.initialize(context, mendixObject);
	}

	public static java.util.List<restservices.proxies.ChangeItem> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<restservices.proxies.ChangeItem> result = new java.util.ArrayList<restservices.proxies.ChangeItem>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//RestServices.ChangeItem" + xpathConstraint))
			result.add(restservices.proxies.ChangeItem.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Key
	 */
	public final String getKey()
	{
		return getKey(getContext());
	}

	/**
	 * @param context
	 * @return value of Key
	 */
	public final String getKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Key.toString());
	}

	/**
	 * Set value of Key
	 * @param key
	 */
	public final void setKey(String key)
	{
		setKey(getContext(), key);
	}

	/**
	 * Set value of Key
	 * @param context
	 * @param key
	 */
	public final void setKey(com.mendix.systemwideinterfaces.core.IContext context, String key)
	{
		getMendixObject().setValue(context, MemberNames.Key.toString(), key);
	}

	/**
	 * @return value of SequenceNr
	 */
	public final Long getSequenceNr()
	{
		return getSequenceNr(getContext());
	}

	/**
	 * @param context
	 * @return value of SequenceNr
	 */
	public final Long getSequenceNr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.SequenceNr.toString());
	}

	/**
	 * Set value of SequenceNr
	 * @param sequencenr
	 */
	public final void setSequenceNr(Long sequencenr)
	{
		setSequenceNr(getContext(), sequencenr);
	}

	/**
	 * Set value of SequenceNr
	 * @param context
	 * @param sequencenr
	 */
	public final void setSequenceNr(com.mendix.systemwideinterfaces.core.IContext context, Long sequencenr)
	{
		getMendixObject().setValue(context, MemberNames.SequenceNr.toString(), sequencenr);
	}

	/**
	 * @return value of Etag
	 */
	public final String getEtag()
	{
		return getEtag(getContext());
	}

	/**
	 * @param context
	 * @return value of Etag
	 */
	public final String getEtag(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Etag.toString());
	}

	/**
	 * Set value of Etag
	 * @param etag
	 */
	public final void setEtag(String etag)
	{
		setEtag(getContext(), etag);
	}

	/**
	 * Set value of Etag
	 * @param context
	 * @param etag
	 */
	public final void setEtag(com.mendix.systemwideinterfaces.core.IContext context, String etag)
	{
		getMendixObject().setValue(context, MemberNames.Etag.toString(), etag);
	}

	/**
	 * @return value of Json
	 */
	public final String getJson()
	{
		return getJson(getContext());
	}

	/**
	 * @param context
	 * @return value of Json
	 */
	public final String getJson(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Json.toString());
	}

	/**
	 * Set value of Json
	 * @param json
	 */
	public final void setJson(String json)
	{
		setJson(getContext(), json);
	}

	/**
	 * Set value of Json
	 * @param context
	 * @param json
	 */
	public final void setJson(com.mendix.systemwideinterfaces.core.IContext context, String json)
	{
		getMendixObject().setValue(context, MemberNames.Json.toString(), json);
	}

	/**
	 * @return value of IsDeleted
	 */
	public final Boolean getIsDeleted()
	{
		return getIsDeleted(getContext());
	}

	/**
	 * @param context
	 * @return value of IsDeleted
	 */
	public final Boolean getIsDeleted(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.IsDeleted.toString());
	}

	/**
	 * Set value of IsDeleted
	 * @param isdeleted
	 */
	public final void setIsDeleted(Boolean isdeleted)
	{
		setIsDeleted(getContext(), isdeleted);
	}

	/**
	 * Set value of IsDeleted
	 * @param context
	 * @param isdeleted
	 */
	public final void setIsDeleted(com.mendix.systemwideinterfaces.core.IContext context, Boolean isdeleted)
	{
		getMendixObject().setValue(context, MemberNames.IsDeleted.toString(), isdeleted);
	}

	/**
	 * @return value of _IsDirty
	 */
	public final Boolean get_IsDirty()
	{
		return get_IsDirty(getContext());
	}

	/**
	 * @param context
	 * @return value of _IsDirty
	 */
	public final Boolean get_IsDirty(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames._IsDirty.toString());
	}

	/**
	 * Set value of _IsDirty
	 * @param _isdirty
	 */
	public final void set_IsDirty(Boolean _isdirty)
	{
		set_IsDirty(getContext(), _isdirty);
	}

	/**
	 * Set value of _IsDirty
	 * @param context
	 * @param _isdirty
	 */
	public final void set_IsDirty(com.mendix.systemwideinterfaces.core.IContext context, Boolean _isdirty)
	{
		getMendixObject().setValue(context, MemberNames._IsDirty.toString(), _isdirty);
	}

	/**
	 * @return value of ChangeItem_ChangeLog
	 */
	public final restservices.proxies.ChangeLog getChangeItem_ChangeLog() throws com.mendix.core.CoreException
	{
		return getChangeItem_ChangeLog(getContext());
	}

	/**
	 * @param context
	 * @return value of ChangeItem_ChangeLog
	 */
	public final restservices.proxies.ChangeLog getChangeItem_ChangeLog(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		restservices.proxies.ChangeLog result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ChangeItem_ChangeLog.toString());
		if (identifier != null)
			result = restservices.proxies.ChangeLog.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ChangeItem_ChangeLog
	 * @param changeitem_changelog
	 */
	public final void setChangeItem_ChangeLog(restservices.proxies.ChangeLog changeitem_changelog)
	{
		setChangeItem_ChangeLog(getContext(), changeitem_changelog);
	}

	/**
	 * Set value of ChangeItem_ChangeLog
	 * @param context
	 * @param changeitem_changelog
	 */
	public final void setChangeItem_ChangeLog(com.mendix.systemwideinterfaces.core.IContext context, restservices.proxies.ChangeLog changeitem_changelog)
	{
		if (changeitem_changelog == null)
			getMendixObject().setValue(context, MemberNames.ChangeItem_ChangeLog.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ChangeItem_ChangeLog.toString(), changeitem_changelog.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return changeItemMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final restservices.proxies.ChangeItem that = (restservices.proxies.ChangeItem) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "RestServices.ChangeItem";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
