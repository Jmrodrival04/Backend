package org.example.domain;
;

public class SpellEffect {

    private String effectType;
    private int intensity;

    public SpellEffect(String effectType, int intensity) {
        this.effectType = effectType;
        this.intensity = intensity;
    }

    public String getEffectType() {
        return effectType;
    }

    public void setEffectType(String effectType) {
        this.effectType = effectType;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "SpellEffect{" +
                "effectType='" + effectType + '\'' +
                ", intensity=" + intensity +
                '}';
    }
}

