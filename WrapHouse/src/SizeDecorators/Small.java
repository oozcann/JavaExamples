package SizeDecorators;

import WrapTypes.Wrap;

public class Small extends SizeDecorator{

	Wrap wrap;
	
	public Small(Wrap wrap) {
		this.wrap = wrap;
	}

	@Override
	public String getDescription() {
		return wrap.getDescription() + ", Küçük Seçim";
	}

	@Override
	public double cost() {
		return wrap.cost();
	}

}
