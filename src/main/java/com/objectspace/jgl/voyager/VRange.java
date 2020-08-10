/**
 * VRange.java
 * <p>
 * @version 1.0
 * @author generated by the objectspace voyager vcc 2.0 beta 1 utility.
 */

package com.objectspace.jgl.voyager;

public class VRange extends com.objectspace.voyager.VObject
  {
  private static final com.objectspace.voyager.util.Token __classname = new com.objectspace.voyager.util.Token( "com.objectspace.jgl.Range" );
  private static final com.objectspace.voyager.util.Token __class0 = new com.objectspace.voyager.util.Token( "<init>(Lcom.objectspace.jgl.ForwardIterator;Lcom.objectspace.jgl.ForwardIterator;)" );
  private static final com.objectspace.voyager.util.Token __class1 = new com.objectspace.voyager.util.Token( "<init>()" );
  private static final com.objectspace.voyager.util.Token __instance0 = new com.objectspace.voyager.util.Token( "toString()Ljava.lang.String;" );
  private static final com.objectspace.voyager.util.Token __instance1 = new com.objectspace.voyager.util.Token( "equals(Lcom.objectspace.jgl.Range;)Z" );
  
  static
    {
    __register( new VRange() );
    }
  
  /**
   * Called to force static registration.
   */
  protected void __register()
    {
    }
  
  /**
   * Construct a VRange that is not associated with an object.
   * This function is used internally by Voyager and should not
   * be invoked by user code. Any attempt to send a message to a
   * reference created using this default constructor will cause a
   * NullPointerException to be thrown.
   */
  public VRange()
    {
    }
  
  public String getOriginalClassName()
    {
    return "com.objectspace.jgl.Range";
    }
  
  public boolean originalIsInterface()
    {
    return false;
    }
  
  /**
   * Construct a VRange and connect it to the specified object.
   * @param reference A reference to the object to connect to.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VRange( com.objectspace.voyager.space.VSubspace reference ) throws com.objectspace.voyager.VoyagerException
    {
    __connectTo( reference );
    }
  
    /**
   * @param __address The address of the program where the instantiation should occur.
   * @param __timeout The timeout value in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VRange( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    com.objectspace.voyager.message.Messenger __messenger = __newConstructorDefaultMessenger();
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __constructor( __address, __classname, __messenger, __class0, __timeout );
    }
  
    /**
   * @param __address The address of the program where the instantiation should occur.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VRange( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    this( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program where the instantiation should occur.
   * @param __timeout The timeout value in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VRange( String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    com.objectspace.voyager.message.Messenger __messenger = __newConstructorDefaultMessenger();
    __constructor( __address, __classname, __messenger, __class1, __timeout );
    }
  
    /**
   * @param __address The address of the program where the instantiation should occur.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VRange( String __address ) throws com.objectspace.voyager.VoyagerException
    {
    this( __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result toString( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance0 );
    }
  
  
  public String toString()
    {
    com.objectspace.voyager.message.Result __result = toString( __newDefaultMessenger() );
    return (String) __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result equals( com.objectspace.jgl.Range arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance1 );
    }
  
    /**
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public boolean equals( com.objectspace.jgl.Range arg1 ) throws com.objectspace.voyager.VoyagerException
    {
    com.objectspace.voyager.message.Result __result = equals( arg1, __newDefaultMessenger() );
    return __result.readBoolean();
    }
  }
