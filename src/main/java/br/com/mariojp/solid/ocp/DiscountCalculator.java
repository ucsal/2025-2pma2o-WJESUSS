package br.com.mariojp.solid.ocp;


public class DiscountCalculator {
    private final DiscountPolicy policy;

    public DiscountCalculator(DiscountPolicy policy) {
        this.policy = policy;
    }

    public double apply(double amount) {
        return policy.apply(amount);
    }
}