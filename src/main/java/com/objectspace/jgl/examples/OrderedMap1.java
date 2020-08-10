package com.objectspace.jgl.examples;// Copyright(c) 1996,1997 ObjectSpace, Inc.
import com.objectspace.jgl.*;
import java.util.Enumeration;

/**
 * Construction, enumeration, access, rejection of duplicates.
 *
 * @see com.objectspace.jgl,OrderedMap
 * @version 3.0.0
 * @author ObjectSpace, Inc.
 */

public class OrderedMap1
  {
  public static void main( String[] args )
    {
    OrderedMap map = new OrderedMap();
    map.add( new Integer( 2 ), "two" );
    map.add( new Integer( 4 ), "four" );
    System.out.println( map );
    System.out.println();

    System.out.println( "Enumerate the OrderedMap" );
    Enumeration e = map.elements();
    while ( e.hasMoreElements() )
      System.out.println( e.nextElement() );
    System.out.println();

    System.out.println( "Iterate through the OrderedMap" );
    for ( OrderedMapIterator i = map.begin(); !i.equals( map.end() ); i.advance() )
      System.out.println( i.get() + ", key = " + i.key() + ", value = " + i.value() );
    System.out.println();

    System.out.println( "Demonstrate access" );
    System.out.println( "map.at( 2 ) = " + map.get( new Integer( 2 ) ) );
    System.out.println( "map.at( 5 ) = " + map.get( new Integer( 5 ) ) );
    System.out.println( "map = " + map );
    System.out.println();

    System.out.println( "Show that duplicates cannot be added." );
    Object value = map.add( new Integer( 8 ), "eight" );
    if ( value != null )
      System.out.println( "Could not add 8." );
    else
      System.out.println( "Added 8." );
    System.out.println( "map = " + map );

    value = map.add( new Integer( 4 ), "FOUR" );
    if ( value != null )
      System.out.println( "Could not add 4." );
    else
      System.out.println( "Added 4." );
    System.out.println( "map = " + map );
    System.out.println();

    System.out.println( "Demonstrate modification" );
    map.put( new Integer( 4 ), "FOUR" );
    System.out.println( "map = " + map );
    }
  }