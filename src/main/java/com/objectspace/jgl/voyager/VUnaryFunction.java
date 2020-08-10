/**
 * VUnaryFunction.java
 * <p>
 * @version 1.0
 * @author generated by the objectspace voyager vcc 2.0 beta 1 utility.
 */

package com.objectspace.jgl.voyager;

public class VUnaryFunction extends com.objectspace.voyager.VObject implements com.objectspace.jgl.UnaryFunction
  {
  private static final com.objectspace.voyager.util.Token __classname = new com.objectspace.voyager.util.Token( "com.objectspace.jgl.UnaryFunction" );
  private static final com.objectspace.voyager.util.Token __instance0 = new com.objectspace.voyager.util.Token( "execute(Ljava.lang.Object;)Ljava.lang.Object;" );
  
  static
    {
    __register( new VUnaryFunction() );
    }
  
  /**
   * Called to force static registration.
   */
  protected void __register()
    {
    }
  
  /**
   * Construct a VUnaryFunction that is not associated with an object.
   * This function is used internally by Voyager and should not
   * be invoked by user code. Any attempt to send a message to a
   * reference created using this default constructor will cause a
   * NullPointerException to be thrown.
   */
  public VUnaryFunction()
    {
    }
  
  public String getOriginalClassName()
    {
    return "com.objectspace.jgl.UnaryFunction";
    }
  
  public boolean originalIsInterface()
    {
    return true;
    }
  
  /**
   * Construct a VUnaryFunction and connect it to the specified object.
   * @param reference A reference to the object to connect to.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VUnaryFunction( com.objectspace.voyager.space.VSubspace reference ) throws com.objectspace.voyager.VoyagerException
    {
    __connectTo( reference );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result execute( Object arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance0 );
    }
  
  
  public Object execute( Object arg1 )
    {
    com.objectspace.voyager.message.Result __result = execute( arg1, __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  }
