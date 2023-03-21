package SizeDecorators;

import WrapTypes.Wrap;

public class Medium extends SizeDecorator{

	Wrap wrap;
	
	
	
	public Medium(Wrap wrap) {
		this.wrap = wrap;
	}

	@Override
	public String getDescription() {
		return wrap.getDescription() + ", Orta Seçim";
	}

	@Override
	public double cost() {
		return .50 + wrap.cost();
	}

}
