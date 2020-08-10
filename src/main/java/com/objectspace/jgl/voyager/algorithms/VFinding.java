/**
 * VFinding.java
 * <p>
 * @version 1.0
 * @author generated by the objectspace voyager vcc 2.0 beta 1 utility.
 */

package com.objectspace.jgl.voyager.algorithms;

public class VFinding extends com.objectspace.voyager.VObject
  {
  private static final com.objectspace.voyager.util.Token __classname = new com.objectspace.voyager.util.Token( "com.objectspace.jgl.algorithms.Finding" );
  private static final com.objectspace.voyager.util.Token __class0 = new com.objectspace.voyager.util.Token( "find(Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Ljava.lang.Object;)Lcom.objectspace.jgl.InputIterator;" );
  private static final com.objectspace.voyager.util.Token __class1 = new com.objectspace.voyager.util.Token( "find(Lcom.objectspace.jgl.Container;Ljava.lang.Object;)Lcom.objectspace.jgl.InputIterator;" );
  private static final com.objectspace.voyager.util.Token __class2 = new com.objectspace.voyager.util.Token( "findIf(Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.UnaryPredicate;)Lcom.objectspace.jgl.InputIterator;" );
  private static final com.objectspace.voyager.util.Token __class3 = new com.objectspace.voyager.util.Token( "findIf(Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.UnaryPredicate;)Lcom.objectspace.jgl.InputIterator;" );
  private static final com.objectspace.voyager.util.Token __class4 = new com.objectspace.voyager.util.Token( "adjacentFind(Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;)Lcom.objectspace.jgl.InputIterator;" );
  private static final com.objectspace.voyager.util.Token __class5 = new com.objectspace.voyager.util.Token( "adjacentFind(Lcom.objectspace.jgl.Container;)Lcom.objectspace.jgl.InputIterator;" );
  private static final com.objectspace.voyager.util.Token __class6 = new com.objectspace.voyager.util.Token( "adjacentFind(Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.BinaryPredicate;)Lcom.objectspace.jgl.InputIterator;" );
  private static final com.objectspace.voyager.util.Token __class7 = new com.objectspace.voyager.util.Token( "adjacentFind(Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.BinaryPredicate;)Lcom.objectspace.jgl.InputIterator;" );
  private static final com.objectspace.voyager.util.Token __class8 = new com.objectspace.voyager.util.Token( "detect(Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.UnaryPredicate;)Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __class9 = new com.objectspace.voyager.util.Token( "detect(Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.UnaryPredicate;)Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __class10 = new com.objectspace.voyager.util.Token( "some(Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.UnaryPredicate;)Z" );
  private static final com.objectspace.voyager.util.Token __class11 = new com.objectspace.voyager.util.Token( "some(Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.UnaryPredicate;)Z" );
  private static final com.objectspace.voyager.util.Token __class12 = new com.objectspace.voyager.util.Token( "every(Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.InputIterator;Lcom.objectspace.jgl.UnaryPredicate;)Z" );
  private static final com.objectspace.voyager.util.Token __class13 = new com.objectspace.voyager.util.Token( "every(Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.UnaryPredicate;)Z" );
  
  static
    {
    __register( new VFinding() );
    }
  
  /**
   * Called to force static registration.
   */
  protected void __register()
    {
    }
  
  /**
   * Construct a VFinding that is not associated with an object.
   * This function is used internally by Voyager and should not
   * be invoked by user code. Any attempt to send a message to a
   * reference created using this default constructor will cause a
   * NullPointerException to be thrown.
   */
  public VFinding()
    {
    }
  
  public String getOriginalClassName()
    {
    return "com.objectspace.jgl.algorithms.Finding";
    }
  
  public boolean originalIsInterface()
    {
    return false;
    }
  
  /**
   * Construct a VFinding and connect it to the specified object.
   * @param reference A reference to the object to connect to.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VFinding( com.objectspace.voyager.space.VSubspace reference ) throws com.objectspace.voyager.VoyagerException
    {
    __connectTo( reference );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result find( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, Object arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class0, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result find( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, Object arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return find( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator find( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, Object arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.InputIterator) find( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator find( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, Object arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return find( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result find( com.objectspace.jgl.Container arg1, Object arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class1, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result find( com.objectspace.jgl.Container arg1, Object arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return find( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator find( com.objectspace.jgl.Container arg1, Object arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.InputIterator) find( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator find( com.objectspace.jgl.Container arg1, Object arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return find( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result findIf( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class2, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result findIf( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return findIf( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator findIf( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.InputIterator) findIf( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator findIf( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return findIf( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result findIf( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class3, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result findIf( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return findIf( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator findIf( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.InputIterator) findIf( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator findIf( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return findIf( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result adjacentFind( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class4, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result adjacentFind( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return adjacentFind( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator adjacentFind( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.InputIterator) adjacentFind( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator adjacentFind( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return adjacentFind( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result adjacentFind( com.objectspace.jgl.Container arg1, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    return __staticMethod( __address, __classname, __messenger, __class5, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result adjacentFind( com.objectspace.jgl.Container arg1, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return adjacentFind( arg1, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator adjacentFind( com.objectspace.jgl.Container arg1, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.InputIterator) adjacentFind( arg1, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator adjacentFind( com.objectspace.jgl.Container arg1, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return adjacentFind( arg1, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result adjacentFind( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.BinaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class6, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result adjacentFind( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.BinaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return adjacentFind( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator adjacentFind( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.BinaryPredicate arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.InputIterator) adjacentFind( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator adjacentFind( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.BinaryPredicate arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return adjacentFind( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result adjacentFind( com.objectspace.jgl.Container arg1, com.objectspace.jgl.BinaryPredicate arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class7, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result adjacentFind( com.objectspace.jgl.Container arg1, com.objectspace.jgl.BinaryPredicate arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return adjacentFind( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator adjacentFind( com.objectspace.jgl.Container arg1, com.objectspace.jgl.BinaryPredicate arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.InputIterator) adjacentFind( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.InputIterator adjacentFind( com.objectspace.jgl.Container arg1, com.objectspace.jgl.BinaryPredicate arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return adjacentFind( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result detect( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class8, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result detect( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return detect( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static Object detect( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return detect( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static Object detect( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return detect( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result detect( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class9, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result detect( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return detect( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static Object detect( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return detect( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static Object detect( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return detect( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result some( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class10, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result some( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return some( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean some( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return some( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).readBoolean();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean some( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return some( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result some( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class11, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result some( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return some( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean some( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return some( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).readBoolean();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean some( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return some( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result every( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class12, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result every( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return every( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean every( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return every( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).readBoolean();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean every( com.objectspace.jgl.InputIterator arg1, com.objectspace.jgl.InputIterator arg2, com.objectspace.jgl.UnaryPredicate arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return every( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result every( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class13, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result every( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return every( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean every( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return every( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).readBoolean();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static boolean every( com.objectspace.jgl.Container arg1, com.objectspace.jgl.UnaryPredicate arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return every( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  }
