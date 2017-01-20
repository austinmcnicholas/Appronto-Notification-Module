// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class XASInstance
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject xASInstanceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.XASInstance";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		XASId("XASId"),
		LastUpdate("LastUpdate"),
		AllowedNumberOfConcurrentUsers("AllowedNumberOfConcurrentUsers"),
		PartnerName("PartnerName"),
		CustomerName("CustomerName");

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

	public XASInstance(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "System.XASInstance"));
	}

	protected XASInstance(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject xASInstanceMendixObject)
	{
		if (xASInstanceMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("System.XASInstance", xASInstanceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a System.XASInstance");

		this.xASInstanceMendixObject = xASInstanceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'XASInstance.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static system.proxies.XASInstance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return system.proxies.XASInstance.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static system.proxies.XASInstance initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new system.proxies.XASInstance(context, mendixObject);
	}

	public static system.proxies.XASInstance load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.XASInstance.initialize(context, mendixObject);
	}

	public static java.util.List<system.proxies.XASInstance> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<system.proxies.XASInstance> result = new java.util.ArrayList<system.proxies.XASInstance>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//System.XASInstance" + xpathConstraint))
			result.add(system.proxies.XASInstance.initialize(context, obj));
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
	 * @return value of XASId
	 */
	public final String getXASId()
	{
		return getXASId(getContext());
	}

	/**
	 * @param context
	 * @return value of XASId
	 */
	public final String getXASId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.XASId.toString());
	}

	/**
	 * Set value of XASId
	 * @param xasid
	 */
	public final void setXASId(String xasid)
	{
		setXASId(getContext(), xasid);
	}

	/**
	 * Set value of XASId
	 * @param context
	 * @param xasid
	 */
	public final void setXASId(com.mendix.systemwideinterfaces.core.IContext context, String xasid)
	{
		getMendixObject().setValue(context, MemberNames.XASId.toString(), xasid);
	}

	/**
	 * @return value of LastUpdate
	 */
	public final java.util.Date getLastUpdate()
	{
		return getLastUpdate(getContext());
	}

	/**
	 * @param context
	 * @return value of LastUpdate
	 */
	public final java.util.Date getLastUpdate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.LastUpdate.toString());
	}

	/**
	 * Set value of LastUpdate
	 * @param lastupdate
	 */
	public final void setLastUpdate(java.util.Date lastupdate)
	{
		setLastUpdate(getContext(), lastupdate);
	}

	/**
	 * Set value of LastUpdate
	 * @param context
	 * @param lastupdate
	 */
	public final void setLastUpdate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date lastupdate)
	{
		getMendixObject().setValue(context, MemberNames.LastUpdate.toString(), lastupdate);
	}

	/**
	 * @return value of AllowedNumberOfConcurrentUsers
	 */
	public final Integer getAllowedNumberOfConcurrentUsers()
	{
		return getAllowedNumberOfConcurrentUsers(getContext());
	}

	/**
	 * @param context
	 * @return value of AllowedNumberOfConcurrentUsers
	 */
	public final Integer getAllowedNumberOfConcurrentUsers(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.AllowedNumberOfConcurrentUsers.toString());
	}

	/**
	 * Set value of AllowedNumberOfConcurrentUsers
	 * @param allowednumberofconcurrentusers
	 */
	public final void setAllowedNumberOfConcurrentUsers(Integer allowednumberofconcurrentusers)
	{
		setAllowedNumberOfConcurrentUsers(getContext(), allowednumberofconcurrentusers);
	}

	/**
	 * Set value of AllowedNumberOfConcurrentUsers
	 * @param context
	 * @param allowednumberofconcurrentusers
	 */
	public final void setAllowedNumberOfConcurrentUsers(com.mendix.systemwideinterfaces.core.IContext context, Integer allowednumberofconcurrentusers)
	{
		getMendixObject().setValue(context, MemberNames.AllowedNumberOfConcurrentUsers.toString(), allowednumberofconcurrentusers);
	}

	/**
	 * @return value of PartnerName
	 */
	public final String getPartnerName()
	{
		return getPartnerName(getContext());
	}

	/**
	 * @param context
	 * @return value of PartnerName
	 */
	public final String getPartnerName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.PartnerName.toString());
	}

	/**
	 * Set value of PartnerName
	 * @param partnername
	 */
	public final void setPartnerName(String partnername)
	{
		setPartnerName(getContext(), partnername);
	}

	/**
	 * Set value of PartnerName
	 * @param context
	 * @param partnername
	 */
	public final void setPartnerName(com.mendix.systemwideinterfaces.core.IContext context, String partnername)
	{
		getMendixObject().setValue(context, MemberNames.PartnerName.toString(), partnername);
	}

	/**
	 * @return value of CustomerName
	 */
	public final String getCustomerName()
	{
		return getCustomerName(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerName
	 */
	public final String getCustomerName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.CustomerName.toString());
	}

	/**
	 * Set value of CustomerName
	 * @param customername
	 */
	public final void setCustomerName(String customername)
	{
		setCustomerName(getContext(), customername);
	}

	/**
	 * Set value of CustomerName
	 * @param context
	 * @param customername
	 */
	public final void setCustomerName(com.mendix.systemwideinterfaces.core.IContext context, String customername)
	{
		getMendixObject().setValue(context, MemberNames.CustomerName.toString(), customername);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return xASInstanceMendixObject;
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
			final system.proxies.XASInstance that = (system.proxies.XASInstance) obj;
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
		return "System.XASInstance";
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
