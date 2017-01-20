// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class RandomGenerated
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject randomGeneratedMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.RandomGenerated";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		title("title"),
		first("first"),
		last("last"),
		fullname("fullname"),
		gender("gender"),
		username("username"),
		email("email"),
		phone("phone"),
		cell("cell"),
		picture("picture"),
		street("street"),
		city("city"),
		state("state"),
		zip("zip"),
		longitude("longitude"),
		latitude("latitude"),
		Attribute("Attribute"),
		GeoLocated("GeoLocated"),
		DateTime("DateTime");

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

	public RandomGenerated(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.RandomGenerated"));
	}

	protected RandomGenerated(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject randomGeneratedMendixObject)
	{
		if (randomGeneratedMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.RandomGenerated", randomGeneratedMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.RandomGenerated");

		this.randomGeneratedMendixObject = randomGeneratedMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'RandomGenerated.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.RandomGenerated initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.RandomGenerated.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.RandomGenerated initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.RandomGenerated(context, mendixObject);
	}

	public static myfirstmodule.proxies.RandomGenerated load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.RandomGenerated.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.RandomGenerated> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.RandomGenerated> result = new java.util.ArrayList<myfirstmodule.proxies.RandomGenerated>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.RandomGenerated" + xpathConstraint))
			result.add(myfirstmodule.proxies.RandomGenerated.initialize(context, obj));
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
	 * @return value of title
	 */
	public final String gettitle()
	{
		return gettitle(getContext());
	}

	/**
	 * @param context
	 * @return value of title
	 */
	public final String gettitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.title.toString());
	}

	/**
	 * Set value of title
	 * @param title
	 */
	public final void settitle(String title)
	{
		settitle(getContext(), title);
	}

	/**
	 * Set value of title
	 * @param context
	 * @param title
	 */
	public final void settitle(com.mendix.systemwideinterfaces.core.IContext context, String title)
	{
		getMendixObject().setValue(context, MemberNames.title.toString(), title);
	}

	/**
	 * @return value of first
	 */
	public final String getfirst()
	{
		return getfirst(getContext());
	}

	/**
	 * @param context
	 * @return value of first
	 */
	public final String getfirst(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.first.toString());
	}

	/**
	 * Set value of first
	 * @param first
	 */
	public final void setfirst(String first)
	{
		setfirst(getContext(), first);
	}

	/**
	 * Set value of first
	 * @param context
	 * @param first
	 */
	public final void setfirst(com.mendix.systemwideinterfaces.core.IContext context, String first)
	{
		getMendixObject().setValue(context, MemberNames.first.toString(), first);
	}

	/**
	 * @return value of last
	 */
	public final String getlast()
	{
		return getlast(getContext());
	}

	/**
	 * @param context
	 * @return value of last
	 */
	public final String getlast(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.last.toString());
	}

	/**
	 * Set value of last
	 * @param last
	 */
	public final void setlast(String last)
	{
		setlast(getContext(), last);
	}

	/**
	 * Set value of last
	 * @param context
	 * @param last
	 */
	public final void setlast(com.mendix.systemwideinterfaces.core.IContext context, String last)
	{
		getMendixObject().setValue(context, MemberNames.last.toString(), last);
	}

	/**
	 * @return value of fullname
	 */
	public final String getfullname()
	{
		return getfullname(getContext());
	}

	/**
	 * @param context
	 * @return value of fullname
	 */
	public final String getfullname(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.fullname.toString());
	}

	/**
	 * Set value of fullname
	 * @param fullname
	 */
	public final void setfullname(String fullname)
	{
		setfullname(getContext(), fullname);
	}

	/**
	 * Set value of fullname
	 * @param context
	 * @param fullname
	 */
	public final void setfullname(com.mendix.systemwideinterfaces.core.IContext context, String fullname)
	{
		getMendixObject().setValue(context, MemberNames.fullname.toString(), fullname);
	}

	/**
	 * @return value of gender
	 */
	public final String getgender()
	{
		return getgender(getContext());
	}

	/**
	 * @param context
	 * @return value of gender
	 */
	public final String getgender(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.gender.toString());
	}

	/**
	 * Set value of gender
	 * @param gender
	 */
	public final void setgender(String gender)
	{
		setgender(getContext(), gender);
	}

	/**
	 * Set value of gender
	 * @param context
	 * @param gender
	 */
	public final void setgender(com.mendix.systemwideinterfaces.core.IContext context, String gender)
	{
		getMendixObject().setValue(context, MemberNames.gender.toString(), gender);
	}

	/**
	 * @return value of username
	 */
	public final String getusername()
	{
		return getusername(getContext());
	}

	/**
	 * @param context
	 * @return value of username
	 */
	public final String getusername(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.username.toString());
	}

	/**
	 * Set value of username
	 * @param username
	 */
	public final void setusername(String username)
	{
		setusername(getContext(), username);
	}

	/**
	 * Set value of username
	 * @param context
	 * @param username
	 */
	public final void setusername(com.mendix.systemwideinterfaces.core.IContext context, String username)
	{
		getMendixObject().setValue(context, MemberNames.username.toString(), username);
	}

	/**
	 * @return value of email
	 */
	public final String getemail()
	{
		return getemail(getContext());
	}

	/**
	 * @param context
	 * @return value of email
	 */
	public final String getemail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.email.toString());
	}

	/**
	 * Set value of email
	 * @param email
	 */
	public final void setemail(String email)
	{
		setemail(getContext(), email);
	}

	/**
	 * Set value of email
	 * @param context
	 * @param email
	 */
	public final void setemail(com.mendix.systemwideinterfaces.core.IContext context, String email)
	{
		getMendixObject().setValue(context, MemberNames.email.toString(), email);
	}

	/**
	 * @return value of phone
	 */
	public final String getphone()
	{
		return getphone(getContext());
	}

	/**
	 * @param context
	 * @return value of phone
	 */
	public final String getphone(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.phone.toString());
	}

	/**
	 * Set value of phone
	 * @param phone
	 */
	public final void setphone(String phone)
	{
		setphone(getContext(), phone);
	}

	/**
	 * Set value of phone
	 * @param context
	 * @param phone
	 */
	public final void setphone(com.mendix.systemwideinterfaces.core.IContext context, String phone)
	{
		getMendixObject().setValue(context, MemberNames.phone.toString(), phone);
	}

	/**
	 * @return value of cell
	 */
	public final String getcell()
	{
		return getcell(getContext());
	}

	/**
	 * @param context
	 * @return value of cell
	 */
	public final String getcell(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.cell.toString());
	}

	/**
	 * Set value of cell
	 * @param cell
	 */
	public final void setcell(String cell)
	{
		setcell(getContext(), cell);
	}

	/**
	 * Set value of cell
	 * @param context
	 * @param cell
	 */
	public final void setcell(com.mendix.systemwideinterfaces.core.IContext context, String cell)
	{
		getMendixObject().setValue(context, MemberNames.cell.toString(), cell);
	}

	/**
	 * @return value of picture
	 */
	public final String getpicture()
	{
		return getpicture(getContext());
	}

	/**
	 * @param context
	 * @return value of picture
	 */
	public final String getpicture(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.picture.toString());
	}

	/**
	 * Set value of picture
	 * @param picture
	 */
	public final void setpicture(String picture)
	{
		setpicture(getContext(), picture);
	}

	/**
	 * Set value of picture
	 * @param context
	 * @param picture
	 */
	public final void setpicture(com.mendix.systemwideinterfaces.core.IContext context, String picture)
	{
		getMendixObject().setValue(context, MemberNames.picture.toString(), picture);
	}

	/**
	 * @return value of street
	 */
	public final String getstreet()
	{
		return getstreet(getContext());
	}

	/**
	 * @param context
	 * @return value of street
	 */
	public final String getstreet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.street.toString());
	}

	/**
	 * Set value of street
	 * @param street
	 */
	public final void setstreet(String street)
	{
		setstreet(getContext(), street);
	}

	/**
	 * Set value of street
	 * @param context
	 * @param street
	 */
	public final void setstreet(com.mendix.systemwideinterfaces.core.IContext context, String street)
	{
		getMendixObject().setValue(context, MemberNames.street.toString(), street);
	}

	/**
	 * @return value of city
	 */
	public final String getcity()
	{
		return getcity(getContext());
	}

	/**
	 * @param context
	 * @return value of city
	 */
	public final String getcity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.city.toString());
	}

	/**
	 * Set value of city
	 * @param city
	 */
	public final void setcity(String city)
	{
		setcity(getContext(), city);
	}

	/**
	 * Set value of city
	 * @param context
	 * @param city
	 */
	public final void setcity(com.mendix.systemwideinterfaces.core.IContext context, String city)
	{
		getMendixObject().setValue(context, MemberNames.city.toString(), city);
	}

	/**
	 * @return value of state
	 */
	public final String getstate()
	{
		return getstate(getContext());
	}

	/**
	 * @param context
	 * @return value of state
	 */
	public final String getstate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.state.toString());
	}

	/**
	 * Set value of state
	 * @param state
	 */
	public final void setstate(String state)
	{
		setstate(getContext(), state);
	}

	/**
	 * Set value of state
	 * @param context
	 * @param state
	 */
	public final void setstate(com.mendix.systemwideinterfaces.core.IContext context, String state)
	{
		getMendixObject().setValue(context, MemberNames.state.toString(), state);
	}

	/**
	 * @return value of zip
	 */
	public final String getzip()
	{
		return getzip(getContext());
	}

	/**
	 * @param context
	 * @return value of zip
	 */
	public final String getzip(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.zip.toString());
	}

	/**
	 * Set value of zip
	 * @param zip
	 */
	public final void setzip(String zip)
	{
		setzip(getContext(), zip);
	}

	/**
	 * Set value of zip
	 * @param context
	 * @param zip
	 */
	public final void setzip(com.mendix.systemwideinterfaces.core.IContext context, String zip)
	{
		getMendixObject().setValue(context, MemberNames.zip.toString(), zip);
	}

	/**
	 * @return value of longitude
	 */
	public final java.math.BigDecimal getlongitude()
	{
		return getlongitude(getContext());
	}

	/**
	 * @param context
	 * @return value of longitude
	 */
	public final java.math.BigDecimal getlongitude(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.longitude.toString());
	}

	/**
	 * Set value of longitude
	 * @param longitude
	 */
	public final void setlongitude(java.math.BigDecimal longitude)
	{
		setlongitude(getContext(), longitude);
	}

	/**
	 * Set value of longitude
	 * @param context
	 * @param longitude
	 */
	public final void setlongitude(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal longitude)
	{
		getMendixObject().setValue(context, MemberNames.longitude.toString(), longitude);
	}

	/**
	 * @return value of latitude
	 */
	public final java.math.BigDecimal getlatitude()
	{
		return getlatitude(getContext());
	}

	/**
	 * @param context
	 * @return value of latitude
	 */
	public final java.math.BigDecimal getlatitude(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.latitude.toString());
	}

	/**
	 * Set value of latitude
	 * @param latitude
	 */
	public final void setlatitude(java.math.BigDecimal latitude)
	{
		setlatitude(getContext(), latitude);
	}

	/**
	 * Set value of latitude
	 * @param context
	 * @param latitude
	 */
	public final void setlatitude(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal latitude)
	{
		getMendixObject().setValue(context, MemberNames.latitude.toString(), latitude);
	}

	/**
	 * Set value of Attribute
	 * @param attribute
	 */
	public final myfirstmodule.proxies.Enum_Status getAttribute()
	{
		return getAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of Attribute
	 */
	public final myfirstmodule.proxies.Enum_Status getAttribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Attribute.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Enum_Status.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Attribute
	 * @param attribute
	 */
	public final void setAttribute(myfirstmodule.proxies.Enum_Status attribute)
	{
		setAttribute(getContext(), attribute);
	}

	/**
	 * Set value of Attribute
	 * @param context
	 * @param attribute
	 */
	public final void setAttribute(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Enum_Status attribute)
	{
		if (attribute != null)
			getMendixObject().setValue(context, MemberNames.Attribute.toString(), attribute.toString());
		else
			getMendixObject().setValue(context, MemberNames.Attribute.toString(), null);
	}

	/**
	 * @return value of GeoLocated
	 */
	public final Boolean getGeoLocated()
	{
		return getGeoLocated(getContext());
	}

	/**
	 * @param context
	 * @return value of GeoLocated
	 */
	public final Boolean getGeoLocated(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.GeoLocated.toString());
	}

	/**
	 * Set value of GeoLocated
	 * @param geolocated
	 */
	public final void setGeoLocated(Boolean geolocated)
	{
		setGeoLocated(getContext(), geolocated);
	}

	/**
	 * Set value of GeoLocated
	 * @param context
	 * @param geolocated
	 */
	public final void setGeoLocated(com.mendix.systemwideinterfaces.core.IContext context, Boolean geolocated)
	{
		getMendixObject().setValue(context, MemberNames.GeoLocated.toString(), geolocated);
	}

	/**
	 * @return value of DateTime
	 */
	public final java.util.Date getDateTime()
	{
		return getDateTime(getContext());
	}

	/**
	 * @param context
	 * @return value of DateTime
	 */
	public final java.util.Date getDateTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateTime.toString());
	}

	/**
	 * Set value of DateTime
	 * @param datetime
	 */
	public final void setDateTime(java.util.Date datetime)
	{
		setDateTime(getContext(), datetime);
	}

	/**
	 * Set value of DateTime
	 * @param context
	 * @param datetime
	 */
	public final void setDateTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date datetime)
	{
		getMendixObject().setValue(context, MemberNames.DateTime.toString(), datetime);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return randomGeneratedMendixObject;
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
			final myfirstmodule.proxies.RandomGenerated that = (myfirstmodule.proxies.RandomGenerated) obj;
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
		return "MyFirstModule.RandomGenerated";
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
