package ExtraFoodDecorators;

import WrapTypes.Wrap;

public class Fries extends ExtraFoodDecorator{

	Wrap wrap;

	public Fries(Wrap wrap) {
		this.wrap = wrap;
	}

	@Override
	public String getDescription() {
		return wrap.getDescription() + ", Patates Kızartması";
	}

	@Override
	public double cost() {
		return .79 +  wrap.cost();
	}

}
