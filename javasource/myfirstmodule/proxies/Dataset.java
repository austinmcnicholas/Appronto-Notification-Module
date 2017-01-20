// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Dataset
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject datasetMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Dataset";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Color("Color"),
		Label("Label"),
		Sorting("Sorting"),
		value("value"),
		Dataset_Datapoint("MyFirstModule.Dataset_Datapoint");

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

	public Dataset(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Dataset"));
	}

	protected Dataset(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject datasetMendixObject)
	{
		if (datasetMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Dataset", datasetMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Dataset");

		this.datasetMendixObject = datasetMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Dataset.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Dataset initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Dataset.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Dataset initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Dataset(context, mendixObject);
	}

	public static myfirstmodule.proxies.Dataset load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Dataset.initialize(context, mendixObject);
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
	 * @return value of Color
	 */
	public final String getColor()
	{
		return getColor(getContext());
	}

	/**
	 * @param context
	 * @return value of Color
	 */
	public final String getColor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Color.toString());
	}

	/**
	 * Set value of Color
	 * @param color
	 */
	public final void setColor(String color)
	{
		setColor(getContext(), color);
	}

	/**
	 * Set value of Color
	 * @param context
	 * @param color
	 */
	public final void setColor(com.mendix.systemwideinterfaces.core.IContext context, String color)
	{
		getMendixObject().setValue(context, MemberNames.Color.toString(), color);
	}

	/**
	 * @return value of Label
	 */
	public final String getLabel()
	{
		return getLabel(getContext());
	}

	/**
	 * @param context
	 * @return value of Label
	 */
	public final String getLabel(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Label.toString());
	}

	/**
	 * Set value of Label
	 * @param label
	 */
	public final void setLabel(String label)
	{
		setLabel(getContext(), label);
	}

	/**
	 * Set value of Label
	 * @param context
	 * @param label
	 */
	public final void setLabel(com.mendix.systemwideinterfaces.core.IContext context, String label)
	{
		getMendixObject().setValue(context, MemberNames.Label.toString(), label);
	}

	/**
	 * @return value of Sorting
	 */
	public final Integer getSorting()
	{
		return getSorting(getContext());
	}

	/**
	 * @param context
	 * @return value of Sorting
	 */
	public final Integer getSorting(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.Sorting.toString());
	}

	/**
	 * Set value of Sorting
	 * @param sorting
	 */
	public final void setSorting(Integer sorting)
	{
		setSorting(getContext(), sorting);
	}

	/**
	 * Set value of Sorting
	 * @param context
	 * @param sorting
	 */
	public final void setSorting(com.mendix.systemwideinterfaces.core.IContext context, Integer sorting)
	{
		getMendixObject().setValue(context, MemberNames.Sorting.toString(), sorting);
	}

	/**
	 * @return value of value
	 */
	public final Integer getvalue()
	{
		return getvalue(getContext());
	}

	/**
	 * @param context
	 * @return value of value
	 */
	public final Integer getvalue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.value.toString());
	}

	/**
	 * Set value of value
	 * @param value
	 */
	public final void setvalue(Integer value)
	{
		setvalue(getContext(), value);
	}

	/**
	 * Set value of value
	 * @param context
	 * @param value
	 */
	public final void setvalue(com.mendix.systemwideinterfaces.core.IContext context, Integer value)
	{
		getMendixObject().setValue(context, MemberNames.value.toString(), value);
	}

	/**
	 * @return value of Dataset_Datapoint
	 */
	public final java.util.List<myfirstmodule.proxies.Datapoint> getDataset_Datapoint() throws com.mendix.core.CoreException
	{
		return getDataset_Datapoint(getContext());
	}

	/**
	 * @param context
	 * @return value of Dataset_Datapoint
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<myfirstmodule.proxies.Datapoint> getDataset_Datapoint(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Datapoint> result = new java.util.ArrayList<myfirstmodule.proxies.Datapoint>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Dataset_Datapoint.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(myfirstmodule.proxies.Datapoint.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Dataset_Datapoint
	 * @param dataset_datapoint
	 */
	public final void setDataset_Datapoint(java.util.List<myfirstmodule.proxies.Datapoint> dataset_datapoint)
	{
		setDataset_Datapoint(getContext(), dataset_datapoint);
	}

	/**
	 * Set value of Dataset_Datapoint
	 * @param context
	 * @param dataset_datapoint
	 */
	public final void setDataset_Datapoint(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<myfirstmodule.proxies.Datapoint> dataset_datapoint)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (myfirstmodule.proxies.Datapoint proxyObject : dataset_datapoint)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Dataset_Datapoint.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return datasetMendixObject;
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
			final myfirstmodule.proxies.Dataset that = (myfirstmodule.proxies.Dataset) obj;
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
		return "MyFirstModule.Dataset";
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
