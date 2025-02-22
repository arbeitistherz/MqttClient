// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mqttclient.proxies;

/**
 * Entity to specify payload to be published for testing.
 */
public class PublishTester
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject publishTesterMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MqttClient.PublishTester";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Payload("Payload"),
		PublishTester_MqttConfig("MqttClient.PublishTester_MqttConfig");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public PublishTester(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MqttClient.PublishTester"));
	}

	protected PublishTester(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject publishTesterMendixObject)
	{
		if (publishTesterMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MqttClient.PublishTester", publishTesterMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MqttClient.PublishTester");

		this.publishTesterMendixObject = publishTesterMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'PublishTester.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mqttclient.proxies.PublishTester initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mqttclient.proxies.PublishTester.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mqttclient.proxies.PublishTester initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mqttclient.proxies.PublishTester(context, mendixObject);
	}

	public static mqttclient.proxies.PublishTester load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mqttclient.proxies.PublishTester.initialize(context, mendixObject);
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
	 * @return value of Payload
	 */
	public final java.lang.String getPayload()
	{
		return getPayload(getContext());
	}

	/**
	 * @param context
	 * @return value of Payload
	 */
	public final java.lang.String getPayload(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Payload.toString());
	}

	/**
	 * Set value of Payload
	 * @param payload
	 */
	public final void setPayload(java.lang.String payload)
	{
		setPayload(getContext(), payload);
	}

	/**
	 * Set value of Payload
	 * @param context
	 * @param payload
	 */
	public final void setPayload(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String payload)
	{
		getMendixObject().setValue(context, MemberNames.Payload.toString(), payload);
	}

	/**
	 * @return value of PublishTester_MqttConfig
	 */
	public final mqttclient.proxies.MqttConfig getPublishTester_MqttConfig() throws com.mendix.core.CoreException
	{
		return getPublishTester_MqttConfig(getContext());
	}

	/**
	 * @param context
	 * @return value of PublishTester_MqttConfig
	 */
	public final mqttclient.proxies.MqttConfig getPublishTester_MqttConfig(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mqttclient.proxies.MqttConfig result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PublishTester_MqttConfig.toString());
		if (identifier != null)
			result = mqttclient.proxies.MqttConfig.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PublishTester_MqttConfig
	 * @param publishtester_mqttconfig
	 */
	public final void setPublishTester_MqttConfig(mqttclient.proxies.MqttConfig publishtester_mqttconfig)
	{
		setPublishTester_MqttConfig(getContext(), publishtester_mqttconfig);
	}

	/**
	 * Set value of PublishTester_MqttConfig
	 * @param context
	 * @param publishtester_mqttconfig
	 */
	public final void setPublishTester_MqttConfig(com.mendix.systemwideinterfaces.core.IContext context, mqttclient.proxies.MqttConfig publishtester_mqttconfig)
	{
		if (publishtester_mqttconfig == null)
			getMendixObject().setValue(context, MemberNames.PublishTester_MqttConfig.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PublishTester_MqttConfig.toString(), publishtester_mqttconfig.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return publishTesterMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mqttclient.proxies.PublishTester that = (mqttclient.proxies.PublishTester) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MqttClient.PublishTester";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
