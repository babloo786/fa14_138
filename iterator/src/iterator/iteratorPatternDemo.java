package iterator;

public class iteratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nameRepository namesRepository = new nameRepository();

	      for(iiterator iter = namesRepository.getIterator();iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("list : " +name);
	      }
	}

}
