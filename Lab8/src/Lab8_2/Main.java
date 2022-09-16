package Lab8_2;

import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {

		for (Iterator iter = new Containers(){
			String[] names = { "John", "May", "Ryan" };

			public Iterator getIterator() {
				return new Iterator() {
					int index = 0;

					public boolean hasNext() {
						if (index < names.length)
							return true;
						return false;
					}

					public Object next() {
						return names[index++];
					}

					public void remove() {

					}
				};
			}
		}.getIterator(); iter.hasNext();){
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}