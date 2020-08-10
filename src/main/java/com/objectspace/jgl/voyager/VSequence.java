/**
 * VSequence.java
 * <p>
 * @version 1.0
 * @author generated by the objectspace voyager vcc 2.0 beta 1 utility.
 */

package com.objectspace.jgl.voyager;

public class VSequence extends com.objectspace.voyager.VObject implements com.objectspace.jgl.Sequence
  {
  private static final com.objectspace.voyager.util.Token __classname = new com.objectspace.voyager.util.Token( "com.objectspace.jgl.Sequence" );
  private static final com.objectspace.voyager.util.Token __instance0 = new com.objectspace.voyager.util.Token( "clone()Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance1 = new com.objectspace.voyager.util.Token( "at(I)Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance2 = new com.objectspace.voyager.util.Token( "put(ILjava.lang.Object;)V" );
  private static final com.objectspace.voyager.util.Token __instance3 = new com.objectspace.voyager.util.Token( "back()Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance4 = new com.objectspace.voyager.util.Token( "front()Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance5 = new com.objectspace.voyager.util.Token( "pushFront(Ljava.lang.Object;)V" );
  private static final com.objectspace.voyager.util.Token __instance6 = new com.objectspace.voyager.util.Token( "popFront()Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance7 = new com.objectspace.voyager.util.Token( "pushBack(Ljava.lang.Object;)V" );
  private static final com.objectspace.voyager.util.Token __instance8 = new com.objectspace.voyager.util.Token( "popBack()Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance9 = new com.objectspace.voyager.util.Token( "remove(Ljava.lang.Object;)I" );
  private static final com.objectspace.voyager.util.Token __instance10 = new com.objectspace.voyager.util.Token( "remove(Ljava.util.Enumeration;)Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance11 = new com.objectspace.voyager.util.Token( "remove(Ljava.lang.Object;I)I" );
  private static final com.objectspace.voyager.util.Token __instance12 = new com.objectspace.voyager.util.Token( "remove(IILjava.lang.Object;)I" );
  private static final com.objectspace.voyager.util.Token __instance13 = new com.objectspace.voyager.util.Token( "count(Ljava.lang.Object;)I" );
  private static final com.objectspace.voyager.util.Token __instance14 = new com.objectspace.voyager.util.Token( "count(IILjava.lang.Object;)I" );
  private static final com.objectspace.voyager.util.Token __instance15 = new com.objectspace.voyager.util.Token( "replace(Ljava.lang.Object;Ljava.lang.Object;)I" );
  private static final com.objectspace.voyager.util.Token __instance16 = new com.objectspace.voyager.util.Token( "replace(IILjava.lang.Object;Ljava.lang.Object;)I" );
  private static final com.objectspace.voyager.util.Token __instance17 = new com.objectspace.voyager.util.Token( "contains(Ljava.lang.Object;)Z" );
  private static final com.objectspace.voyager.util.Token __instance18 = new com.objectspace.voyager.util.Token( "indexOf(Ljava.lang.Object;)I" );
  private static final com.objectspace.voyager.util.Token __instance19 = new com.objectspace.voyager.util.Token( "indexOf(IILjava.lang.Object;)I" );
  private static final com.objectspace.voyager.util.Token __instance20 = new com.objectspace.voyager.util.Token( "toString()Ljava.lang.String;" );
  private static final com.objectspace.voyager.util.Token __instance21 = new com.objectspace.voyager.util.Token( "size()I" );
  private static final com.objectspace.voyager.util.Token __instance22 = new com.objectspace.voyager.util.Token( "maxSize()I" );
  private static final com.objectspace.voyager.util.Token __instance23 = new com.objectspace.voyager.util.Token( "isEmpty()Z" );
  private static final com.objectspace.voyager.util.Token __instance24 = new com.objectspace.voyager.util.Token( "clear()V" );
  private static final com.objectspace.voyager.util.Token __instance25 = new com.objectspace.voyager.util.Token( "elements()Ljava.util.Enumeration;" );
  private static final com.objectspace.voyager.util.Token __instance26 = new com.objectspace.voyager.util.Token( "start()Lcom.objectspace.jgl.ForwardIterator;" );
  private static final com.objectspace.voyager.util.Token __instance27 = new com.objectspace.voyager.util.Token( "finish()Lcom.objectspace.jgl.ForwardIterator;" );
  private static final com.objectspace.voyager.util.Token __instance28 = new com.objectspace.voyager.util.Token( "add(Ljava.lang.Object;)Ljava.lang.Object;" );
  private static final com.objectspace.voyager.util.Token __instance29 = new com.objectspace.voyager.util.Token( "remove(Ljava.util.Enumeration;Ljava.util.Enumeration;)I" );
  
  static
    {
    __register( new VSequence() );
    }
  
  /**
   * Called to force static registration.
   */
  protected void __register()
    {
    }
  
  /**
   * Construct a VSequence that is not associated with an object.
   * This function is used internally by Voyager and should not
   * be invoked by user code. Any attempt to send a message to a
   * reference created using this default constructor will cause a
   * NullPointerException to be thrown.
   */
  public VSequence()
    {
    }
  
  public String getOriginalClassName()
    {
    return "com.objectspace.jgl.Sequence";
    }
  
  public boolean originalIsInterface()
    {
    return true;
    }
  
  /**
   * Construct a VSequence and connect it to the specified object.
   * @param reference A reference to the object to connect to.
   * @exception com.objectspace.voyager.VoyagerException A voyager-related exception occurred.
   */
  public VSequence( com.objectspace.voyager.space.VSubspace reference ) throws com.objectspace.voyager.VoyagerException
    {
    __connectTo( reference );
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result clone( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance0 );
    }
  
  
  public Object clone()
    {
    com.objectspace.voyager.message.Result __result = clone( __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result at( int arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeInt( arg1 );
    return __instanceMethod( __messenger, __instance1 );
    }
  
  
  public Object at( int arg1 )
    {
    com.objectspace.voyager.message.Result __result = at( arg1, __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result put( int arg1, Object arg2, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeInt( arg1 );
    __messenger.writeObject( arg2 );
    return __instanceMethod( __messenger, __instance2 );
    }
  
  
  public void put( int arg1, Object arg2 )
    {
    com.objectspace.voyager.message.Result __result = put( arg1, arg2, __newDefaultMessenger() );
    __result.rethrowExceptionRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result back( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance3 );
    }
  
  
  public Object back()
    {
    com.objectspace.voyager.message.Result __result = back( __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result front( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance4 );
    }
  
  
  public Object front()
    {
    com.objectspace.voyager.message.Result __result = front( __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result pushFront( Object arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance5 );
    }
  
  
  public void pushFront( Object arg1 )
    {
    com.objectspace.voyager.message.Result __result = pushFront( arg1, __newDefaultMessenger() );
    __result.rethrowExceptionRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result popFront( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance6 );
    }
  
  
  public Object popFront()
    {
    com.objectspace.voyager.message.Result __result = popFront( __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result pushBack( Object arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance7 );
    }
  
  
  public void pushBack( Object arg1 )
    {
    com.objectspace.voyager.message.Result __result = pushBack( arg1, __newDefaultMessenger() );
    __result.rethrowExceptionRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result popBack( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance8 );
    }
  
  
  public Object popBack()
    {
    com.objectspace.voyager.message.Result __result = popBack( __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result remove( Object arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance9 );
    }
  
  
  public int remove( Object arg1 )
    {
    com.objectspace.voyager.message.Result __result = remove( arg1, __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result remove( java.util.Enumeration arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance10 );
    }
  
  
  public Object remove( java.util.Enumeration arg1 )
    {
    com.objectspace.voyager.message.Result __result = remove( arg1, __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result remove( Object arg1, int arg2, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    __messenger.writeInt( arg2 );
    return __instanceMethod( __messenger, __instance11 );
    }
  
  
  public int remove( Object arg1, int arg2 )
    {
    com.objectspace.voyager.message.Result __result = remove( arg1, arg2, __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result remove( int arg1, int arg2, Object arg3, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeInt( arg1 );
    __messenger.writeInt( arg2 );
    __messenger.writeObject( arg3 );
    return __instanceMethod( __messenger, __instance12 );
    }
  
  
  public int remove( int arg1, int arg2, Object arg3 )
    {
    com.objectspace.voyager.message.Result __result = remove( arg1, arg2, arg3, __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result count( Object arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance13 );
    }
  
  
  public int count( Object arg1 )
    {
    com.objectspace.voyager.message.Result __result = count( arg1, __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result count( int arg1, int arg2, Object arg3, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeInt( arg1 );
    __messenger.writeInt( arg2 );
    __messenger.writeObject( arg3 );
    return __instanceMethod( __messenger, __instance14 );
    }
  
  
  public int count( int arg1, int arg2, Object arg3 )
    {
    com.objectspace.voyager.message.Result __result = count( arg1, arg2, arg3, __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result replace( Object arg1, Object arg2, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __instanceMethod( __messenger, __instance15 );
    }
  
  
  public int replace( Object arg1, Object arg2 )
    {
    com.objectspace.voyager.message.Result __result = replace( arg1, arg2, __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result replace( int arg1, int arg2, Object arg3, Object arg4, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeInt( arg1 );
    __messenger.writeInt( arg2 );
    __messenger.writeObject( arg3 );
    __messenger.writeObject( arg4 );
    return __instanceMethod( __messenger, __instance16 );
    }
  
  
  public int replace( int arg1, int arg2, Object arg3, Object arg4 )
    {
    com.objectspace.voyager.message.Result __result = replace( arg1, arg2, arg3, arg4, __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result contains( Object arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance17 );
    }
  
  
  public boolean contains( Object arg1 )
    {
    com.objectspace.voyager.message.Result __result = contains( arg1, __newDefaultMessenger() );
    return __result.readBooleanRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result indexOf( Object arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance18 );
    }
  
  
  public int indexOf( Object arg1 )
    {
    com.objectspace.voyager.message.Result __result = indexOf( arg1, __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result indexOf( int arg1, int arg2, Object arg3, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeInt( arg1 );
    __messenger.writeInt( arg2 );
    __messenger.writeObject( arg3 );
    return __instanceMethod( __messenger, __instance19 );
    }
  
  
  public int indexOf( int arg1, int arg2, Object arg3 )
    {
    com.objectspace.voyager.message.Result __result = indexOf( arg1, arg2, arg3, __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result toString( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance20 );
    }
  
  
  public String toString()
    {
    com.objectspace.voyager.message.Result __result = toString( __newDefaultMessenger() );
    return (String) __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result size( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance21 );
    }
  
  
  public int size()
    {
    com.objectspace.voyager.message.Result __result = size( __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result maxSize( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance22 );
    }
  
  
  public int maxSize()
    {
    com.objectspace.voyager.message.Result __result = maxSize( __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result isEmpty( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance23 );
    }
  
  
  public boolean isEmpty()
    {
    com.objectspace.voyager.message.Result __result = isEmpty( __newDefaultMessenger() );
    return __result.readBooleanRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result clear( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance24 );
    }
  
  
  public void clear()
    {
    com.objectspace.voyager.message.Result __result = clear( __newDefaultMessenger() );
    __result.rethrowExceptionRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result elements( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance25 );
    }
  
  
  public java.util.Enumeration elements()
    {
    com.objectspace.voyager.message.Result __result = elements( __newDefaultMessenger() );
    return (java.util.Enumeration) __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result start( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance26 );
    }
  
  
  public com.objectspace.jgl.ForwardIterator start()
    {
    com.objectspace.voyager.message.Result __result = start( __newDefaultMessenger() );
    return (com.objectspace.jgl.ForwardIterator) __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result finish( com.objectspace.voyager.message.Messenger __messenger )
    {
    return __instanceMethod( __messenger, __instance27 );
    }
  
  
  public com.objectspace.jgl.ForwardIterator finish()
    {
    com.objectspace.voyager.message.Result __result = finish( __newDefaultMessenger() );
    return (com.objectspace.jgl.ForwardIterator) __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result add( Object arg1, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    return __instanceMethod( __messenger, __instance28 );
    }
  
  
  public Object add( Object arg1 )
    {
    com.objectspace.voyager.message.Result __result = add( arg1, __newDefaultMessenger() );
    return __result.readObjectRuntime();
    }
  
    /**
   * @param __messenger The messenger that should be used to invoke the method
   */
  public com.objectspace.voyager.message.Result remove( java.util.Enumeration arg1, java.util.Enumeration arg2, com.objectspace.voyager.message.Messenger __messenger )
    {
    __messenger.writeObject( arg1 );
    __messenger.writeObject( arg2 );
    return __instanceMethod( __messenger, __instance29 );
    }
  
  
  public int remove( java.util.Enumeration arg1, java.util.Enumeration arg2 )
    {
    com.objectspace.voyager.message.Result __result = remove( arg1, arg2, __newDefaultMessenger() );
    return __result.readIntRuntime();
    }
  }
