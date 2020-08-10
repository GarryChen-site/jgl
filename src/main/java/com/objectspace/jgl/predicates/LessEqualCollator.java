// Copyright(c) 1997 ObjectSpace, Inc.

package com.objectspace.jgl.predicates;

import com.objectspace.jgl.*;
import java.text.Collator;

/**
 * LessEqualCollator is a binary predicate that returns true
 * if the first operand as a string is less than or equal to the
 * second operand as a string when compared using the given Collator object.
 * <p>
 * If an explicit Collator object is not given, the default is used.
 * <p>
 * @see Collator
 * @see com.objectspace.jgl.examples.CollateExamples
 * @version 3.1.0
 * @author ObjectSpace, Inc.
 */

public final class LessEqualCollator implements BinaryPredicate
  {
  Collator collator;

  /**
   * Construct a LessEqualCollator function object that uses the collator
   * object for the current default locale to compare objects.
   */
  public LessEqualCollator()
    {
    collator = Collator.getInstance();
    }

  /**
   * Construct a LessEqualCollator function object that uses the given collator
   * object to compare objects.
   * @param collator The Collator object that is to be used for comparisons.
   */
  public LessEqualCollator( Collator collator )
    {
    this.collator = collator;
    }

  /**
   * Return true if the first operand is less than or equal to the second operand.
   * @see Collator#compare
   * @param first The first operand.
   * @param second The second operand.
   * @return collator.compare( first.toString(), second.toString() ) <= 0.
   */
  public boolean execute( Object first, Object second )
    {
    return collator.compare( first.toString(), second.toString() ) <= 0;
    }

  static final long serialVersionUID = -8927659291413923763L;
  }
