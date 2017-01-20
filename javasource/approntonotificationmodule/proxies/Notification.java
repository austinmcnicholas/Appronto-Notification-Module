// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package approntonotificationmodule.proxies;

public class Notification
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject notificationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ApprontoNotificationModule.Notification";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ShowNotification("ShowNotification"),
		Message("Message"),
		NotificationType("NotificationType"),
		NotificationTypeText("NotificationTypeText"),
		NotificationLayoutText("NotificationLayoutText"),
		Timeout("Timeout"),
		NotificationLayout("NotificationLayout"),
		Notification_Session("ApprontoNotificationModule.Notification_Session");

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

	public Notification(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ApprontoNotificationModule.Notification"));
	}

	protected Notification(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject notificationMendixObject)
	{
		if (notificationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ApprontoNotificationModule.Notification", notificationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ApprontoNotificationModule.Notification");

		this.notificationMendixObject = notificationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Notification.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static approntonotificationmodule.proxies.Notification initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return approntonotificationmodule.proxies.Notification.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static approntonotificationmodule.proxies.Notification initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new approntonotificationmodule.proxies.Notification(context, mendixObject);
	}

	public static approntonotificationmodule.proxies.Notification load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return approntonotificationmodule.proxies.Notification.initialize(context, mendixObject);
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
	 * @return value of ShowNotification
	 */
	public final Boolean getShowNotification()
	{
		return getShowNotification(getContext());
	}

	/**
	 * @param context
	 * @return value of ShowNotification
	 */
	public final Boolean getShowNotification(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.ShowNotification.toString());
	}

	/**
	 * Set value of ShowNotification
	 * @param shownotification
	 */
	public final void setShowNotification(Boolean shownotification)
	{
		setShowNotification(getContext(), shownotification);
	}

	/**
	 * Set value of ShowNotification
	 * @param context
	 * @param shownotification
	 */
	public final void setShowNotification(com.mendix.systemwideinterfaces.core.IContext context, Boolean shownotification)
	{
		getMendixObject().setValue(context, MemberNames.ShowNotification.toString(), shownotification);
	}

	/**
	 * @return value of Message
	 */
	public final String getMessage()
	{
		return getMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of Message
	 */
	public final String getMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Message.toString());
	}

	/**
	 * Set value of Message
	 * @param message
	 */
	public final void setMessage(String message)
	{
		setMessage(getContext(), message);
	}

	/**
	 * Set value of Message
	 * @param context
	 * @param message
	 */
	public final void setMessage(com.mendix.systemwideinterfaces.core.IContext context, String message)
	{
		getMendixObject().setValue(context, MemberNames.Message.toString(), message);
	}

	/**
	 * Set value of NotificationType
	 * @param notificationtype
	 */
	public final approntonotificationmodule.proxies.Enum_NotificationType getNotificationType()
	{
		return getNotificationType(getContext());
	}

	/**
	 * @param context
	 * @return value of NotificationType
	 */
	public final approntonotificationmodule.proxies.Enum_NotificationType getNotificationType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.NotificationType.toString());
		if (obj == null)
			return null;

		return approntonotificationmodule.proxies.Enum_NotificationType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of NotificationType
	 * @param notificationtype
	 */
	public final void setNotificationType(approntonotificationmodule.proxies.Enum_NotificationType notificationtype)
	{
		setNotificationType(getContext(), notificationtype);
	}

	/**
	 * Set value of NotificationType
	 * @param context
	 * @param notificationtype
	 */
	public final void setNotificationType(com.mendix.systemwideinterfaces.core.IContext context, approntonotificationmodule.proxies.Enum_NotificationType notificationtype)
	{
		if (notificationtype != null)
			getMendixObject().setValue(context, MemberNames.NotificationType.toString(), notificationtype.toString());
		else
			getMendixObject().setValue(context, MemberNames.NotificationType.toString(), null);
	}

	/**
	 * @return value of NotificationTypeText
	 */
	public final String getNotificationTypeText()
	{
		return getNotificationTypeText(getContext());
	}

	/**
	 * @param context
	 * @return value of NotificationTypeText
	 */
	public final String getNotificationTypeText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.NotificationTypeText.toString());
	}

	/**
	 * Set value of NotificationTypeText
	 * @param notificationtypetext
	 */
	public final void setNotificationTypeText(String notificationtypetext)
	{
		setNotificationTypeText(getContext(), notificationtypetext);
	}

	/**
	 * Set value of NotificationTypeText
	 * @param context
	 * @param notificationtypetext
	 */
	public final void setNotificationTypeText(com.mendix.systemwideinterfaces.core.IContext context, String notificationtypetext)
	{
		getMendixObject().setValue(context, MemberNames.NotificationTypeText.toString(), notificationtypetext);
	}

	/**
	 * @return value of NotificationLayoutText
	 */
	public final String getNotificationLayoutText()
	{
		return getNotificationLayoutText(getContext());
	}

	/**
	 * @param context
	 * @return value of NotificationLayoutText
	 */
	public final String getNotificationLayoutText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.NotificationLayoutText.toString());
	}

	/**
	 * Set value of NotificationLayoutText
	 * @param notificationlayouttext
	 */
	public final void setNotificationLayoutText(String notificationlayouttext)
	{
		setNotificationLayoutText(getContext(), notificationlayouttext);
	}

	/**
	 * Set value of NotificationLayoutText
	 * @param context
	 * @param notificationlayouttext
	 */
	public final void setNotificationLayoutText(com.mendix.systemwideinterfaces.core.IContext context, String notificationlayouttext)
	{
		getMendixObject().setValue(context, MemberNames.NotificationLayoutText.toString(), notificationlayouttext);
	}

	/**
	 * @return value of Timeout
	 */
	public final Long getTimeout()
	{
		return getTimeout(getContext());
	}

	/**
	 * @param context
	 * @return value of Timeout
	 */
	public final Long getTimeout(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.Timeout.toString());
	}

	/**
	 * Set value of Timeout
	 * @param timeout
	 */
	public final void setTimeout(Long timeout)
	{
		setTimeout(getContext(), timeout);
	}

	/**
	 * Set value of Timeout
	 * @param context
	 * @param timeout
	 */
	public final void setTimeout(com.mendix.systemwideinterfaces.core.IContext context, Long timeout)
	{
		getMendixObject().setValue(context, MemberNames.Timeout.toString(), timeout);
	}

	/**
	 * Set value of NotificationLayout
	 * @param notificationlayout
	 */
	public final approntonotificationmodule.proxies.Enum_Layout getNotificationLayout()
	{
		return getNotificationLayout(getContext());
	}

	/**
	 * @param context
	 * @return value of NotificationLayout
	 */
	public final approntonotificationmodule.proxies.Enum_Layout getNotificationLayout(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.NotificationLayout.toString());
		if (obj == null)
			return null;

		return approntonotificationmodule.proxies.Enum_Layout.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of NotificationLayout
	 * @param notificationlayout
	 */
	public final void setNotificationLayout(approntonotificationmodule.proxies.Enum_Layout notificationlayout)
	{
		setNotificationLayout(getContext(), notificationlayout);
	}

	/**
	 * Set value of NotificationLayout
	 * @param context
	 * @param notificationlayout
	 */
	public final void setNotificationLayout(com.mendix.systemwideinterfaces.core.IContext context, approntonotificationmodule.proxies.Enum_Layout notificationlayout)
	{
		if (notificationlayout != null)
			getMendixObject().setValue(context, MemberNames.NotificationLayout.toString(), notificationlayout.toString());
		else
			getMendixObject().setValue(context, MemberNames.NotificationLayout.toString(), null);
	}

	/**
	 * @return value of Notification_Session
	 */
	public final system.proxies.Session getNotification_Session() throws com.mendix.core.CoreException
	{
		return getNotification_Session(getContext());
	}

	/**
	 * @param context
	 * @return value of Notification_Session
	 */
	public final system.proxies.Session getNotification_Session(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.Session result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Notification_Session.toString());
		if (identifier != null)
			result = system.proxies.Session.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Notification_Session
	 * @param notification_session
	 */
	public final void setNotification_Session(system.proxies.Session notification_session)
	{
		setNotification_Session(getContext(), notification_session);
	}

	/**
	 * Set value of Notification_Session
	 * @param context
	 * @param notification_session
	 */
	public final void setNotification_Session(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.Session notification_session)
	{
		if (notification_session == null)
			getMendixObject().setValue(context, MemberNames.Notification_Session.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Notification_Session.toString(), notification_session.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return notificationMendixObject;
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
			final approntonotificationmodule.proxies.Notification that = (approntonotificationmodule.proxies.Notification) obj;
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
		return "ApprontoNotificationModule.Notification";
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
