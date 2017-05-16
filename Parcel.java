class Parcel {
  public int xAxis;
  public int yAxis;
  public int zAxis;
  public int weight;
  public int sort;
  public int price;
  public int distance;

  public Parcel(int x, int y, int z) {
    xAxis = x;
    yAxis = y;
    zAxis = z;
  }

  public int parcelVolume(int a, int b, int c) {
    return (a * b * c);
  }

  public int sorted(int parcelWeight){
    if (parcelWeight < 20) {
      return sort  = 0;
      //return parcelWeight + " is considered " ;
    } else {
      return sort = 1;
      //return parcelWeight + "is considered ";
    }
  }

}
