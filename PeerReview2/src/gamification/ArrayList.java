package gamification;


import java.util.Collection;

import org.jdom2.Element;


public class ArrayList<E> extends java.util.ArrayList<E> {

	private static final long serialVersionUID = 1L;


	public ArrayList() {super();}
	public ArrayList(Collection<? extends E> c) {super(c);}
	public ArrayList(int initialCapacity) {super(initialCapacity);}

	
	@SuppressWarnings("unchecked")
	public ArrayList<E> clone(){
		ArrayList<E> cloned = new ArrayList<>(this.size());
		
		for (E e : this) {
			if(e instanceof Element){
				cloned.add((E) ((Element) e).clone());
			} else cloned.add(e);
		}
		return cloned;
	}
	
	
	
}
