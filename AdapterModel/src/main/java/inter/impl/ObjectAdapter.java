package inter.impl;

import adapter.Adapter;
import inter.Target;

public class ObjectAdapter implements Target {

	private Adapter adapter;

	public ObjectAdapter(Adapter adapter) {
		this.adapter = adapter;
	}
	@Override
	public void request() {
		// TODO Auto-generated method stub
		adapter.specificRequest();
	}

}
