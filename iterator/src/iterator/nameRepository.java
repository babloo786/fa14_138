package iterator;


	
	//public iiterator getIterator;

public class nameRepository implements container {
	public String list[][]={{"cell phones","20"},{"jeans","4"}};

	   @Override
	   public iiterator getIterator() {
	      return new nameIterator();
	   }

	   private class nameIterator implements iiterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < list.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return list[index++];
	         }
	         return null;
	      }		
	   }
	}