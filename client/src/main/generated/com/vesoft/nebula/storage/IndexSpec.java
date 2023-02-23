/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class IndexSpec implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("IndexSpec");
  private static final TField CONTEXTS_FIELD_DESC = new TField("contexts", TType.LIST, (short)1);
  private static final TField SCHEMA_ID_FIELD_DESC = new TField("schema_id", TType.STRUCT, (short)2);

  public List<IndexQueryContext> contexts;
  public com.vesoft.nebula.SchemaID schema_id;
  public static final int CONTEXTS = 1;
  public static final int SCHEMA_ID = 2;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(CONTEXTS, new FieldMetaData("contexts", TFieldRequirementType.REQUIRED, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, IndexQueryContext.class))));
    tmpMetaDataMap.put(SCHEMA_ID, new FieldMetaData("schema_id", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.SchemaID.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(IndexSpec.class, metaDataMap);
  }

  public IndexSpec() {
  }

  public IndexSpec(
      List<IndexQueryContext> contexts) {
    this();
    this.contexts = contexts;
  }

  public IndexSpec(
      List<IndexQueryContext> contexts,
      com.vesoft.nebula.SchemaID schema_id) {
    this();
    this.contexts = contexts;
    this.schema_id = schema_id;
  }

  public static class Builder {
    private List<IndexQueryContext> contexts;
    private com.vesoft.nebula.SchemaID schema_id;

    public Builder() {
    }

    public Builder setContexts(final List<IndexQueryContext> contexts) {
      this.contexts = contexts;
      return this;
    }

    public Builder setSchema_id(final com.vesoft.nebula.SchemaID schema_id) {
      this.schema_id = schema_id;
      return this;
    }

    public IndexSpec build() {
      IndexSpec result = new IndexSpec();
      result.setContexts(this.contexts);
      result.setSchema_id(this.schema_id);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IndexSpec(IndexSpec other) {
    if (other.isSetContexts()) {
      this.contexts = TBaseHelper.deepCopy(other.contexts);
    }
    if (other.isSetSchema_id()) {
      this.schema_id = TBaseHelper.deepCopy(other.schema_id);
    }
  }

  public IndexSpec deepCopy() {
    return new IndexSpec(this);
  }

  public List<IndexQueryContext> getContexts() {
    return this.contexts;
  }

  public IndexSpec setContexts(List<IndexQueryContext> contexts) {
    this.contexts = contexts;
    return this;
  }

  public void unsetContexts() {
    this.contexts = null;
  }

  // Returns true if field contexts is set (has been assigned a value) and false otherwise
  public boolean isSetContexts() {
    return this.contexts != null;
  }

  public void setContextsIsSet(boolean __value) {
    if (!__value) {
      this.contexts = null;
    }
  }

  public com.vesoft.nebula.SchemaID getSchema_id() {
    return this.schema_id;
  }

  public IndexSpec setSchema_id(com.vesoft.nebula.SchemaID schema_id) {
    this.schema_id = schema_id;
    return this;
  }

  public void unsetSchema_id() {
    this.schema_id = null;
  }

  // Returns true if field schema_id is set (has been assigned a value) and false otherwise
  public boolean isSetSchema_id() {
    return this.schema_id != null;
  }

  public void setSchema_idIsSet(boolean __value) {
    if (!__value) {
      this.schema_id = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case CONTEXTS:
      if (__value == null) {
        unsetContexts();
      } else {
        setContexts((List<IndexQueryContext>)__value);
      }
      break;

    case SCHEMA_ID:
      if (__value == null) {
        unsetSchema_id();
      } else {
        setSchema_id((com.vesoft.nebula.SchemaID)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case CONTEXTS:
      return getContexts();

    case SCHEMA_ID:
      return getSchema_id();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof IndexSpec))
      return false;
    IndexSpec that = (IndexSpec)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetContexts(), that.isSetContexts(), this.contexts, that.contexts)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetSchema_id(), that.isSetSchema_id(), this.schema_id, that.schema_id)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {contexts, schema_id});
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case CONTEXTS:
          if (__field.type == TType.LIST) {
            {
              TList _list186 = iprot.readListBegin();
              this.contexts = new ArrayList<IndexQueryContext>(Math.max(0, _list186.size));
              for (int _i187 = 0; 
                   (_list186.size < 0) ? iprot.peekList() : (_i187 < _list186.size); 
                   ++_i187)
              {
                IndexQueryContext _elem188;
                _elem188 = new IndexQueryContext();
                _elem188.read(iprot);
                this.contexts.add(_elem188);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case SCHEMA_ID:
          if (__field.type == TType.STRUCT) {
            this.schema_id = new com.vesoft.nebula.SchemaID();
            this.schema_id.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.contexts != null) {
      oprot.writeFieldBegin(CONTEXTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.contexts.size()));
        for (IndexQueryContext _iter189 : this.contexts)        {
          _iter189.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.schema_id != null) {
      oprot.writeFieldBegin(SCHEMA_ID_FIELD_DESC);
      this.schema_id.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("IndexSpec");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("contexts");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getContexts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getContexts(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("schema_id");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getSchema_id() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getSchema_id(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (contexts == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'contexts' was not present! Struct: " + toString());
    }
  }

}

