package ExtraFoodDecorators;

import WrapTypes.Wrap;

public class Cheese extends ExtraFoodDecorator{

	Wrap wrap;
	
	
	
	public Cheese(Wrap wrap) {
		this.wrap = wrap;
	}

	@Override
	public String getDescription() {
		return wrap.getDescription() + ", Ekstra Peynir";
	}

	@Override
	public double cost() {
		return .99 + wrap.cost();
	}

}
