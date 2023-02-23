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
public class GetPropRequest implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("GetPropRequest");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.MAP, (short)2);
  private static final TField VERTEX_PROPS_FIELD_DESC = new TField("vertex_props", TType.LIST, (short)3);
  private static final TField EDGE_PROPS_FIELD_DESC = new TField("edge_props", TType.LIST, (short)4);
  private static final TField EXPRESSIONS_FIELD_DESC = new TField("expressions", TType.LIST, (short)5);
  private static final TField DEDUP_FIELD_DESC = new TField("dedup", TType.BOOL, (short)6);
  private static final TField ORDER_BY_FIELD_DESC = new TField("order_by", TType.LIST, (short)7);
  private static final TField LIMIT_FIELD_DESC = new TField("limit", TType.I64, (short)8);
  private static final TField FILTER_FIELD_DESC = new TField("filter", TType.STRING, (short)9);
  private static final TField COMMON_FIELD_DESC = new TField("common", TType.STRUCT, (short)10);

  public int space_id;
  public Map<Integer,List<com.vesoft.nebula.Row>> parts;
  public List<VertexProp> vertex_props;
  public List<EdgeProp> edge_props;
  public List<Expr> expressions;
  public boolean dedup;
  public List<OrderBy> order_by;
  public long limit;
  public byte[] filter;
  public RequestCommon common;
  public static final int SPACE_ID = 1;
  public static final int PARTS = 2;
  public static final int VERTEX_PROPS = 3;
  public static final int EDGE_PROPS = 4;
  public static final int EXPRESSIONS = 5;
  public static final int DEDUP = 6;
  public static final int ORDER_BY = 7;
  public static final int LIMIT = 8;
  public static final int FILTER = 9;
  public static final int COMMON = 10;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private static final int __DEDUP_ISSET_ID = 1;
  private static final int __LIMIT_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new ListMetaData(TType.LIST, 
                new StructMetaData(TType.STRUCT, com.vesoft.nebula.Row.class)))));
    tmpMetaDataMap.put(VERTEX_PROPS, new FieldMetaData("vertex_props", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, VertexProp.class))));
    tmpMetaDataMap.put(EDGE_PROPS, new FieldMetaData("edge_props", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, EdgeProp.class))));
    tmpMetaDataMap.put(EXPRESSIONS, new FieldMetaData("expressions", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, Expr.class))));
    tmpMetaDataMap.put(DEDUP, new FieldMetaData("dedup", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMetaDataMap.put(ORDER_BY, new FieldMetaData("order_by", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, OrderBy.class))));
    tmpMetaDataMap.put(LIMIT, new FieldMetaData("limit", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(FILTER, new FieldMetaData("filter", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(COMMON, new FieldMetaData("common", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, RequestCommon.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(GetPropRequest.class, metaDataMap);
  }

  public GetPropRequest() {
    this.dedup = false;

  }

  public GetPropRequest(
      int space_id,
      Map<Integer,List<com.vesoft.nebula.Row>> parts,
      boolean dedup) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.dedup = dedup;
    setDedupIsSet(true);
  }

  public GetPropRequest(
      int space_id,
      Map<Integer,List<com.vesoft.nebula.Row>> parts,
      List<VertexProp> vertex_props,
      List<EdgeProp> edge_props,
      List<Expr> expressions,
      boolean dedup,
      List<OrderBy> order_by,
      long limit,
      byte[] filter,
      RequestCommon common) {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.vertex_props = vertex_props;
    this.edge_props = edge_props;
    this.expressions = expressions;
    this.dedup = dedup;
    setDedupIsSet(true);
    this.order_by = order_by;
    this.limit = limit;
    setLimitIsSet(true);
    this.filter = filter;
    this.common = common;
  }

  public static class Builder {
    private int space_id;
    private Map<Integer,List<com.vesoft.nebula.Row>> parts;
    private List<VertexProp> vertex_props;
    private List<EdgeProp> edge_props;
    private List<Expr> expressions;
    private boolean dedup;
    private List<OrderBy> order_by;
    private long limit;
    private byte[] filter;
    private RequestCommon common;

    BitSet __optional_isset = new BitSet(3);

    public Builder() {
    }

    public Builder setSpace_id(final int space_id) {
      this.space_id = space_id;
      __optional_isset.set(__SPACE_ID_ISSET_ID, true);
      return this;
    }

    public Builder setParts(final Map<Integer,List<com.vesoft.nebula.Row>> parts) {
      this.parts = parts;
      return this;
    }

    public Builder setVertex_props(final List<VertexProp> vertex_props) {
      this.vertex_props = vertex_props;
      return this;
    }

    public Builder setEdge_props(final List<EdgeProp> edge_props) {
      this.edge_props = edge_props;
      return this;
    }

    public Builder setExpressions(final List<Expr> expressions) {
      this.expressions = expressions;
      return this;
    }

    public Builder setDedup(final boolean dedup) {
      this.dedup = dedup;
      __optional_isset.set(__DEDUP_ISSET_ID, true);
      return this;
    }

    public Builder setOrder_by(final List<OrderBy> order_by) {
      this.order_by = order_by;
      return this;
    }

    public Builder setLimit(final long limit) {
      this.limit = limit;
      __optional_isset.set(__LIMIT_ISSET_ID, true);
      return this;
    }

    public Builder setFilter(final byte[] filter) {
      this.filter = filter;
      return this;
    }

    public Builder setCommon(final RequestCommon common) {
      this.common = common;
      return this;
    }

    public GetPropRequest build() {
      GetPropRequest result = new GetPropRequest();
      if (__optional_isset.get(__SPACE_ID_ISSET_ID)) {
        result.setSpace_id(this.space_id);
      }
      result.setParts(this.parts);
      result.setVertex_props(this.vertex_props);
      result.setEdge_props(this.edge_props);
      result.setExpressions(this.expressions);
      if (__optional_isset.get(__DEDUP_ISSET_ID)) {
        result.setDedup(this.dedup);
      }
      result.setOrder_by(this.order_by);
      if (__optional_isset.get(__LIMIT_ISSET_ID)) {
        result.setLimit(this.limit);
      }
      result.setFilter(this.filter);
      result.setCommon(this.common);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetPropRequest(GetPropRequest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
    if (other.isSetVertex_props()) {
      this.vertex_props = TBaseHelper.deepCopy(other.vertex_props);
    }
    if (other.isSetEdge_props()) {
      this.edge_props = TBaseHelper.deepCopy(other.edge_props);
    }
    if (other.isSetExpressions()) {
      this.expressions = TBaseHelper.deepCopy(other.expressions);
    }
    this.dedup = TBaseHelper.deepCopy(other.dedup);
    if (other.isSetOrder_by()) {
      this.order_by = TBaseHelper.deepCopy(other.order_by);
    }
    this.limit = TBaseHelper.deepCopy(other.limit);
    if (other.isSetFilter()) {
      this.filter = TBaseHelper.deepCopy(other.filter);
    }
    if (other.isSetCommon()) {
      this.common = TBaseHelper.deepCopy(other.common);
    }
  }

  public GetPropRequest deepCopy() {
    return new GetPropRequest(this);
  }

  public int getSpace_id() {
    return this.space_id;
  }

  public GetPropRequest setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean __value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, __value);
  }

  public Map<Integer,List<com.vesoft.nebula.Row>> getParts() {
    return this.parts;
  }

  public GetPropRequest setParts(Map<Integer,List<com.vesoft.nebula.Row>> parts) {
    this.parts = parts;
    return this;
  }

  public void unsetParts() {
    this.parts = null;
  }

  // Returns true if field parts is set (has been assigned a value) and false otherwise
  public boolean isSetParts() {
    return this.parts != null;
  }

  public void setPartsIsSet(boolean __value) {
    if (!__value) {
      this.parts = null;
    }
  }

  public List<VertexProp> getVertex_props() {
    return this.vertex_props;
  }

  public GetPropRequest setVertex_props(List<VertexProp> vertex_props) {
    this.vertex_props = vertex_props;
    return this;
  }

  public void unsetVertex_props() {
    this.vertex_props = null;
  }

  // Returns true if field vertex_props is set (has been assigned a value) and false otherwise
  public boolean isSetVertex_props() {
    return this.vertex_props != null;
  }

  public void setVertex_propsIsSet(boolean __value) {
    if (!__value) {
      this.vertex_props = null;
    }
  }

  public List<EdgeProp> getEdge_props() {
    return this.edge_props;
  }

  public GetPropRequest setEdge_props(List<EdgeProp> edge_props) {
    this.edge_props = edge_props;
    return this;
  }

  public void unsetEdge_props() {
    this.edge_props = null;
  }

  // Returns true if field edge_props is set (has been assigned a value) and false otherwise
  public boolean isSetEdge_props() {
    return this.edge_props != null;
  }

  public void setEdge_propsIsSet(boolean __value) {
    if (!__value) {
      this.edge_props = null;
    }
  }

  public List<Expr> getExpressions() {
    return this.expressions;
  }

  public GetPropRequest setExpressions(List<Expr> expressions) {
    this.expressions = expressions;
    return this;
  }

  public void unsetExpressions() {
    this.expressions = null;
  }

  // Returns true if field expressions is set (has been assigned a value) and false otherwise
  public boolean isSetExpressions() {
    return this.expressions != null;
  }

  public void setExpressionsIsSet(boolean __value) {
    if (!__value) {
      this.expressions = null;
    }
  }

  public boolean isDedup() {
    return this.dedup;
  }

  public GetPropRequest setDedup(boolean dedup) {
    this.dedup = dedup;
    setDedupIsSet(true);
    return this;
  }

  public void unsetDedup() {
    __isset_bit_vector.clear(__DEDUP_ISSET_ID);
  }

  // Returns true if field dedup is set (has been assigned a value) and false otherwise
  public boolean isSetDedup() {
    return __isset_bit_vector.get(__DEDUP_ISSET_ID);
  }

  public void setDedupIsSet(boolean __value) {
    __isset_bit_vector.set(__DEDUP_ISSET_ID, __value);
  }

  public List<OrderBy> getOrder_by() {
    return this.order_by;
  }

  public GetPropRequest setOrder_by(List<OrderBy> order_by) {
    this.order_by = order_by;
    return this;
  }

  public void unsetOrder_by() {
    this.order_by = null;
  }

  // Returns true if field order_by is set (has been assigned a value) and false otherwise
  public boolean isSetOrder_by() {
    return this.order_by != null;
  }

  public void setOrder_byIsSet(boolean __value) {
    if (!__value) {
      this.order_by = null;
    }
  }

  public long getLimit() {
    return this.limit;
  }

  public GetPropRequest setLimit(long limit) {
    this.limit = limit;
    setLimitIsSet(true);
    return this;
  }

  public void unsetLimit() {
    __isset_bit_vector.clear(__LIMIT_ISSET_ID);
  }

  // Returns true if field limit is set (has been assigned a value) and false otherwise
  public boolean isSetLimit() {
    return __isset_bit_vector.get(__LIMIT_ISSET_ID);
  }

  public void setLimitIsSet(boolean __value) {
    __isset_bit_vector.set(__LIMIT_ISSET_ID, __value);
  }

  public byte[] getFilter() {
    return this.filter;
  }

  public GetPropRequest setFilter(byte[] filter) {
    this.filter = filter;
    return this;
  }

  public void unsetFilter() {
    this.filter = null;
  }

  // Returns true if field filter is set (has been assigned a value) and false otherwise
  public boolean isSetFilter() {
    return this.filter != null;
  }

  public void setFilterIsSet(boolean __value) {
    if (!__value) {
      this.filter = null;
    }
  }

  public RequestCommon getCommon() {
    return this.common;
  }

  public GetPropRequest setCommon(RequestCommon common) {
    this.common = common;
    return this;
  }

  public void unsetCommon() {
    this.common = null;
  }

  // Returns true if field common is set (has been assigned a value) and false otherwise
  public boolean isSetCommon() {
    return this.common != null;
  }

  public void setCommonIsSet(boolean __value) {
    if (!__value) {
      this.common = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SPACE_ID:
      if (__value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)__value);
      }
      break;

    case PARTS:
      if (__value == null) {
        unsetParts();
      } else {
        setParts((Map<Integer,List<com.vesoft.nebula.Row>>)__value);
      }
      break;

    case VERTEX_PROPS:
      if (__value == null) {
        unsetVertex_props();
      } else {
        setVertex_props((List<VertexProp>)__value);
      }
      break;

    case EDGE_PROPS:
      if (__value == null) {
        unsetEdge_props();
      } else {
        setEdge_props((List<EdgeProp>)__value);
      }
      break;

    case EXPRESSIONS:
      if (__value == null) {
        unsetExpressions();
      } else {
        setExpressions((List<Expr>)__value);
      }
      break;

    case DEDUP:
      if (__value == null) {
        unsetDedup();
      } else {
        setDedup((Boolean)__value);
      }
      break;

    case ORDER_BY:
      if (__value == null) {
        unsetOrder_by();
      } else {
        setOrder_by((List<OrderBy>)__value);
      }
      break;

    case LIMIT:
      if (__value == null) {
        unsetLimit();
      } else {
        setLimit((Long)__value);
      }
      break;

    case FILTER:
      if (__value == null) {
        unsetFilter();
      } else {
        setFilter((byte[])__value);
      }
      break;

    case COMMON:
      if (__value == null) {
        unsetCommon();
      } else {
        setCommon((RequestCommon)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return new Integer(getSpace_id());

    case PARTS:
      return getParts();

    case VERTEX_PROPS:
      return getVertex_props();

    case EDGE_PROPS:
      return getEdge_props();

    case EXPRESSIONS:
      return getExpressions();

    case DEDUP:
      return new Boolean(isDedup());

    case ORDER_BY:
      return getOrder_by();

    case LIMIT:
      return new Long(getLimit());

    case FILTER:
      return getFilter();

    case COMMON:
      return getCommon();

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
    if (!(_that instanceof GetPropRequest))
      return false;
    GetPropRequest that = (GetPropRequest)_that;

    if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetParts(), that.isSetParts(), this.parts, that.parts)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetVertex_props(), that.isSetVertex_props(), this.vertex_props, that.vertex_props)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetEdge_props(), that.isSetEdge_props(), this.edge_props, that.edge_props)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetExpressions(), that.isSetExpressions(), this.expressions, that.expressions)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.dedup, that.dedup)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOrder_by(), that.isSetOrder_by(), this.order_by, that.order_by)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetLimit(), that.isSetLimit(), this.limit, that.limit)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetFilter(), that.isSetFilter(), this.filter, that.filter)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetCommon(), that.isSetCommon(), this.common, that.common)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {space_id, parts, vertex_props, edge_props, expressions, dedup, order_by, limit, filter, common});
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
        case SPACE_ID:
          if (__field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PARTS:
          if (__field.type == TType.MAP) {
            {
              TMap _map67 = iprot.readMapBegin();
              this.parts = new HashMap<Integer,List<com.vesoft.nebula.Row>>(Math.max(0, 2*_map67.size));
              for (int _i68 = 0; 
                   (_map67.size < 0) ? iprot.peekMap() : (_i68 < _map67.size); 
                   ++_i68)
              {
                int _key69;
                List<com.vesoft.nebula.Row> _val70;
                _key69 = iprot.readI32();
                {
                  TList _list71 = iprot.readListBegin();
                  _val70 = new ArrayList<com.vesoft.nebula.Row>(Math.max(0, _list71.size));
                  for (int _i72 = 0; 
                       (_list71.size < 0) ? iprot.peekList() : (_i72 < _list71.size); 
                       ++_i72)
                  {
                    com.vesoft.nebula.Row _elem73;
                    _elem73 = new com.vesoft.nebula.Row();
                    _elem73.read(iprot);
                    _val70.add(_elem73);
                  }
                  iprot.readListEnd();
                }
                this.parts.put(_key69, _val70);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case VERTEX_PROPS:
          if (__field.type == TType.LIST) {
            {
              TList _list74 = iprot.readListBegin();
              this.vertex_props = new ArrayList<VertexProp>(Math.max(0, _list74.size));
              for (int _i75 = 0; 
                   (_list74.size < 0) ? iprot.peekList() : (_i75 < _list74.size); 
                   ++_i75)
              {
                VertexProp _elem76;
                _elem76 = new VertexProp();
                _elem76.read(iprot);
                this.vertex_props.add(_elem76);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case EDGE_PROPS:
          if (__field.type == TType.LIST) {
            {
              TList _list77 = iprot.readListBegin();
              this.edge_props = new ArrayList<EdgeProp>(Math.max(0, _list77.size));
              for (int _i78 = 0; 
                   (_list77.size < 0) ? iprot.peekList() : (_i78 < _list77.size); 
                   ++_i78)
              {
                EdgeProp _elem79;
                _elem79 = new EdgeProp();
                _elem79.read(iprot);
                this.edge_props.add(_elem79);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case EXPRESSIONS:
          if (__field.type == TType.LIST) {
            {
              TList _list80 = iprot.readListBegin();
              this.expressions = new ArrayList<Expr>(Math.max(0, _list80.size));
              for (int _i81 = 0; 
                   (_list80.size < 0) ? iprot.peekList() : (_i81 < _list80.size); 
                   ++_i81)
              {
                Expr _elem82;
                _elem82 = new Expr();
                _elem82.read(iprot);
                this.expressions.add(_elem82);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case DEDUP:
          if (__field.type == TType.BOOL) {
            this.dedup = iprot.readBool();
            setDedupIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ORDER_BY:
          if (__field.type == TType.LIST) {
            {
              TList _list83 = iprot.readListBegin();
              this.order_by = new ArrayList<OrderBy>(Math.max(0, _list83.size));
              for (int _i84 = 0; 
                   (_list83.size < 0) ? iprot.peekList() : (_i84 < _list83.size); 
                   ++_i84)
              {
                OrderBy _elem85;
                _elem85 = new OrderBy();
                _elem85.read(iprot);
                this.order_by.add(_elem85);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case LIMIT:
          if (__field.type == TType.I64) {
            this.limit = iprot.readI64();
            setLimitIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case FILTER:
          if (__field.type == TType.STRING) {
            this.filter = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case COMMON:
          if (__field.type == TType.STRUCT) {
            this.common = new RequestCommon();
            this.common.read(iprot);
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
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    if (this.parts != null) {
      oprot.writeFieldBegin(PARTS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.LIST, this.parts.size()));
        for (Map.Entry<Integer, List<com.vesoft.nebula.Row>> _iter86 : this.parts.entrySet())        {
          oprot.writeI32(_iter86.getKey());
          {
            oprot.writeListBegin(new TList(TType.STRUCT, _iter86.getValue().size()));
            for (com.vesoft.nebula.Row _iter87 : _iter86.getValue())            {
              _iter87.write(oprot);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.vertex_props != null) {
      if (isSetVertex_props()) {
        oprot.writeFieldBegin(VERTEX_PROPS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.vertex_props.size()));
          for (VertexProp _iter88 : this.vertex_props)          {
            _iter88.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.edge_props != null) {
      if (isSetEdge_props()) {
        oprot.writeFieldBegin(EDGE_PROPS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.edge_props.size()));
          for (EdgeProp _iter89 : this.edge_props)          {
            _iter89.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.expressions != null) {
      if (isSetExpressions()) {
        oprot.writeFieldBegin(EXPRESSIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.expressions.size()));
          for (Expr _iter90 : this.expressions)          {
            _iter90.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldBegin(DEDUP_FIELD_DESC);
    oprot.writeBool(this.dedup);
    oprot.writeFieldEnd();
    if (this.order_by != null) {
      if (isSetOrder_by()) {
        oprot.writeFieldBegin(ORDER_BY_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.order_by.size()));
          for (OrderBy _iter91 : this.order_by)          {
            _iter91.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (isSetLimit()) {
      oprot.writeFieldBegin(LIMIT_FIELD_DESC);
      oprot.writeI64(this.limit);
      oprot.writeFieldEnd();
    }
    if (this.filter != null) {
      if (isSetFilter()) {
        oprot.writeFieldBegin(FILTER_FIELD_DESC);
        oprot.writeBinary(this.filter);
        oprot.writeFieldEnd();
      }
    }
    if (this.common != null) {
      if (isSetCommon()) {
        oprot.writeFieldBegin(COMMON_FIELD_DESC);
        this.common.write(oprot);
        oprot.writeFieldEnd();
      }
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
    StringBuilder sb = new StringBuilder("GetPropRequest");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getParts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getParts(), indent + 1, prettyPrint));
    }
    first = false;
    if (isSetVertex_props())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("vertex_props");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getVertex_props() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getVertex_props(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetEdge_props())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("edge_props");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getEdge_props() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getEdge_props(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetExpressions())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("expressions");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getExpressions() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getExpressions(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("dedup");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.isDedup(), indent + 1, prettyPrint));
    first = false;
    if (isSetOrder_by())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("order_by");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getOrder_by() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getOrder_by(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetLimit())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("limit");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this.getLimit(), indent + 1, prettyPrint));
      first = false;
    }
    if (isSetFilter())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("filter");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getFilter() == null) {
        sb.append("null");
      } else {
          int __filter_size = Math.min(this.getFilter().length, 128);
          for (int i = 0; i < __filter_size; i++) {
            if (i != 0) sb.append(" ");
            sb.append(Integer.toHexString(this.getFilter()[i]).length() > 1 ? Integer.toHexString(this.getFilter()[i]).substring(Integer.toHexString(this.getFilter()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getFilter()[i]).toUpperCase());
          }
          if (this.getFilter().length > 128) sb.append(" ...");
      }
      first = false;
    }
    if (isSetCommon())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("common");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getCommon() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getCommon(), indent + 1, prettyPrint));
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

