package SizeDecorators;

import WrapTypes.Wrap;

public class Large extends SizeDecorator{

	Wrap wrap;

	public Large(Wrap wrap) {
		this.wrap = wrap;
	}

	@Override
	public String getDescription() {
		return wrap.getDescription() + ", Büyük Seçim";
	}

	@Override
	public double cost() {
		return .75 + wrap.cost();
	}
	
	
	
}
