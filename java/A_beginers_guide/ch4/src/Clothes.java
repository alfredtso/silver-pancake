class Clothes {
    int price;
    int season; // use integer to denote the season for now
    String brand;
    String description; // placeholder for some extra info later

}

class ClothesDemo {
    public static void main(String[] args) {

        // blackDress is a variable that can refer to an object: an object pointer ?
        // new operator dynamically allocates: malloc and return a ref to the mem
        Clothes blackDress = new Clothes();
        System.out.println(blackDress);
    }
}
