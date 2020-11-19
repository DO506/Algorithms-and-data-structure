public class SequestialSearchTest{
	public static void main(String[] args) {
  		SequestialSearchST<String, Integer> st = new SequestialSearchST<String, Integer>();
  		assert(st.isEmpty()==true);
		st.put("Dorji",1);
		st.put("Yangzom",2);
		st.put("Karma",3);
		st.put("Sonam",4);
		st.put("Tenzin",5);
		st.put("Tshering",6);
		st.put("Yeshi",7);
		st.put("Gyeltshen",8);

		assert(st.size()==8);
		
		System.out.print(st.keys());
		System.out.print("\n");
		
		st.delete("Sonam");
		assert(st.size()==7);
		
		assert(st.get("Karma")==3);
		assert(st.contains("Dorji")==true);

  		System.out.println("All test case pass");
  	}

}

      