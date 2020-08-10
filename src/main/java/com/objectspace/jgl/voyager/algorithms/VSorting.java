/**
 * VSorting.java
 * <p>
 * @version 1.0
 * @author generated by the objectspace voyager vcc 2.0 beta 1 utility.
 */

package com.objectspace.jgl.voyager.algorithms;

public class VSorting extends com.objectspace.voyager.VObject
  {
  private static final com.objectspace.voyager.util.Token __classname = new com.objectspace.voyager.util.Token( "com.objectspace.jgl.algorithms.Sorting" );
  private static final com.objectspace.voyager.util.Token __class0 = new com.objectspace.voyager.util.Token( "sort(Lcom.objectspace.jgl.ForwardIterator;Lcom.objectspace.jgl.ForwardIterator;)V" );
  private static final com.objectspace.voyager.util.Token __class1 = new com.objectspace.voyager.util.Token( "sort(Lcom.objectspace.jgl.ForwardIterator;Lcom.objectspace.jgl.ForwardIterator;Lcom.objectspace.jgl.BinaryPredicate;)V" );
  private static final com.objectspace.voyager.util.Token __class2 = new com.objectspace.voyager.util.Token( "sort(Lcom.objectspace.jgl.Sequence;)V" );
  private static final com.objectspace.voyager.util.Token __class3 = new com.objectspace.voyager.util.Token( "sort(Lcom.objectspace.jgl.Sequence;Lcom.objectspace.jgl.BinaryPredicate;)V" );
  private static final com.objectspace.voyager.util.Token __class4 = new com.objectspace.voyager.util.Token( "iterSort(Lcom.objectspace.jgl.Container;)Lcom.objectspace.jgl.Range;" );
  private static final com.objectspace.voyager.util.Token __class5 = new com.objectspace.voyager.util.Token( "iterSort(Lcom.objectspace.jgl.Container;Lcom.objectspace.jgl.BinaryPredicate;)Lcom.objectspace.jgl.Range;" );
  private static final com.objectspace.voyager.util.Token __class6 = new com.objectspace.voyager.util.Token( "iterSort(Lcom.objectspace.jgl.ForwardIterator;Lcom.objectspace.jgl.ForwardIterator;)Lcom.objectspace.jgl.Range;" );
  private static final com.objectspace.voyager.util.Token __class7 = new com.objectspace.voyager.util.Token( "iterSort(Lcom.objectspace.jgl.ForwardIterator;Lcom.objectspace.jgl.ForwardIterator;Lcom.objectspace.jgl.BinaryPredicate;)Lcom.objectspace.jgl.Range;" );
  
  static
    {
    __register( new VSorting() );
    }
  
  /**
   * Called to force static registration.
   */
  protected void __register()
    {
    }
  
  /**
   * Construct a VSorting that is not associated with an object.
   * This function is used internally by Voyager and should not
   * be invoked by user code. Any attempt to send a message to a
   * reference created using this default constructor will cause a
   * NullPointerException to be thrown.
   */
  public VSorting()
    {
    }
  
  public String getOriginalClassName()
    {
    return "com.objectspace.jgl.algorithms.Sorting";
    }
  
  public boolean originalIsInterface()
    {
    return false;
    }
  
  /**
   * Construct a VSorting and connect it to the specified object.
   * @param reference A reference to the object to connect to.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VSorting( com.objectspace.voyager.space.VSubspace reference ) throws com.objectspace.voyager.VoyagerException
    {
    __connectTo( reference );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result sort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class0, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result sort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return sort( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void sort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    sort( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).rethrowException();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void sort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    sort( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result sort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, com.objectspace.jgl.BinaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class1, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result sort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, com.objectspace.jgl.BinaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return sort( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void sort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, com.objectspace.jgl.BinaryPredicate arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    sort( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).rethrowException();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void sort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, com.objectspace.jgl.BinaryPredicate arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    sort( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result sort( com.objectspace.jgl.Sequence arg1, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    return __staticMethod( __address, __classname, __messenger, __class2, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result sort( com.objectspace.jgl.Sequence arg1, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return sort( arg1, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void sort( com.objectspace.jgl.Sequence arg1, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    sort( arg1, __newStaticDefaultMessenger(), __address, __timeout ).rethrowException();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void sort( com.objectspace.jgl.Sequence arg1, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    sort( arg1, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result sort( com.objectspace.jgl.Sequence arg1, com.objectspace.jgl.BinaryPredicate arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
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
  public static com.objectspace.voyager.message.Result sort( com.objectspace.jgl.Sequence arg1, com.objectspace.jgl.BinaryPredicate arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return sort( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void sort( com.objectspace.jgl.Sequence arg1, com.objectspace.jgl.BinaryPredicate arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    sort( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).rethrowException();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static void sort( com.objectspace.jgl.Sequence arg1, com.objectspace.jgl.BinaryPredicate arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    sort( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result iterSort( com.objectspace.jgl.Container arg1, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    return __staticMethod( __address, __classname, __messenger, __class4, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result iterSort( com.objectspace.jgl.Container arg1, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return iterSort( arg1, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Range iterSort( com.objectspace.jgl.Container arg1, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.Range) iterSort( arg1, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Range iterSort( com.objectspace.jgl.Container arg1, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return iterSort( arg1, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result iterSort( com.objectspace.jgl.Container arg1, com.objectspace.jgl.BinaryPredicate arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class5, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result iterSort( com.objectspace.jgl.Container arg1, com.objectspace.jgl.BinaryPredicate arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return iterSort( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Range iterSort( com.objectspace.jgl.Container arg1, com.objectspace.jgl.BinaryPredicate arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.Range) iterSort( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Range iterSort( com.objectspace.jgl.Container arg1, com.objectspace.jgl.BinaryPredicate arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return iterSort( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result iterSort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __staticMethod( __address, __classname, __messenger, __class6, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result iterSort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return iterSort( arg1, arg2, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Range iterSort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.Range) iterSort( arg1, arg2, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Range iterSort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return iterSort( arg1, arg2, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result iterSort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, com.objectspace.jgl.BinaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    __messenger.writeObject( arg3 );
    return __staticMethod( __address, __classname, __messenger, __class7, __timeout );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method.
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.voyager.message.Result iterSort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, com.objectspace.jgl.BinaryPredicate arg3, com.objectspace.voyager.message.Messenger __messenger, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return iterSort( arg1, arg2, arg3, __messenger, __address, __DEFAULT_TIMEOUT );
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @param __timeout The timeout valie in milliseconds.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Range iterSort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, com.objectspace.jgl.BinaryPredicate arg3, String __address, long __timeout ) throws com.objectspace.voyager.VoyagerException
    {
    return (com.objectspace.jgl.Range) iterSort( arg1, arg2, arg3, __newStaticDefaultMessenger(), __address, __timeout ).readObject();
    }
  
    /**
   * @param __address The address of the program that contains the class.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public static com.objectspace.jgl.Range iterSort( com.objectspace.jgl.ForwardIterator arg1, com.objectspace.jgl.ForwardIterator arg2, com.objectspace.jgl.BinaryPredicate arg3, String __address ) throws com.objectspace.voyager.VoyagerException
    {
    return iterSort( arg1, arg2, arg3, __address, __DEFAULT_TIMEOUT );
    }
  }
