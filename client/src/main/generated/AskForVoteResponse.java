/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
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
public class AskForVoteResponse implements TBase, java.io.Serializable, Cloneable, Comparable<AskForVoteResponse> {
  private static final TStruct STRUCT_DESC = new TStruct("AskForVoteResponse");
  private static final TField ERROR_CODE_FIELD_DESC = new TField("error_code", TType.I32, (short)1);
  private static final TField CURRENT_TERM_FIELD_DESC = new TField("current_term", TType.I64, (short)2);

  /**
   * 
   * @see com.vesoft.nebula.ErrorCode
   */
  public com.vesoft.nebula.ErrorCode error_code;
  public long current_term;
  public static final int ERROR_CODE = 1;
  public static final int CURRENT_TERM = 2;

  // isset id assignments
  private static final int __CURRENT_TERM_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ERROR_CODE, new FieldMetaData("error_code", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(CURRENT_TERM, new FieldMetaData("current_term", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(AskForVoteResponse.class, metaDataMap);
  }

  public AskForVoteResponse() {
  }

  public AskForVoteResponse(
      com.vesoft.nebula.ErrorCode error_code,
      long current_term) {
    this();
    this.error_code = error_code;
    this.current_term = current_term;
    setCurrent_termIsSet(true);
  }

  public static class Builder {
    private com.vesoft.nebula.ErrorCode error_code;
    private long current_term;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setError_code(final com.vesoft.nebula.ErrorCode error_code) {
      this.error_code = error_code;
      return this;
    }

    public Builder setCurrent_term(final long current_term) {
      this.current_term = current_term;
      __optional_isset.set(__CURRENT_TERM_ISSET_ID, true);
      return this;
    }

    public AskForVoteResponse build() {
      AskForVoteResponse result = new AskForVoteResponse();
      result.setError_code(this.error_code);
      if (__optional_isset.get(__CURRENT_TERM_ISSET_ID)) {
        result.setCurrent_term(this.current_term);
      }
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AskForVoteResponse(AskForVoteResponse other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetError_code()) {
      this.error_code = TBaseHelper.deepCopy(other.error_code);
    }
    this.current_term = TBaseHelper.deepCopy(other.current_term);
  }

  public AskForVoteResponse deepCopy() {
    return new AskForVoteResponse(this);
  }

  /**
   * 
   * @see com.vesoft.nebula.ErrorCode
   */
  public com.vesoft.nebula.ErrorCode getError_code() {
    return this.error_code;
  }

  /**
   * 
   * @see com.vesoft.nebula.ErrorCode
   */
  public AskForVoteResponse setError_code(com.vesoft.nebula.ErrorCode error_code) {
    this.error_code = error_code;
    return this;
  }

  public void unsetError_code() {
    this.error_code = null;
  }

  // Returns true if field error_code is set (has been assigned a value) and false otherwise
  public boolean isSetError_code() {
    return this.error_code != null;
  }

  public void setError_codeIsSet(boolean __value) {
    if (!__value) {
      this.error_code = null;
    }
  }

  public long getCurrent_term() {
    return this.current_term;
  }

  public AskForVoteResponse setCurrent_term(long current_term) {
    this.current_term = current_term;
    setCurrent_termIsSet(true);
    return this;
  }

  public void unsetCurrent_term() {
    __isset_bit_vector.clear(__CURRENT_TERM_ISSET_ID);
  }

  // Returns true if field current_term is set (has been assigned a value) and false otherwise
  public boolean isSetCurrent_term() {
    return __isset_bit_vector.get(__CURRENT_TERM_ISSET_ID);
  }

  public void setCurrent_termIsSet(boolean __value) {
    __isset_bit_vector.set(__CURRENT_TERM_ISSET_ID, __value);
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case ERROR_CODE:
      if (__value == null) {
        unsetError_code();
      } else {
        setError_code((com.vesoft.nebula.ErrorCode)__value);
      }
      break;

    case CURRENT_TERM:
      if (__value == null) {
        unsetCurrent_term();
      } else {
        setCurrent_term((Long)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ERROR_CODE:
      return getError_code();

    case CURRENT_TERM:
      return new Long(getCurrent_term());

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
    if (!(_that instanceof AskForVoteResponse))
      return false;
    AskForVoteResponse that = (AskForVoteResponse)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetError_code(), that.isSetError_code(), this.error_code, that.error_code)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.current_term, that.current_term)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {error_code, current_term});
  }

  @Override
  public int compareTo(AskForVoteResponse other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetError_code()).compareTo(other.isSetError_code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(error_code, other.error_code);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetCurrent_term()).compareTo(other.isSetCurrent_term());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(current_term, other.current_term);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
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
        case ERROR_CODE:
          if (__field.type == TType.I32) {
            this.error_code = com.vesoft.nebula.ErrorCode.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case CURRENT_TERM:
          if (__field.type == TType.I64) {
            this.current_term = iprot.readI64();
            setCurrent_termIsSet(true);
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
    if (this.error_code != null) {
      oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
      oprot.writeI32(this.error_code == null ? 0 : this.error_code.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(CURRENT_TERM_FIELD_DESC);
    oprot.writeI64(this.current_term);
    oprot.writeFieldEnd();
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
    StringBuilder sb = new StringBuilder("AskForVoteResponse");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("error_code");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getError_code() == null) {
      sb.append("null");
    } else {
      String error_code_name = this.getError_code() == null ? "null" : this.getError_code().name();
      if (error_code_name != null) {
        sb.append(error_code_name);
        sb.append(" (");
      }
      sb.append(this.getError_code());
      if (error_code_name != null) {
        sb.append(")");
      }
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("current_term");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getCurrent_term(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
