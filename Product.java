class Product {
  public String artistName;
  public String albumName;
  public int releaseYear;
  public int albumPrice;

  public Product(String artist, String album, int year, int price) {
    artistName = artist;
    albumName = album;
    releaseYear = year;
    albumPrice = price;
  }

  public boolean canAfford(int customerPurse){
    return (albumPrice <= customerPurse);
  }

  public boolean byYear(int customerYear){
    return (releaseYear > customerYear);
  }
}
