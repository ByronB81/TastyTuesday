class Parcel {
  public int xAxis;
  public int yAxis;
  public int zAxis;

  public Parcel(int x, int y, int z) {
    xAxis = x;
    yAxis = y;
    zAxis = z;
  }

  public int parcelVolume(int a, int b, int c) {
    return (a * b * c);
  }

}
