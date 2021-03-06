/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class SearchReport {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SearchReport(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SearchReport obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_SearchReport(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setKey(ConstString value) {
    yarpJNI.SearchReport_key_set(swigCPtr, this, ConstString.getCPtr(value), value);
  }

  public ConstString getKey() {
    long cPtr = yarpJNI.SearchReport_key_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ConstString(cPtr, false);
  }

  public void setValue(ConstString value) {
    yarpJNI.SearchReport_value_set(swigCPtr, this, ConstString.getCPtr(value), value);
  }

  public ConstString getValue() {
    long cPtr = yarpJNI.SearchReport_value_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ConstString(cPtr, false);
  }

  public void setIsFound(boolean value) {
    yarpJNI.SearchReport_isFound_set(swigCPtr, this, value);
  }

  public boolean getIsFound() {
    return yarpJNI.SearchReport_isFound_get(swigCPtr, this);
  }

  public void setIsGroup(boolean value) {
    yarpJNI.SearchReport_isGroup_set(swigCPtr, this, value);
  }

  public boolean getIsGroup() {
    return yarpJNI.SearchReport_isGroup_get(swigCPtr, this);
  }

  public void setIsComment(boolean value) {
    yarpJNI.SearchReport_isComment_set(swigCPtr, this, value);
  }

  public boolean getIsComment() {
    return yarpJNI.SearchReport_isComment_get(swigCPtr, this);
  }

  public void setIsDefault(boolean value) {
    yarpJNI.SearchReport_isDefault_set(swigCPtr, this, value);
  }

  public boolean getIsDefault() {
    return yarpJNI.SearchReport_isDefault_get(swigCPtr, this);
  }

  public SearchReport() {
    this(yarpJNI.new_SearchReport(), true);
  }

}
