/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package yarp;

public class PortReaderBufferBaseCreator {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PortReaderBufferBaseCreator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PortReaderBufferBaseCreator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        yarpJNI.delete_PortReaderBufferBaseCreator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PortReader create() {
    long cPtr = yarpJNI.PortReaderBufferBaseCreator_create(swigCPtr, this);
    return (cPtr == 0) ? null : new PortReader(cPtr, false);
  }

}
