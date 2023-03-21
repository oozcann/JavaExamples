package ExtraFoodDecorators;

import WrapTypes.Wrap;

public class Drink extends ExtraFoodDecorator{

	Wrap wrap;

	public Drink(Wrap wrap) {
		this.wrap = wrap;
	}

	@Override
	public String getDescription() {
		return wrap.getDescription() + ", İçecek";
	}

	@Override
	public double cost() {
		return 1.19 + wrap.cost();
	}
	
	
	
}
