package gof.structural.facade;

import javax.xml.bind.annotation.XmlElement;

public class MathOperationParametersDto {

    private int intA;
    private int intB;

    public MathOperationParametersDto() {
    }

    public MathOperationParametersDto(int intA, int intB) {
        this.intA = intA;
        this.intB = intB;
    }

    @XmlElement(name = "intA")
    public int getIntA() {
        return intA;
    }

    @XmlElement(name = "intB")
    public int getIntB() {
        return intB;
    }
}
