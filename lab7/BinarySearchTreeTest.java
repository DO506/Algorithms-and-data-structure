public class BinarySearchTreeTest{
    public static void main(String[] args) {
        BinarySearchTree<String, Integer> bst = new BinarySearchTree<String, Integer>();
        assert(bst.isEmpty()==true);
        bst.put("ABDUL",1);
        System.out.println(bst.get("ABDUL"));
        bst.put("HRITHIK",2);
        bst.put("SAI",3);
        bst.put("SAMAL",6);
        System.out.println(bst.get("SAI"));
        bst.put("TASHI",4);
        assert(bst.contains("SAI")==true);
        System.out.println(bst.size());
        System.out.println(bst.min());
        System.out.println(bst.floor("HRITHIK"));
        System.out.println(bst.floor("HAHA"));
        System.out.println(bst.select(2));
        System.out.println(bst.keys("ABDUL","TASHI"));
        bst.put("CHIMI",5);
        bst.put("SAMAL",4);
        System.out.println(bst.get("SAMAL"));
        bst.put("NIMA",7);
        System.out.println(bst.size());
        System.out.println(bst.get("CHIMI"));
        System.out.println(bst.floor("CHIMA"));
        System.out.println(bst.keys("ABDUL","TASHI"));



        
        //System.out.print(bst.keys());
        System.out.print("\n");

        System.out.println("All test case pass");
    }

}
// Sample Input #1:
// PUT ABDUL 1
// GET ABDUL
// PUT HRITHIK 2
// PUT SAI 3
// PUT SAMAL 6
// GET SAI
// PUT TASHI 4
// SIZe
// MIN
// FLOOR HRITHIK
// FLOOR HAHA
// SELECT 2
// KEYS ABDUL TASHI
// PUT CHIMI 5
// PUT SAMAL 4
// GET SAMAL
// PUT NIMA 7
// SIZE
// GET CHIMI
// FLOOR CHIMA
// PUT SONAM 8
// KEYS ABDUL TASHI


// Sample Output #1:
// 1
// 3
// 5
// ABDUL
// HRITHIK
// ABDUL
// SAI
// ABDUL HRITHIK SAI SAMAL TASHI 
// 4
// 7
// 5
// ABDUL
// ABDUL CHIMI HRITHIK NIMA SAI SAMAL SONAM TASHI