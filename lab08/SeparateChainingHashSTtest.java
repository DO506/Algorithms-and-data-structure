public class SeparateChainingHashSTtest{
	 public static void main(String[] args) { 
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        assert(st.isEmpty()==true);
        st.put("ABDUL",1);
        System.out.println(st.get("ABDUL"));
        st.put("HRITHIK",2);
        st.put("SAI",3);
        st.put("SAMAL",6);
        System.out.println(st.get("SAI"));
        st.put("TASHI",4);
        assert(st.contains("SAI")==true);
        System.out.println(st.size());
        System.out.println(st.keys());
        st.put("CHIMI",5);
        st.put("SAMAL",4);
        System.out.println(st.get("SAMAL"));
        st.put("NIMA",7);
        st.delete("SAMAL");
        System.out.println(st.size());
        System.out.println(st.get("CHIMI"));
        System.out.println(st.keys());
        System.out.print("\n");

        System.out.println("All test case pass");
    }
}

    