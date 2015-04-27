import java.util.ArrayList;
public class MyStack {
	private ArrayList<String> list = new ArrayList<String>();
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public int getSize(){
		return list.size();
	}
	public Object peek(){
		return list.get(getSize()-1);
	}
	public Object pop(){
		Object o = list.get(getSize()-1);
		list.remove(getSize()-1);
		return o;
	}
	public void push(String o){
		list.add((String) o);
	}
	public ArrayList<String> getList(){
		return list;
	}
	
	@Override
	public String toString(){
		return "Stack:"+list.toString();
	}
}
