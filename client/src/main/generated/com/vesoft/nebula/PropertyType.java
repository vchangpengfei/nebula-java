/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula;


import com.facebook.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({ "unused" })
public enum PropertyType implements com.facebook.thrift.TEnum {
  UNKNOWN(0),
  BOOL(1),
  INT64(2),
  VID(3),
  FLOAT(4),
  DOUBLE(5),
  STRING(6),
  FIXED_STRING(7),
  INT8(8),
  INT16(9),
  INT32(10),
  TIMESTAMP(21),
  DURATION(23),
  DATE(24),
  DATETIME(25),
  TIME(26),
  GEOGRAPHY(31);

  private static final Map<Integer, PropertyType> INDEXED_VALUES = new HashMap<Integer, PropertyType>();

  static {
    for (PropertyType e: values()) {
      INDEXED_VALUES.put(e.getValue(), e);
    }
  }

  private final int value;

  private PropertyType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static PropertyType findByValue(int value) { 
    return INDEXED_VALUES.get(value);
  }
}