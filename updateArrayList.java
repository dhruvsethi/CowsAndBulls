public class HelloWorld{

	public ArrayList<String> updateWordList(Map<Character,int> invalidCharMap, ArrayList<String> WordList){
	    ArrayList<String> updatedArrayList = new ArrayList<>();

        for (Map.Entry<Character,int> entry : invalidCharMap.entrySet()) {
            if(entry.getValue()==0) {
                for (int i = 0; i < WordList.size(); i++) {
			        String str=WordList.get(i);
			        if(str.indexOf(entry.getKey())>=0){
			             updatedArrayList.add(str);
			        }
		        }
            }
        }

		return updatedArrayList;
	}

    public static void main(String []args){
        System.out.println("Hello World");
    }
}
