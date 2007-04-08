/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class matrix3x3 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected matrix3x3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(matrix3x3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      openbabelJNI.delete_matrix3x3(swigCPtr);
    }
    swigCPtr = 0;
  }

  public matrix3x3() {
    this(openbabelJNI.new_matrix3x3__SWIG_0(), true);
  }

  public matrix3x3(double s) {
    this(openbabelJNI.new_matrix3x3__SWIG_1(s), true);
  }

  public matrix3x3(vector3 row1, vector3 row2, vector3 row3) {
    this(openbabelJNI.new_matrix3x3__SWIG_2(vector3.getCPtr(row1), row1, vector3.getCPtr(row2), row2, vector3.getCPtr(row3), row3), true);
  }

  public matrix3x3(SWIGTYPE_p_a_3__double d) {
    this(openbabelJNI.new_matrix3x3__SWIG_3(SWIGTYPE_p_a_3__double.getCPtr(d)), true);
  }

  public void GetArray(SWIGTYPE_p_double m) {
    openbabelJNI.matrix3x3_GetArray(swigCPtr, this, SWIGTYPE_p_double.getCPtr(m));
  }

  public matrix3x3 inverse() {
    return new matrix3x3(openbabelJNI.matrix3x3_inverse(swigCPtr, this), true);
  }

  public matrix3x3 transpose() {
    return new matrix3x3(openbabelJNI.matrix3x3_transpose(swigCPtr, this), true);
  }

  public void randomRotation(SWIGTYPE_p_OpenBabel__OBRandom rnd) {
    openbabelJNI.matrix3x3_randomRotation(swigCPtr, this, SWIGTYPE_p_OpenBabel__OBRandom.getCPtr(rnd));
  }

  public double determinant() {
    return openbabelJNI.matrix3x3_determinant(swigCPtr, this);
  }

  public boolean isSymmetric() {
    return openbabelJNI.matrix3x3_isSymmetric(swigCPtr, this);
  }

  public boolean isOrthogonal() {
    return openbabelJNI.matrix3x3_isOrthogonal(swigCPtr, this);
  }

  public boolean isDiagonal() {
    return openbabelJNI.matrix3x3_isDiagonal(swigCPtr, this);
  }

  public boolean isUnitMatrix() {
    return openbabelJNI.matrix3x3_isUnitMatrix(swigCPtr, this);
  }

  public double Get(int row, int column) {
    return openbabelJNI.matrix3x3_Get(swigCPtr, this, row, column);
  }

  public void Set(int row, int column, double v) {
    openbabelJNI.matrix3x3_Set(swigCPtr, this, row, column, v);
  }

  public void SetColumn(int column, vector3 v) {
    openbabelJNI.matrix3x3_SetColumn(swigCPtr, this, column, vector3.getCPtr(v), v);
  }

  public void SetRow(int row, vector3 v) {
    openbabelJNI.matrix3x3_SetRow(swigCPtr, this, row, vector3.getCPtr(v), v);
  }

  public vector3 GetColumn(long col) {
    return new vector3(openbabelJNI.matrix3x3_GetColumn(swigCPtr, this, col), true);
  }

  public vector3 GetRow(long row) {
    return new vector3(openbabelJNI.matrix3x3_GetRow(swigCPtr, this, row), true);
  }

  public void SetupRotMat(double x, double y, double z) {
    openbabelJNI.matrix3x3_SetupRotMat(swigCPtr, this, x, y, z);
  }

  public void PlaneReflection(vector3 norm) {
    openbabelJNI.matrix3x3_PlaneReflection(swigCPtr, this, vector3.getCPtr(norm), norm);
  }

  public void RotAboutAxisByAngle(vector3 axis, double angle) {
    openbabelJNI.matrix3x3_RotAboutAxisByAngle(swigCPtr, this, vector3.getCPtr(axis), axis, angle);
  }

  public void FillOrth(double alpha, double beta, double gamma, double a, double b, double c) {
    openbabelJNI.matrix3x3_FillOrth(swigCPtr, this, alpha, beta, gamma, a, b, c);
  }

  public matrix3x3 findEigenvectorsIfSymmetric(vector3 eigenvals) {
    return new matrix3x3(openbabelJNI.matrix3x3_findEigenvectorsIfSymmetric(swigCPtr, this, vector3.getCPtr(eigenvals), eigenvals), true);
  }

  public static void jacobi(long n, SWIGTYPE_p_double a, SWIGTYPE_p_double d, SWIGTYPE_p_double v) {
    openbabelJNI.matrix3x3_jacobi(n, SWIGTYPE_p_double.getCPtr(a), SWIGTYPE_p_double.getCPtr(d), SWIGTYPE_p_double.getCPtr(v));
  }

}
