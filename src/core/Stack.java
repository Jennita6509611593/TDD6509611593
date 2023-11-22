package core;
import java.util.ArrayList;
public class Stack implements IStack {
	private ArrayList<Object> elements;
	public Stack() {
		elements = new ArrayList<Object>();
	}
	@Override
	public boolean isEmpty() {
		if(elements != null) {
			if(elements.size()==0)
				return true;
			else return false;
		}
		else return true;
	}

	@Override
	public int getSize() {
		if(elements !=null)
			return elements.size();
		else return 0;
	}

	@Override
	public void push(Object elm) {
		elements.add(elm);
		
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getTop() {
		// TODO Auto-generated method stub
		return elements.get(getSize()-1);
	}
	@Override
	public Object pop() {
		if(!isEmpty()) {
			return elements.remove(getSize()-1);
		}
		else
			return null;
	}
	
	
	

}
